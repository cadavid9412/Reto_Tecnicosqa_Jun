Serenity Screenplay Automation Project
This project demonstrates automation testing using the Screenplay design pattern with Serenity BDD and Gradle. It includes sample interactions, questions, and tasks to manipulate a Datepicker on a web application.

Requirements
- Java JDK 11 or higher:
  Ensure you have Java 11 (or another compatible version) installed on your machine. To check, run:
  java -version
- Gradle Wrapper:
  This project includes the Gradle Wrapper (gradlew and the gradle/wrapper directory), so you do not need to install Gradle globally.
- Chrome and ChromeDriver:
  The automation uses Selenium with ChromeDriver for web tests.
- Download the correct version of ChromeDriver that matches your installed version of Chrome.
- Ensure ChromeDriver is accessible in your system PATH or configure its location in your serenity.properties or Gradle tasks.
- IDE (Optional):
  It is recommended to use an IDE like IntelliJ IDEA or Eclipse to assist with code editing and navigation.
  Project Setup
- Clone the repository:
  https://github.com/cadavid9412/Reto_Tecnicosqa_Jun.git

Running Tests
To compile and run the tests and generate a Serenity report, use the Gradle Wrapper included with the project:


./gradlew clean test aggregate


This command performs the following actions:
- clean: Clears any previous build files.
- test: Executes the automated tests.
- aggregate: Generates the Serenity report (by default found in build/reports/serenity)

Running in a CI/CD Environment (GitHub Actions)
The project includes a GitHub Actions workflow file located at .github/workflows/ci.yml that:
- Sets up the environment (checks out the repository, configures JDK 11)
- Executes the build and test tasks
- Generates and uploads the Serenity report as an artifact
  The workflow triggers on every push or pull request to the main branch.
  Additional Considerations
- Code Management:
  Ensure your .gitignore file is properly set up to exclude generated files such as the build/ and .gradle/ directories.
- Code Quality:
  Consider integrating static code analysis tools (Checkstyle, PMD, etc.) to maintain code quality.
- Dependency Updates:
  Periodically review and update the versions of Serenity, JUnit, SLF4J, Selenium, and any other dependencies to keep the project current.
  Contributing
  Contributions and improvements are welcome. If you have suggestions or want to contribute changes, please open an issue or submit a pull request explaining your changes.

This README provides a comprehensive overview of the project setup, execution steps, and best practices. Feel free to modify sections as your project evolves. If you need further details or additional sections, let me know!
