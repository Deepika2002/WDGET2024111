# Web Table Tracing using Selenium WebDriver

## Description
This project demonstrates how to use Selenium WebDriver to trace a web table on a website and retrieve its data.

## Setup Instructions

### Clone the Repository:
Clone this repository to your local machine using Git:
git clone https://github.com/Deepika2002/WDGET2024111

### Set Up Dependencies:
1. Ensure you have the Java Development Kit (JDK) installed on your system.
2. Add Selenium WebDriver dependency to your project. For Maven, you can add it to your pom.xml file:

```xml
<dependency>
  <groupId>org.seleniumhq.selenium</groupId>
  <artifactId>selenium-java</artifactId>
  <version>3.141.5</version>
</dependency>
<dependency>
  <groupId>org.testng</groupId>
  <artifactId>testng</artifactId>
  <version>7.5.0</version>
  <scope>test</scope>
</dependency>
```

Download the appropriate ChromeDriver executable for your operating system and place it in the project directory or set the path to it in the code.

### **Run the Test:**
Open the `WebTableTest.java` file in your IDE.
Run the main method in `WebTableTest.java`.
The test will launch a Chrome browser, navigate to a webpage with a web table, trace the table, and print its data to the console.

## **Project Structure**
- `src/test/java`: Contains the Java test source code.
  - `WebTableTest.java`: Main test class that traces the web table and retrieves its data.
- `chromedriver`: ChromeDriver executable (downloaded separately).
- `README.md`: Project documentation.
