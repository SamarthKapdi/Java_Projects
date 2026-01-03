# Java Projects Repository

This repository aggregates multiple Java learning and practice projects covering core Java, collections, threading, JDBC, networking, Java 8, OOP, and JSP/Servlet web applications. It is intended for Java developers (students, early-career, and anyone revising fundamentals) to read, run, and extend examples without altering the original code logic.

> Important: The code has not been modified. This README guides you through exploring and running what’s already completed.

---

## What’s Inside

- **Java Workspace/**: Core Java exercises and topics (JavaBasics, Collections, Threading, OOP, IO, Java 8, NPTEL practice). Typical structure follows Eclipse projects with `src/` and `bin/`.
- **JDBC Project/**: JDBC examples (beans, models, and test classes) demonstrating CRUD and simple data access logic.
- **Java Networking/**: Networking-related code and modules.
- **jsp-servlet/** and **jsp-workspace/** (plus variants): JSP/Servlet web apps configured for Tomcat with typical `src/main/java` and `src/main/webapp` layout.

Many folders include Eclipse metadata (e.g., `.project`, `.classpath`, `.settings/`) to simplify IDE import.

---

## Prerequisites

- **JDK**: Java 8+ installed and on PATH. Recommended: Java 11 or Java 17 for IDEs.
- **IDE**: Eclipse IDE (projects were created in Eclipse) or IntelliJ IDEA.
- **Web Container**: Apache Tomcat 9 for JSP/Servlet projects.
- **Database**: MySQL for JDBC examples (if you want to run DB-backed demos). A connector JAR is present in some web projects under `WEB-INF/lib/`.

---

## Getting Started

### 1) Import Projects into an IDE

- Eclipse: `File → Import → Existing Projects into Workspace`, select the folder (e.g., `Java Workspace/JavaBasics`, `JDBC Project/Java-JDBC`, `jsp-servlet/Dynamic-web-project`).
- IntelliJ IDEA: `File → New → Project from Existing Sources…`, select the project folder; if asked, treat as a plain Java project.

### 2) Run Console Examples

- Locate `src/` packages under each topic (e.g., `Java Workspace/JavaBasics/src/com/java/` or `Java Workspace/JavaCollection/src/com/rays/`).
- Choose a class with a `main(String[] args)` method and run directly from the IDE.
- If running from terminal (single-file quick check):

```bash
# Example (adjust paths and classnames)
javac -d out src/com/java/HelloSamarth.java
java -cp out com.java.HelloSamarth
```

### 3) Run JDBC Examples

- Import `JDBC Project/Java-JDBC` into the IDE.
- Ensure MySQL is running and a test database/schema exists.
- Update connection details inside model classes if required (host, port, user, password, schema).
- Run test classes like `TestUserModel` or `TestMarksheetModel` from the IDE.

### 4) Run JSP/Servlet Projects

- Import a web project (e.g., `jsp-servlet/Dynamic-web-project` or `jsp-workspace/Web-Project`).
- Configure an **Apache Tomcat 9** server in your IDE.
- Add the project to the server and **Start** Tomcat.
- Access the app in your browser (e.g., `http://localhost:8080/Dynamic-web-project/` or project context root configured by the IDE).

Notes:
- Some projects include `WEB-INF/lib/mysql-connector-j-8.0.31.jar` to simplify JDBC usage in web apps.
- If a context root differs, check the server configuration under the `Servers/` folder and your IDE’s deployment settings.

---

## How to Navigate the Code

- **Topic-first**: Start in `Java Workspace/` by picking a topic folder (Basics, Collection, Thread, OOP, IO, Java 8) and browse classes under `src/`.
- **Exercises**: The `com.rays.exercise.javabasics` package contains structured exercises (e.g., `ArmstrongNumber`, `PrimeCheck`, sorting, arrays).
- **Data Access**: In `JDBC Project/Java-JDBC/src/com/rays/jdbcpreparedstatement/`, read `UserModel.java`, `MarksheetModel.java`, and corresponding test classes to understand DAO patterns.
- **Web Layer**: In web projects, look under `src/main/java/com/rays/ctl` for controllers/servlets and `src/main/webapp` for JSP views.

---

## Completed Work Highlights

- Multiple console-based programs demonstrating algorithms, number theory checks, array operations, and sorting.
- JDBC models and tests illustrating prepared statements, beans, and simple data operations.
- JSP/Servlet samples with forms, lists, and basic MVC structure.
- Eclipse project metadata to allow direct import without manual setup.

> All code is preserved as-is. This README only adds documentation.

---

## Troubleshooting

- **ClassNotFoundException**: Ensure compile output (`bin/` or `out/`) is on your run classpath.
- **Database connectivity**: Verify MySQL service is running, credentials are correct, and connector JAR is available.
- **Tomcat issues**: Match Tomcat version (9 recommended), clear the server’s `wtpwebapps` temp and redeploy if stale artifacts appear.
- **Encoding/Line endings**: Git on Windows may report CRLF/LF changes; these do not affect program logic.

---

## Next Steps (Optional)

- Add unit tests (e.g., JUnit) around core algorithms.
- Externalize DB configs (properties or environment variables).
- Introduce build tools (Maven/Gradle) for unified builds.
- Containerize a web app for consistent runtime.

---

## Repository Maintenance

This README was added to document the existing projects without modifying code. If you contribute, prefer non-invasive changes (docs, tests, CI) unless explicitly working on a feature branch.
