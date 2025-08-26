
# Project final
## Task 21 Jayjay


### Automation Framework: Web UI + API (Cucumber + Java + Gradle)
#### Framework untuk automation testing web (saucedemo).

##### overview:
###### Project how to know difference positive test, negative test, behaviuor expected (expected failed in real case no failed)

###### properties:
- intellij idea or IDE
- CI github action
- java
- gradle
- Junit 5
- ci: Github Action
- org.junit:junit-bom:5.10.0
- org.junit.jupiter:junit-jupiter
- junit platform
- cucumber gherkin
- selenium
- github.bonigarcia
- net.java.dev.jna
- allure report 


##### structure
---
 ```markdown
   | Folder/File              | Deskripsi                                      |
   |--------------------------|------------------------------------------------|
   | `.github/workflows/`     | Konfigurasi GitHub Actions CI/CD               |
   | `src/main/java/`         | Utils driver, step definition, page object     |
   | `src/test/java/`         | Step definitions, runners, page objects, tests |
   | `src/test/resources/`    | File .feature                                  |
   | `build.gradle`           | Konfigurasi, task run Gradle                   |
```

### Implement
- intellij idea as code editor
- Gradle as build tool
- java as write code program
- JUnit 5 as framework test tool
- depedencies:
  * selenium for element locator
  * bonigarcia as driver manager
  * cucumber java & junit5 as Behaviour Data Driver integration java and JUnit5
  * net.java as compile code
- create a test thinking like an end user
- seperate every single test scenario
- running test with single a .java class



### Test
- git clone https://github.com/dodi-wan/21.saucedemo.git
- cd repo-name (21.saucedemo)
- in terminal:
  - ./gradlew test
  - ./gradlew allureReport
  - ./gradlew allureServe


