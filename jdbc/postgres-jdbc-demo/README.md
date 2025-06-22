# Postgres JDBC Demo

This is a simple demo project that shows how to use **PostgreSQL in Docker** and access it with a **Java JDBC application**.

## Project Structure

- `docker-compose.yml`: Starts a Postgres database in Docker.
- `App.java`: Simple Java program to start.
- `PostgresJDBCExample`: Simple Java Class that connects to the database, creates a table, inserts data, and reads data.

## Learnings
I learned a lot from some mistakes in this project.

### Error:
#### Docker:
I first had to understand how to properly create a Docker file and how to use Docker and the IDE correctly.

#### Driver:
java.sql.SQLException: No suitable driver found for jdbc:postgresql

I forgot to add the dependency for the PostgreSQL JDBC driver "Postgresql" to pom.xml.
Without the driver, Java cannot connect to Postgresql.


## How to use

### 1️⃣ Start PostgreSQL in Docker

```bash
docker-compose up -d
