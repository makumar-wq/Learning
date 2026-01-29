## 1️⃣ Writing a Java Program 

Every Java program starts from the `main()` method.

Example:
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}
## 2️⃣ Compilation and Running ⚙️

Java code does not run directly.

Steps:

1. I write code in `.java` file
2. Compiler converts it into `.class` file (bytecode)
3. JVM runs the bytecode

This is why Java works on different computers.

---
```

## 3️⃣ Java Virtual Machine (JVM) 🧠

JVM is like a machine inside my computer.

It:

* reads bytecode
* executes instructions
* handles memory

Different OS → different JVM
Same bytecode → runs everywhere 👍

---

## 4️⃣ JDK, JRE, and JVM 🔗

* **JVM** → runs Java programs
* **JRE** → JVM + libraries
* **JDK** → JRE + tools to write programs

Simple order:

```
JDK → JRE → JVM
```

To write Java code, I must have **JDK**.

---

## 5️⃣ Integer Types: Basics 🔢

Java has different integer types.

| Type  | Use                |
| ----- | ------------------ |
| byte  | very small numbers |
| short | small numbers      |
| int   | normal numbers     |
| long  | very big numbers   |

Example:

```java
int age = 20;
long population = 7000000000L;
```

`L` is needed for long values.

---

## 6️⃣ Declaring Variables and Assigning Values 📦

A variable stores data.

Example:

```java
int x = 10;
x = 15;
```

First I declare, then I can change the value.

---

## 7️⃣ Binary Arithmetic Operators ➕➖✖️➗

Binary operators work on **two values**.

* `+` add
* `-` subtract
* `*` multiply
* `/` divide
* `%` remainder

Example:

```java
int a = 10;
int b = 3;
System.out.println(a % b); // 1
```

---

## 8️⃣ Writing Complex Expressions 🤯

Java follows rules when many operators are together.

Example:

```java
int result = 10 + 2 * 3;
```

Multiplication happens first.
Result is `16`.

---

## 9️⃣ Unary Operators ➕➖

Unary operators work on **one value**.

* `+a`
* `-a`
* `++a`
* `--a`

Example:

```java
int x = 5;
x = -x; // now x is -5
```

---

## 🔟 Operator Precedence 📊

Java decides which operation runs first.

Simple order:

1. `()`
2. `* / %`
3. `+ -`
4. comparisons
5. logical operators

When confused, I should use brackets.

---

## 1️⃣1️⃣ Using ++ and -- 🔁

Two forms:

* Prefix: `++a`
* Postfix: `a++`

Example:

```java
int a = 5;
System.out.println(a++); // 5
System.out.println(a);   // 6
```

Better to avoid using these inside big expressions.

---

## 1️⃣2️⃣ Boolean Type ✅❌

Boolean stores only:

* `true`
* `false`

Example:

```java
boolean isJavaFun = true;
```

Used in conditions.

---

## 1️⃣3️⃣ Logical Operators 🧠

* `&&` → AND
* `||` → OR
* `!` → NOT

Example:

```java
if (age > 18 && hasID) {
    System.out.println("Allowed");
}
```

---

## 1️⃣4️⃣ Short-Circuiting ⚡

Java stops checking when result is already known.

Example:

```java
if (a != 0 && b / a > 2)
```

If `a` is `0`, second part is not checked.
This avoids errors.

---

## 1️⃣5️⃣ Relational Operators 📏

Used to compare values.

* `==`
* `!=`
* `<`
* `>`
* `<=`
* `>=`

Example:

```java
boolean bigger = 10 > 5;
```

---

## 1️⃣6️⃣ Characters and Codes 🔤

`char` stores one character.

Example:

```java
char ch = 'A';
```

Characters are stored as numbers (Unicode).

```java
char c = 65; // A
```

---

## 1️⃣7️⃣ Escape Sequences 🪄

Used inside strings.

* `\n` new line
* `\t` tab
* `\"` double quote

Example:

```java
System.out.println("Hello\nJava");
```

---

## 1️⃣8️⃣ Reading Numbers from Input ⌨️

Using `Scanner`:

```java
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
```

Java waits for user input.

---

