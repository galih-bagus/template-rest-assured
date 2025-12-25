# 🚀 Template API Automation Framework – Java & RestAssured

This project is a **REST API automation framework** built using **Java, RestAssured, and TestNG**, following clean code
principles and scalable test architecture.

It focuses on validating API behavior (positive & negative scenarios) with reusable request builders, response assertion
models, and custom assertion utilities.

## 📌 Tech Stack

- Java
- RestAssured
- TestNG
- Maven
- JSON

## 📂 Project Structure

```
src
├── main
│
└── test
    ├── java
    │   ├── config
    │   │   └── Configuration files (base URL, etc.)
    │   │
    │   ├── constants
    │   │   └── Static constants (endpoints, etc.)
    │   │
    │   ├── models
    │   │   ├── request
    │   │   │   └── API request payload models
    │   │   │
    │   │   └── response
    │   │       └── API response assertion models
    │   │
    │   ├── scenarios
    │   │   └── Business-level API scenarios
    │   │
    │   ├── testcase
    │   │   └── Test classes (entry point for test execution)
    │   │
    │   └── utils
    │       └── Utilities (custom assertions, helpers)
    │
    └── resources
        └── Configs, schemas
```

## 🧩 Key Design Principles

**✅ Separation of Concerns**

- Testcase → Test execution
- Scenarios → Business logic flow
- Models → Request/Response representation
- Utils → Reusable utilities
- Constants → Centralized static values

## 📦 Models

**Request Models**

Encapsulate request payloads for clarity and reuse.

```
LoginRequest request = new Login().getUserInvalid();
```

**Response Models**

Each response model validates its own API contract.

```
LoginResponse.assertInvalidLogin(response);
```

## 🧪 Test Flow (AAA Pattern)

```
// Arrange
LoginRequest request = new Login().getUserInvalid();

// Act
Response response = given()
        .contentType(ContentType.JSON)
        .body(request)
    .when()
        .post(Endpoints.login())
    .then()
        .extract()
        .response();

// Assert
LoginResponse.assertInvalidLogin(response);
```

## 🧪 Test Coverage

- ✔ Status code validation
- ✔ Error message validation
- ✔ Negative scenarios (invalid login)
- ✔ Authentication failures
- ✔ Response body verification

## ▶️ How to Run Tests

**Using Maven**

```
mvn test
```

**Using IDE**

- Open test class under testcase
- Right-click → Run

## 📐 Naming Conventions

| Component | Convention       |
|-----------|------------------|
| Package   | lowercase        |
| Class     | PascalCase       |
| Method    | camelCase        |
| Variable  | camelCase        |
| Constants | UPPER_SNAKE_CASE |

## 🔮 Future Enhancements

🔹 Request & Response Specifications

🔹 JSON Schema Validation

🔹 Soft Assertions

🔹 Logging & Reporting (Allure / Extent)

🔹 Environment switching (dev / qa / prod)

🔹 CI/CD integration (GitHub Actions / Jenkins)

## Authors

**API Automation Framework**

Designed for maintainability, readability, and scalability.

- [@galih-bagus](https://www.github.com/galih-bagus)

