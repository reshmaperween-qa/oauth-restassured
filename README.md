# REST Assured OAuth API Automation

![Java](https://img.shields.io/badge/Java-17-orange)
![Rest Assured](https://img.shields.io/badge/Rest_Assured-API-green)
![TestNG](https://img.shields.io/badge/TestNG-Testing-red)
![Maven](https://img.shields.io/badge/Maven-Build-blue)
![GitHub](https://img.shields.io/badge/GitHub-Version_Control-black)

## 📊 View Report

🚧 Live report will be added soon.

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
## 🔄 API Test Workflow

```text
TestNG Test
      │
      ▼
Request Specification
      │
      ▼
REST Assured Request
      │
      ▼
API Response
      │
      ▼
Response Validation
      │
      ▼
Test Report
```
## ⚙️ Configuration

| Configuration | Description |
|--------------|-------------|
| Java | JDK 17 or above |
| Maven | Dependency Management |
| TestNG | Test Execution |
| REST Assured | API Automation |
| IDE | Eclipse / IntelliJ IDEA |

## ▶️ Running Locally

Clone the repository:

```bash
git clone https://github.com/reshmaperween-qa/oauth-restassured.git
```

Go to the project folder:

```bash
cd oauth-restassured
```

Install dependencies:

```bash
mvn clean install
```

Run the test suite:

```bash
mvn test
```
## 📊 Reporting

After execution, the framework generates:

- ✅ TestNG Report
- ✅ Console Execution Logs
- ✅ Request & Response Logs
- ✅ API Validation Results

Report Location:

```text
test-output/index.html
```
## 🔄 CI/CD

This framework can be integrated with:

- Jenkins
- GitHub Actions
- Maven

## 📷 Screenshots

### Test Execution

> Add your test execution screenshot here.

### Test Report

> Add your TestNG or Extent Report screenshot here.

### API Response

> Add your API response screenshot here.

---

### ⭐ Thanks for visiting!

If you found this project useful, please consider giving it a ⭐ on GitHub.

**Made with ❤️ by Reshma Perween**
