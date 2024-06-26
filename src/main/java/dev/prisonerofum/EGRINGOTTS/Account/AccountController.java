package dev.prisonerofum.EGRINGOTTS.Account;

import dev.prisonerofum.EGRINGOTTS.EmailService;
import dev.prisonerofum.EGRINGOTTS.User.User;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")           //CrossOrigin is used to handle the request from a different origin
@RestController
@RequestMapping("/Account")                                 //Mapper to https://localhost:8080/Account
public class AccountController {
    @Autowired                                              //Auto intialize accountService
    private AccountService accountService;

    @Autowired
    private EmailService EmailService;
    @GetMapping("/home")
    public ResponseEntity<String> home(){
        return new ResponseEntity<String>("Hello, World!", HttpStatus.OK);
    }

    @GetMapping("/{username}")
    public ResponseEntity<Optional<Account<User>>> getUser(@PathVariable String username){
        return new ResponseEntity<Optional<Account<User>>>(accountService.singleAccount2(username), HttpStatus.OK);
    }

    @GetMapping("/login")
    public ResponseEntity<Optional<Account<User>>> login(String username, String password){
        return new ResponseEntity<Optional<Account<User>>>(accountService.checkLogin(username,password), HttpStatus.OK);
    }

    @PostMapping("/signup")
    public ResponseEntity<Optional<Account<User>>> signUp(@RequestParam String fullname,@RequestParam String phone,@RequestParam String DOB,@RequestParam String username, @RequestParam String email, @RequestParam String password, @RequestParam String address,@RequestParam String pin){
        return new ResponseEntity<>(accountService.signUp(fullname,username,phone,email, DOB, password, address,pin), HttpStatus.OK);
    }

    @GetMapping("/email")
    public ResponseEntity<String> getEmail(@RequestParam String to,@RequestParam String subject,@RequestParam String text){
        return new ResponseEntity<String>(EmailService.sendSimpleMessage(to,subject,text), HttpStatus.OK);
    }

    @PostMapping("/verifyPin")
    public ResponseEntity<Boolean> verifyPin(@RequestParam String username, @RequestParam String pin){
        return new ResponseEntity<>(accountService.verifyPin(username, pin), HttpStatus.OK);
    }

    @GetMapping("/expiryDate")
    public ResponseEntity<String> getExpiryDate(@RequestParam String username){
        return new ResponseEntity<>(accountService.getExpiryDate(username), HttpStatus.OK);
    }
    //cannot found by email , username OK
    @GetMapping("/accounts/search")
    public ResponseEntity<List<Account<User>>> findAccountsByContactInfo(@RequestParam String contactInfo) {
        List<Account<User>> accounts = accountService.findAccountsByContactInfo(contactInfo);
        if (accounts.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(accounts);
    }

    @GetMapping("/allAccounts")
    public ResponseEntity<List<Account<User>>> getAllAccount(){
        return new ResponseEntity<>(accountService.getAllAccount(), HttpStatus.OK);
    }
    @GetMapping("/{username}/reload")
    public ResponseEntity<Double> reload(@PathVariable String username, @RequestParam double amount){
        return new ResponseEntity<>(accountService.reload(username, amount), HttpStatus.OK);
    }
    @GetMapping("/userId/{userId}")
    public ResponseEntity<Optional<Account<User>>> getAccountByUserId(@PathVariable String userId){
        return new ResponseEntity<>(accountService.getAccountByUserId(userId), HttpStatus.OK);
    }


}
