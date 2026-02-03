
---

## 📄 notes.md

````markdown
# 📝 Notes – Strings, IDE Basics, and First Project

These are my notes from today.
I tried to write everything in easy words so I can understand later without confusion.

---

## 1️⃣ The String Type

- String is used to store text.
- Example: `"hello"`, `"Java"`, `"coding"`
- String is **not a primitive**, it is an object.
- Strings are **immutable** (cannot be changed after creation).

---

## Useful Methods of String

Some important methods I learned:
- `length()` → gives length of string
- `charAt(index)` → character at given index
- `substring()` → part of string
- `toUpperCase()` / `toLowerCase()`
- `equals()` → compares content

---

## Exceptions While Working with Strings

- `NullPointerException` → string is null
- `StringIndexOutOfBoundsException` → wrong index used
- Need to be careful with indexes and null values

---

## Concatenating Strings

- Using `+` operator
- Numbers automatically convert to string

Example:
```java
String s = "Age is " + 20;
````

---

## Comparing Strings Correctly

* ❌ `==` compares reference
* ✅ `equals()` compares actual value

Always use `equals()` for strings.

---

## 2️⃣ Strings and Arrays

* String can be split using `split()`
* It returns a `String[]`

Example:

```java
String[] words = text.split(" ");
```

---

## Iterating Over a String

* Using `for` loop
* Convert string to char array

Example:

```java
for (char c : text.toCharArray()) {
    System.out.println(c);
}
```

---

## 3️⃣ printf() and String.format()

### printf()

* Used for formatted output
* Uses placeholders like `%d`, `%s`

Example:

```java
System.out.printf("Age: %d", age);
```

---

### String.format()

* Same formatting but returns a string
* Useful when storing formatted text

---

## 4️⃣ Final Variables

* `final` means value cannot change
* Used for constants

Example:

```java
final int MAX = 10;
```

---

## Final Reference Variables

* Reference cannot change
* Object data can still change

---

## When to Use Final

* Constants
* Safety
* Clean code

---

## 5️⃣ IDE Basics

### Brief Background

* Earlier people used simple editors
* IDE makes coding faster and easier

---

## What Is a Modern IDE?

* Editor + compiler + debugger
* Everything in one place

---

## IDE Components

* Project view
* Editor
* Terminal
* Run / Debug tools

---

## 6️⃣ Creating First Project

* Create new project
* Choose Java
* Write `main()` method
* Run program 🎉

---

## Writing First Code

* `main()` is entry point
* `System.out.println()` prints output

---

## 7️⃣ IDE Productivity

### Keyboard Shortcuts

* Saves time
* Faster coding
* Less mouse usage

---

## Dark Mode 🌙

* Easy on eyes
* Looks better

---

## Local Terminal

* Run commands
* Compile and execute programs

---

## 8️⃣ Installation and Setup

* Install IDE
* Setup JDK
* Configure project

---

## IDE Views

* Project View → files
* Editor → code
* Task Description → problem statement

---
