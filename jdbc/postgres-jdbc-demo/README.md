# Postgres JDBC Demo

This is a simple demo project that shows how to use **PostgreSQL in Docker** and access it with a **Java JDBC application**.

## Project Structure

- `docker-compose.yml`: Starts a Postgres database in Docker.
- `App.java`: Simple Java program to start.
- `PostgresJDBCExample`: Simple Java Class that connects to the database, creates a table, inserts data, and reads data.

## How to use

### 1️⃣ Start PostgreSQL in Docker

```bash
docker-compose up -d
