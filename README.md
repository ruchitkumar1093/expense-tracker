# Expense Tracker API

A production-ready REST API for managing expenses, built using Spring Boot, JPA, and profile-based configuration for cloud deployment.

This project demonstrates clean backend architecture, validation, global exception handling, Docker containerization, and environment-based production configuration.

---

## Tech Stack

- Java 17
- Spring Boot 3.2.5
- Spring Data JPA (Hibernate)
- MySQL (Development)
- PostgreSQL (Production - Neon)
- Docker
- Maven
- RESTful APIs
- Git & GitHub
- Render (Deployment)

---

## Features

- Create Expense
- Get All Expenses
- Get Expense by ID
- Update Expense
- Delete Expense
- Input validation using Jakarta Validation
- Structured error responses using Global Exception Handler
- Dev & Prod profile separation
- Environment variable-based configuration
- Dockerized backend deployment

---

## Project Structure

controller  → REST endpoints  
service     → Business logic  
repository  → JPA data access  
model       → Entity classes  
exception   → Global exception handling  

---

## Running Locally (Development Mode)

### 1️. Clone Repository

git clone https://github.com/ruchitkumar1093/expense-tracker.git

### 2️. Create MySQL Database

CREATE DATABASE expense_tracker;

### 3️. Configure application-dev.properties

spring.datasource.username=your_username  
spring.datasource.password=your_password  

### 4️. Run Application

mvn spring-boot:run

Server runs at:

http://localhost:8080

---

## Production Configuration

Production profile uses environment variables:

- DB_URL
- DB_USERNAME
- DB_PASSWORD
- PORT

Activated via:

SPRING_PROFILES_ACTIVE=prod

This makes the application deployment-ready for cloud platforms like Render.

---

## Docker Support

The project includes a production-ready Dockerfile.

Build & Run locally (optional):

docker build -t expense-tracker .  
docker run -p 8080:8080 expense-tracker  

---

## Deployment Architecture

User → Render Web Service (Dockerized Spring Boot)  
               ↓  
          Neon PostgreSQL  

---

## Purpose of This Project

This project demonstrates:

- Clean layered backend architecture
- Multi-database profile configuration
- Cloud-ready production setup
- Docker containerization
- Environment-based secure configuration
- Real-world deployment practices

---

## Author

Ruchit Kumar  
MCA Student | Backend Developer | Java & Spring Boot
