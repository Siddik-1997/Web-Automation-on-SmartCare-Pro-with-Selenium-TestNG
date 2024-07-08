# Web Automation on SmartCare Pro Website with Selenium TestNG

## What is Automation?

Automation is the process of using software tools and scripts to perform tasks that would typically be done manually by a human. In the context of software testing, automation involves using tools to execute test cases and compare the actual results with the expected results automatically.

## Why we use Selenium TestNG for Automation?

Selenium is a popular open-source testing tool widely used for automating web browsers. It allows developers and testers to automate web-based applications' testing across multiple browsers and platforms. Selenium provides a set of APIs to interact with web elements and manipulate their properties and behaviors, making it an ideal tool for automating UI tests.

TestNG is a testing framework for Java that is designed to be more flexible and powerful than JUnit. It supports a wide range of testing functionalities, including unit, integration, and end-to-end testing, as well as parallel execution, data-driven testing, and reporting. TestNG is often used with Selenium to create robust and scalable test automation frameworks.

## Technology used:
- Selenium Webdriver
- TestNG Framework
- Java
- Gradle
- Intellij idea
- Allure

## How to run this project

- Clone this project
- Hit the following command into the terminal:
 ```gradle clean test```
 
- For generating Allure Report use these commands:
```allure generate allure-results --clean -o allure-report``` and
```allure serve allure-results```

## Scenerio:

- Use this link to access the site:https://staging-scweb.arcapps.org/
- Select Province : Lusaka, District : Lusaka, Facility : Dr Watson Dental Clinic
- Search Patient with 111111111
- Click attend to patient
- This should bring you to “Vitals”
- Close the site

## Test case check list based on the Scenerio:

- Login with the valid creds
- Selecting the Province, District and Facility. 
- Search the patient.
- Clicking the attent to patient button
- Check the Vitals
- Close the site

## Allure Report:

![smartCare](https://github.com/Siddik-1997/Web-Automation-on-SmartCare-Pro-with-Selenium-TestNG/assets/123433625/5dd8190b-b7c4-4fed-af46-b1489aab614e)

![smartCare2](https://github.com/Siddik-1997/Web-Automation-on-SmartCare-Pro-with-Selenium-TestNG/assets/123433625/784cdaf2-fcd1-4fbe-9d9f-584bfb8f5ff4)


## Automation Output Video:

https://github.com/Siddik-1997/Web-Automation-on-SmartCare-Pro-with-Selenium-TestNG/assets/123433625/f5c58a78-7dbd-49c1-acac-31be8622f44c



