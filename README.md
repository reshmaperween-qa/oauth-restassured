# REST Assured OAuth API Automation

![Java](https://img.shields.io/badge/Java-17-orange)
![Rest Assured](https://img.shields.io/badge/Rest_Assured-API-green)
![TestNG](https://img.shields.io/badge/TestNG-Testing-red)
![Maven](https://img.shields.io/badge/Maven-Build-blue)
![GitHub](https://img.shields.io/badge/GitHub-Version_Control-black)

## 📌 About

This project demonstrates REST Assured API automation using Java.

## ✨ Highlights

| Feature | Description |
|---------|-------------|
| REST API Testing | Automates REST API requests and validations using Rest Assured |
| OAuth 2.0 | Generates and uses OAuth access tokens |
| Request Validation | Supports GET, POST, PUT and DELETE requests |
| Response Validation | Validates status codes, headers and response body |
| JSON Parsing | Uses JsonPath for response extraction |
| Maven | Dependency management and build automation |
| TestNG | Test execution and assertions |
| Reusable Code | Utility classes and reusable methods |

## 🛠 Tech Stack

- Java
- REST Assured
- Maven
- OAuth 2.0
- JsonPath

## 🚀 Features

- OAuth Token Generation
- Dynamic Access Token Extraction
- GET API Testing
- JSON Response Validation

## 📂 Project Structure

```text
oauth-restassured
│
├── src
│   ├── main
│   │   └── java
│   └── test
│       └── java
│
├── postman
├── pom.xml
├── README.md
└── .gitignore
```
## ⚙️ Framework Architecture

```text
        TestNG Tests
              │
              ▼
      OAuth Test Classes
              │
              ▼
    Request Specification
              │
              ▼
      API Request Methods
              │
              ▼
  Request / Response Logging
              │
              ▼
    Response Validation
              │
              ▼
    TestNG / HTML Reports
```
## ▶️ Running Locally

```bash
# Clone the repository
git clone https://github.com/reshmaperween-qa/oauth-restassured.git

# Open the project
cd oauth-restassured

# Install dependencies
mvn clean install

# Run tests
mvn test
```
## 👩‍💻 Author
**Reshma Perween**
