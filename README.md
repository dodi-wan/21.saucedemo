
# Project final
## Task 21 Jayjay


### Automation Framework: Web UI + API (Cucumber + Java + Gradle)
#### Framework untuk automation testing web (saucedemo).

##### overview:
###### Project how to know difference positive test, negative test, behaviuor expected (expected failed in real case no failed)

###### properties:
- IDE: IntelliJ IDEA
- Build tool: Gradle
- Language: Java
- Test framework: JUnit 5
- plugins: io.qameta.allure
- Dependencies:
  - `org.junit.jupiter:junit-jupiter`
  - `io.cucumber:cucumber-java`, `cucumber-junit-platform-engine`
  - `org.seleniumhq.selenium:selenium-java`
  - `io.github.bonigarcia:webdrivermanager`
  - `io.rest-assured:rest-assured`
  - `io.qameta.allure` 


##### structure
---
 ```markdown
   | Folder/File                    | Deskripsi                                                                                                                                                                                                                                   |
   |--------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
   | `.github/workflows/`           | Konfigurasi GitHub Actions CI/CD, file ci-saucedemo.yml              |
   | `src/main/java/org/com/helper` | helper for web setup browser, setting browser chrome, close browser |
   | `src/main/java/org/com/stepdef`| langkah untuk menjalankan file gherkin disebut stepdef atau 'glue code' pada tahap ini akan memanggil class method page object model di repo atau folder local src/main/java/org/com/pages menyesuaikan behaviour scenario |
   | `src/main/java/org/com/pages`  | berisikan file class java berisikan method locator element, notification, third party, filter, dsb. Tujuannya sebagai ruang isolasi pemisah tugas masing-masing class                                                      |
   | `src/test/resources/features`  | memebuat scenario secara terpisah dengan pendekatan seperti end-user bercerita layaknya kondisi aktual, jika a apakah outputnya a, atau b. seharusnya outputnya c tetaoi a dan sebagainya                                  |
   | `src/test/java/hooks`          | tujuannya untuk menjalankan kode sebelum dan sesudah atau seluruh suite test, agar clean dan terorganisir. seperti menyiapkan url, driver, close connection database dan test tidak terpengaruh dengan test sebelumnya    |
   | `src/test/java/runnerTest`     | untuk menjalankan test secara keseluruhan, per/scenario, beberapa test dengan anotasi. tujuannya untuk memberikan visual hasil test dan memberikan perintah untuk membuat report seperti; allure, cucumber json, html dan sebagainya. |
   | `build.gradle`                 | depedensi konfigurasi Java, Junit, cucumber, web driver manager, selenium, allure and else                                                                                                                                                  |
```

### Setup & Run

1. Clone repository:
   ```bash
   git clone https://github.com/dodi-wan/22.-api-web.git
   cd local folder

2. Build & Test:
   ```bash
   ./gradlew build
   ./gradlew clean test
   ./gradlew allureReport
   ./gradlew allureServe

3. Report local IDE
   ```bash
   go to folder target
    - web.report.html


