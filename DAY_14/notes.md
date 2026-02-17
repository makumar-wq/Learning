# Notes — Java OOP + Core Concepts

## 1) Classes and objects
- A **class** is a blueprint; an object is an instance created from that blueprint. [web:33]
- Creating multiple objects from the same class gives separate instances (separate instance state). [web:33]

## 2) Constructors + `this`
- Constructors initialize objects and are where you set initial state. [web:10]
- If you define no constructors at all, Java provides a default constructor; once you add a constructor, you must define a no-arg constructor yourself if you still need it. [web:10]
- `this.field` refers to the current object’s field and helps when parameter names match field names. [web:9]
- `this(...)` calls another constructor in the same class (constructor chaining), and it must be the first statement in the constructor. [web:9]

### Example (overloading + chaining)
```java
class User {
  private String name;
  private int age;

  User() {
    this("Unknown", 0);
  }

  User(String name) {
    this(name, 0);
  }

  User(String name, int age) {
    this.name = name;
    this.age = age;
  }
}
```
3) Static vs instance
Instance members are used through an object; static members belong to the class and are shared.

Constants are typically static final and named in uppercase (convention), because the value is shared and should not change.

4) Packages, imports, static imports
Packages group related classes and help avoid naming conflicts. 

Use import package.ClassName; to import a class, or import package.*; to import all public types in that package (not subpackages).

Static imports allow using static members without qualifying with the class name (use carefully for readability).

5) Encapsulation + access modifiers
Encapsulation means hiding internal state and exposing controlled access (often via methods like getters/setters).

Access levels: public (everywhere), protected (package + subclasses), package-private/default (package only), private (within the class). 

Getter/Setter mini pattern
java
```
class BankAccount {
  private double balance;

  public double getBalance() { return balance; }

  public void deposit(double amount) {
    if (amount > 0) balance += amount;
  }
}
```

6) Inheritance + final
Inheritance lets a class extend another class to reuse/extend behavior (extends). 

A final class cannot be extended (prevents inheritance). 
