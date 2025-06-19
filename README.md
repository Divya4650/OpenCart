Selenium Java Test Automation Framework – OpenCart

This repository contains a robust **automation testing framework** for the [OpenCart](https://demo.opencart.com/) e-commerce website. Built with Java, Selenium WebDriver, and TestNG. This project show case my practical automation skills and best practices.

Key Features

Page Object Model (POM) for clean, modular design  
TestNG for structured test execution and suite management  
Log4j for real-time logging and debugging  
config.properties to manage environment settings centrally  
Parameterization using both config files and `testng.xml`  
Scalable test structure with Maven support  
Designed to be CI/CD-ready (Jenkins, GitHub Actions compatible)

Technologies Used

- Java 17+
- Selenium WebDriver
- TestNG
- Log4j (v1.2.17)
- Maven
- ChromeDriver
- Eclipse IDE
- Git + GitHub

Configuration & Logging
`config.properties`

Centralized configuration to manage test data and environment:
properties
baseURL=https://demo.opencart.com/
browser=chrome
username=test@example.com
password=Test@123




 Project Structure

OpenCart/
├── src/
│   ├── main/java/pageObjects/        # Page Object classes for UI elements
│   └── test/java/
│       ├── testCases/                            # TestNG test classes
│       ├── testBase/                              # WebDriver setup and teardown
│       └── utilities/                                  # Config reader & helper utilities
├── src/test/resources/
│   ├── config.properties                    # Stores base URL, browser, credentials
│   └── log4j.properties                        # Logging configuration for Log4j
├── logs                                                 # Log4j-generated test logs
├── testng.xml                                     # Test suite configuration
├── pom.xml                                       # Maven project and dependencies
└── README.md                                 # Project overview and documentation

log4j.properties

Log all events to both console and file:
• Console output: real-time visibility
• File log: saved to /logs/automation.log

Sample Test Cases

IDDescriptionTC001Account registration with valid inputTC002Login with valid credentialsTC003Add Product to shopping cartEach test uses assertions and logging to track the result and success messages.


How to Run the Project

Option 1: From IDE (Eclipse/IntelliJ)
1. Clone the repository:
git clone https://github.com/Divya4650/OpenCart.git
2. Import as Maven project.
3. Run testng.xml as TestNG Suite.
Option 2: From Terminal (using Maven)
    mvn clean test

What This Project Demonstrates

• End-to-end Selenium test automation capability
• Test framework design with real-world structure
• Reusability, maintainability, and logging
• Parameterized and data-driven testing concepts


Author:

Divyalakshmi Kamatham
QA Engineer
https://www.linkedin.com/in/divyalakshmi-kamatham-0226a4254/
divyareddy9115@gmail.com

