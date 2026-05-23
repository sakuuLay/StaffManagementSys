# Staff Management System (SMproject)

## What is this project

This repository contains a Java web application for basic staff management tasks: user login, staff logs, and leave request handling (create, view, update, delete). The codebase uses Servlets and JSP pages and is laid out as a standard Java webapp intended to run on Apache Tomcat.

## Technologies used

- **Java (JDK 8+)**: application logic implemented with Servlets and plain Java classes.
- **JSP / Servlets**: UI pages and controllers are built with JSP and Servlet APIs.
- **Apache Tomcat 9**: reference application server used for deployment (Tomcat config present in the workspace).
- **JDBC**: database access via JDBC (see the connectDB utility in the code for connection details).
- **Standard Java webapp layout**: `WEB-INF`, `web.xml`, `lib/`, and `webapp` JSPs are included.

## How to run

1. Prerequisites:
   - Install JDK 8 or newer.
   - Install Apache Tomcat 9.
   - Create a relational database (MySQL/Postgres/etc.) and update the JDBC connection settings in the project (see `test/src/main/java/ApplyLeave/connectDB.java`).

2. Build / deploy options:
   - IDE (recommended): Import the project as an existing Java Dynamic Web Project (Eclipse) or as a webapp in IntelliJ, update the database config, then run/deploy to a Tomcat run configuration.
   - Manual deploy: Compile the classes (or produce a WAR), then copy the built webapp folder or WAR into Tomcat's `webapps/` folder and start Tomcat.

3. Configure database:
   - Edit the database URL, username, and password in the project's database utility (`test/src/main/java/ApplyLeave/connectDB.java`) or in any configuration place used by your environment.
   - Run any required SQL to create tables expected by the application (no migration scripts included in this repo).

4. Start Tomcat and open the app:
   - Start Tomcat (e.g., using the Tomcat Windows service or the startup script).
   - Open a browser and navigate to `http://localhost:8080/<context-path>/` (replace `<context-path>` with the deployed folder or WAR name). The login page is typically `Login.jsp`.

## Notes

- The repository contains multiple source folders (including `test/`): review the code under `test/src/main/java/ApplyLeave` to find the database connection utility and servlets.
- If you want, I can add a sample SQL schema, a Tomcat `context.xml` datasource example, or prepare a WAR build script — tell me which you prefer.
