# Expense Tracker - Spring Boot REST API

A simple backend REST API built using Spring Boot to manage daily expenses.  
This project demonstrates layered architecture (Controller → Service → Model) and RESTful API design.

---

## Tech Stack

- Java 17
- Spring Boot
- Maven
- REST API
- Postman (for API testing)

---

## Project Architecture

Controller → Handles HTTP requests  
Service → Contains business logic  
Model → Represents Expense entity  

Spring Boot manages object creation using IoC (Inversion of Control).

---

## Features

- Add new expense (POST /expenses)
- View all expenses (GET /expenses)
- Auto-increment expense ID
- JSON request & response handling

---

## How to Run

1. Clone the repository
2. Open in IntelliJ IDEA
3. Run `ExpenseTrackerApplication`
4. Access API at:  
   `http://localhost:8080/expenses`

---

## Sample Request (POST)

```http
POST /expenses
Content-Type: application/json

{
  "title": "Dinner",
  "amount": 350,
  "category": "Food"
}
```

---

## Purpose

Built to understand:
- Spring Boot fundamentals
- REST API development
- IoC and Dependency Injection
- Layered backend architecture
