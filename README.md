# Spring Boot CRUD Application - Student Management

This is a simple **CRUD (Create, Read, Update, Delete)** RESTful API built using **Spring Boot**. It manages student records stored in a relational database.

---

## 📦 Features

- Add a new student
- Get all students
- Get student by `rollno`
- Update student details
- Delete student by `rollno`
- Get students by name

---

## 🧾 Technologies Used

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 / MySQL / PostgreSQL (any supported DB)
- Maven

---

## 📁 Project Structure

```bash
com.example.CRUDOp
├── controller
│   └── StudentController.java
├── model
│   └── Student.java
├── repository
│   └── StudentRepository.java
├── service
│   └── StudentService.java
└── CrudOpApplication.java
