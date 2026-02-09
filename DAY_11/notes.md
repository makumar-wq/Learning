# 📝 Notes – JDBC, H2 Database, and MySQL Connection

These are my notes from today.
Today I learned how Java connects to databases using JDBC.
I tried both H2 database and MySQL.
I am writing everything in simple words so I can revise later easily.

---

## 1️⃣ What Is JDBC?

- JDBC stands for **Java Database Connectivity**
- It is used to connect Java programs with databases
- JDBC lets Java talk to databases using SQL

Using JDBC we can:
- Connect to database
- Create tables
- Insert data
- Read data

---

## 2️⃣ Important JDBC Classes

Main classes I used:
- `DriverManager`
- `Connection`
- `Statement`
- `SQLException`

---

## 3️⃣ Database Connection Flow (Simple)

Steps:
1. Create connection URL
2. Provide username and password
3. Use `DriverManager.getConnection()`
4. Get a `Connection` object
5. Use it to run SQL

---

## 4️⃣ H2 Database (In-Memory / File Based)

- H2 is a lightweight Java database
- It can run inside the application
- No need to install anything separately

In my code:
```java
String url = "jdbc:h2:file:./data/demo";
```
This means:

Database is stored locally in a file

Easy for learning and testing

5️⃣ H2 Default Credentials

Password: empty

H2 works quickly and is good for practice.

6️⃣ Connecting to H2 Using JDBC

Used DriverManager.getConnection()

If connection succeeds, JDBC gives a Connection object

Username: sa
```
Connection connection = DriverManager.getConnection(url, username, password);
```
7️⃣ Creating a Statement

Statement is used to send SQL to database

It works like a messenger
```
Statement statement = connection.createStatement();
```
8️⃣ Creating a Table Using SQL

Used CREATE TABLE IF NOT EXISTS

This avoids error if table already exists

```
CREATE TABLE IF NOT EXISTS students (
    id INT PRIMARY KEY,
    name VARCHAR(50)
)
```
9️⃣ Inserting Data into Table

Used INSERT INTO

For insert, we use executeUpdate()

```
int rowsAffected = statement.executeUpdate(insertSQL);
```
🔟 Closing the Connection

Always close the connection

Good practice

Frees resources
```
connection.close();
```

1️⃣1️⃣ MySQL Database Basics

MySQL is an external database

It runs separately from Java

Needs username and password

Connection URL format:

```
jdbc:mysql://hostname:port/databaseName
```
1️⃣2️⃣ Connecting to MySQL Using JDBC

In my code:
```
String url = "jdbc:mysql://localhost:3306/test_db";
```
localhost → database is on same machine

3306 → default MySQL port

test_db → database name

1️⃣3️⃣ MySQL Credentials

Username usually root

Password is what we set during installation

1️⃣4️⃣ Handling Exceptions

Database operations can fail

JDBC throws SQLException

Used try-catch to handle errors

```
catch (SQLException e) {
    e.printStackTrace();
}
```
