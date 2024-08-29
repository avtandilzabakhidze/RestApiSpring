# Student REST API Spring Boot Project

## Description

This project is a simple REST API built with Spring Boot that manages `Student` entities. It demonstrates the use of Spring Boot with JPA for database operations, and it includes basic CRUD operations for managing student records. The application uses a PostgreSQL database and provides endpoints to retrieve student information.

## Features

- **Student Entity Management:** Manage student records with fields like `name`, `email`, `dob` (date of birth), and `age`.
- **In-Memory Database Initialization:** Pre-populates the database with sample student records on application startup.
- **RESTful Endpoints:** Provides a REST API endpoint to retrieve a list of all students.

## Project Structure

### Entity

- **`Student`**: Represents a student with fields for `id`, `name`, `email`, `dob`, and `age`. It uses JPA annotations for database mapping.

### Configuration

- **`StudentConfig`**: Configures initial data for the application. It adds sample students to the database when the application starts.

### Controller

- **`StudentController`**: Provides REST API endpoints for managing students.
  - `GET /api/v1/students` - Retrieves a list of all students.

### Repository

- **`StudentRepository`**: Extends `JpaRepository` to provide CRUD operations for `Student` entities.

### Service

- **`StudentService`**: Contains business logic for handling student data. It retrieves the list of students from the repository.
