# Thymeleaf Basic Example

This is a basic example project using **Spring Boot** and **Thymeleaf** to render dynamic views in a web application.

## Technologies Used

* **Spring Boot**: A framework for building Java applications.
* **Thymeleaf**: A templating engine for Java, integrated with Spring Boot.
* **Maven**: A build automation tool used to manage dependencies.

## Installation

### Prerequisites

* **Java 17** or higher.
* **Maven** installed.

### Clone the Project

```bash
git clone https://github.com/Margomvi/Thymeleaf_Basic_Use_Example.git
```

### Build and run the application

Make sure Maven is installed and then run the following command from the root of the project:

```bash
mvn spring-boot:run
```

### Access the Application

Once the application is running, you can access it at:

```bash
http://localhost:8080/users
```

### Contribution

If you'd like to contribute to this project, please follow the steps below:

* Fork the project.
* Create a new branch (git checkout -b feature/new-feature).
* Make your changes and commit them with an appropriate message following the Conventional Commits guidelines.
* Open a pull request with a clear description of your changes.

### Commit Message Guidelines

This project follows the Conventional Commit guidelines. Below are some examples of commit messages:

* feat: add new functionality
* fix: resolve bug in business logic
* docs: update documentation
* chore: update configuration files
* style: improve code styling
* perf: improve performance
* test: add or modify tests

### Application Details

* The project uses Thymeleaf for rendering dynamic HTML views with the Spring Boot controller.
* The UserController.java class fetches user data and passes it to the Thymeleaf template.
