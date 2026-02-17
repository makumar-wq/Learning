DAY - 14 | 12Feb

# Java Learning Log — OOP + Core Concepts

This repo tracks my daily learning in Java, focused on object-oriented programming and core language features.

## Topics covered
### OOP fundamentals
- Basic principles of OOP, objects, classes, and how they relate. [web:33]
- Declaring new classes, writing fields, creating objects, and creating multiple objects of the same class. [web:33]

### Constructors
- Using constructors, default/no-argument constructor behavior, constructor overloading, and constructor chaining via `this(...)`. [web:10][web:9]
- Using the `this` keyword to reference the current object (and to disambiguate fields vs parameters). [web:9]

### Static vs instance
- Understanding static vs instance members, including class variables, class methods, and class constants. [web:21]
- Static imports (`import static ...`) and when they can reduce verbosity. [web:20]

### Packages and imports
- Basics of packages, importing classes/standard classes, avoiding name conflicts, and why the default package is not ideal for larger codebases. [web:24]

### Encapsulation and access control
- Data encapsulation and using getters/setters to control access to fields. [web:54]
- Access modifiers and access levels: `public`, `protected`, package-private (default), and `private`. [web:54]

### Inheritance
- Extending classes (inheritance) and class hierarchies. [web:43]
- `final` classes (cannot be subclassed) and the idea of restricting inheritance when needed. [web:46]

## Suggested practice
- Build small classes (e.g., `Student`, `BankAccount`, `Point`) using private fields + getters/setters. [web:54]
- Create a base class + subclass to practice inheritance and method reuse. [web:43]
- Organize code into packages and import what you need cleanly. [web:24]
