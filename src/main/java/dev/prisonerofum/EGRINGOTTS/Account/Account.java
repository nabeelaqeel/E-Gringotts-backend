package dev.prisonerofum.EGRINGOTTS.Account;

import dev.prisonerofum.EGRINGOTTS.Card.Card;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Random;


@Document(collection="Account")            //map to collection in mongodb
@Data                                      //take care of all getter and setter
@AllArgsConstructor                        //constructor with all argument
@NoArgsConstructor                         //constructor with no argument
public class Account<E> {
    //hold data and all class

    @Id                                    //primary key
    private ObjectId id;
    private String userId;
    private String username;
    private String password;
    private String fullName;
    private String DOB;
    private String email;
    private String phone;
    private String address;
    private String pin;
    private double balance;
    private String currency;
    private E user;
    private Card card;

    public void setPin(String pin) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        this.pin = passwordEncoder.encode(pin);
    }

    public boolean checkPin(String pin) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.matches(pin, this.pin);
    }

    public void setPassword(String password) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        this.password = passwordEncoder.encode(password);
    }

    public void generateUserId() {
        Random random = new Random();
        StringBuilder userId = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            int digit = random.nextInt(10);
            userId.append(digit);
        }
        this.userId = userId.toString();
    }

    public void reload(double amount){
        this.balance += amount;
    }

}


