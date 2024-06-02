# E-Gringotts-backend

This is the backend of E-Gringotts project that use Spring Boot 

# Set Up

## 1. Set up your mongoDB

i)Go to [mongodb atlas website](https://www.mongodb.com/cloud/atlas/register)
ii)Sign up your account
iii)Create Project
iv)Create a cluster , choose M0 for a free version
v)click Create Deployment
vi)Choose 'Compass' in choose a connection method and copy the url

## 2. Set up your email
Generate a App password for your email : follow this [guide](https://saurabh-nakoti.medium.com/how-to-set-up-smtp-in-gmail-using-an-app-password-96adffa164b3#:~:text=Generate%20an%20App%20Password%3A&text=In%20the%20%E2%80%9CSecurity%E2%80%9D%20section%2C,%2Dcharacter%20app%2Dspecific%20password.)

## 3. Set up your API key
i)Go to [replicate.com/account/api-tokens](https://replicate.com/account/api-tokens)
ii)Copy your api token

## 4. Set up your .env
i)Make a new file ".env" in directory src/main/resouce
ii)paste content from .env.example in your .env and put your mongoDB credential , email , Replica llama2 api

# Run

Open EGringottsApplication java file and click Run 

# Frontend

[E-Gringotts-frontend](https://github.com/MeTheGreat1474/E-gringotts)
