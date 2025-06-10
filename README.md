# Serenity Screenplay Automation Project

This project demonstrates automation testing using the Screenplay design pattern with Serenity BDD and Gradle. It includes sample interactions, questions, and tasks to manipulate a Datepicker on a web application.

---

## 🛠️ Requirements

- **Java JDK 11 or higher**  
  Ensure you have Java 11 (or another compatible version) installed.  
  To verify, run:
  ```bash
  java -version
  ```

- **Gradle Wrapper**  
  This project includes the Gradle Wrapper (`gradlew` and the `gradle/wrapper` directory), so you do **not** need to install Gradle globally.

- **Chrome & ChromeDriver**
  - The automation uses Selenium with ChromeDriver for web tests.
  - Download the correct version of [ChromeDriver](https://chromedriver.chromium.org/downloads) that matches your installed version of Chrome.
  - Ensure ChromeDriver is accessible in your system `PATH` or configure its location in `serenity.properties` or within your Gradle tasks.

- **IDE (Optional)**  
  Recommended: IntelliJ IDEA, Eclipse, or another Java-friendly IDE for better code navigation and editing.

---

## 🚀 Project Setup

Clone the repository:

```bash
git clone https://github.com/cadavid9412/Reto_Tecnicosqa_Jun.git
cd Reto_Tecnicosqa_Jun
```

---

## ✅ Running Tests

To compile, run the tests, and generate a Serenity report, use the Gradle Wrapper:

```bash
./gradlew clean test aggregate
```

This command performs the following tasks:

- `clean`: Clears previous build files.
- `test`: Executes the automated test cases.
- `aggregate`: Generates the Serenity report (default location: `build/reports/serenity`)

---

## 🔁 Running in a CI/CD Environment (GitHub Actions)

This project includes a GitHub Actions workflow at `.github/workflows/ci.yml` that:

- Sets up the environment (checks out the repo, configures JDK 11)
- Executes the build and test tasks
- Generates and uploads the Serenity report as a GitHub artifact

The workflow runs automatically on **push** or **pull request** events targeting the `main` branch.

---

