# Expense Tracker API (Spring Boot + MySQL)

A production-ready REST API for managing expenses, built using Spring Boot, JPA, and MySQL.

This project demonstrates clean architecture, validation, global exception handling, and environment-based configuration for deployment.

---

## Tech Stack

- Java 17
- Spring Boot 3
- Spring Data JPA (Hibernate)
- MySQL
- Maven
- RESTful APIs
- Git & GitHub

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
- Environment variable-based configuration for deployment

---

## Project Structure

```
controller  → REST endpoints
service     → Business logic
repository  → JPA data access
model       → Entity classes
exception   → Global exception handling
```

---

## Running Locally

1. Clone repository

```
git clone https://github.com/ruchitkumar1093/expense-tracker.git
```

2. Configure MySQL

Create database:

```
CREATE DATABASE expense_tracker;
```

3. Update `application-dev.properties`:

```
spring.datasource.username=your_username
spring.datasource.password=your_password
```

4. Run application:

```
mvn spring-boot:run
```

Server runs at:

```
http://localhost:8080
```

---

## Sample API Endpoints

### Create Expense

POST `/expenses`

```json
{
  "title": "Dinner",
  "amount": 350,
  "category": "Food"
}
```

---

### Get All Expenses

GET `/expenses`

---

### Get Expense by ID

GET `/expenses/{id}`

---

## 🛠 Production Configuration

Production profile uses environment variables:

```
DB_URL
DB_USERNAME
DB_PASSWORD
PORT
```

This makes the application deployment-ready for cloud platforms.

---

## Purpose of This Project

This project was built to demonstrate:

- Clean backend architecture
- Database integration with JPA
- Validation and structured error handling
- Profile-based configuration
- Production-ready coding practices

---

## Author

Ruchit Kumar  
MCA Student | Backend Developer | Java & Spring Boot
