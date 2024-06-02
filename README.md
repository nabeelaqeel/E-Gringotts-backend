# E-Gringotts: A Magical Banking Experience
<p align="center">
<img src="/src/main/resources/wallpaperflare-cropped.jpg">
</p>

Welcome to E-Gringotts, a digital banking solution designed specifically for the magical community of Wizards and Witches. Immerse yourself in our enchanting banking website, inspired by the captivating universe of Harry Potter, and discover the marvels of the Muggle's Magic, also known as the Internet.

This repository contains the backend of the E-Gringotts project, built with Spring Boot.

## Getting Started

### 1. MongoDB Setup

Follow these steps to set up your MongoDB:

i) Visit the [MongoDB Atlas website](https://www.mongodb.com/cloud/atlas/register) and sign up for an account.<br></br>
ii) Create a new project.<br></br>
iii) Create a cluster, selecting M0 for the free version.<br></br>
iv) Click on 'Create Deployment'.<br></br>
v) Choose 'Compass' as the connection method and copy the provided URL.<br></br>

### 2. Email Setup

Generate an App password for your email by following this [guide](https://saurabh-nakoti.medium.com/how-to-set-up-smtp-in-gmail-using-an-app-password-96adffa164b3#:~:text=Generate%20an%20App%20Password%3A&text=In%20the%20%E2%80%9CSecurity%E2%80%9D%20section%2C,%2Dcharacter%20app%2Dspecific%20password.).

### 3. API Key Setup

i) Visit [replicate.com/account/api-tokens](https://replicate.com/account/api-tokens).<br></br>
ii) Copy your API token.

### 4. Environment Variables Setup

i) Create a new file named ".env" in the `src/main/resources` directory.<br></br>
ii) Copy the content from `.env.example` into your `.env` file and replace the placeholders with your MongoDB credentials, email, and Replica API token.

## Running the Application

To run the application, open the `EGringottsApplication` Java file and click 'Run'.

## Frontend

The frontend of the E-Gringotts project can be found [here](https://github.com/MeTheGreat1474/E-gringotts).