# E-Gringotts
<p align=”center”>
<img src="/src/main/resources/wallpaperflare-cropped.jpg">
</p>
Within the enchanted universe of Wizarding World and beyond, the absence of a digital banking solution tailored to the needs of Wizards and Witches has been keenly felt. Enlist yourself into our Magical Banking Website themed around the mystifying universe of the Harry Potter and expose yourself to the wonders of Muggle's Magic called the Internet.<br></br>

This is the backend of E-Gringotts project that use Spring Boot.

# Set Up

## 1. Set up your mongoDB

i) Go to [mongodb atlas website](https://www.mongodb.com/cloud/atlas/register)<br></br>
ii) Sign up your account<br></br>
iii) Create Project<br></br>
iv) Create a cluster , choose M0 for a free version<br></br>
v) click Create Deployment<br></br>
vi) Choose 'Compass' in choose a connection method and copy the url<br></br>

## 2. Set up your email
Generate a App password for your email : follow this [guide](https://saurabh-nakoti.medium.com/how-to-set-up-smtp-in-gmail-using-an-app-password-96adffa164b3#:~:text=Generate%20an%20App%20Password%3A&text=In%20the%20%E2%80%9CSecurity%E2%80%9D%20section%2C,%2Dcharacter%20app%2Dspecific%20password.)

## 3. Set up your API key
i) Go to [replicate.com/account/api-tokens](https://replicate.com/account/api-tokens)<br></br>
ii) Copy your api token

## 4. Set up your .env
i) Make a new file ".env" in directory src/main/resouce<br></br>
ii) paste content from .env.example in your .env and put your mongoDB credential , email , Replica llama2 api

# Run

Open EGringottsApplication java file and click Run 

# Frontend

[E-Gringotts-frontend](https://github.com/MeTheGreat1474/E-gringotts)
