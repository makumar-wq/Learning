DAY - 15 | 13Feb

# Java Learning Log — Inheritance, `super`, Casting, and `Object`

This repo tracks my learning on Java inheritance, working with superclass/subclass references, and the core `java.lang.Object` class.

## Topics covered

### 1) `super` keyword (inheritance)
- Accessing superclass fields and methods using `super`. [web:61]
- Invoking the superclass constructor using `super(...)`, and the rule that it must be the first statement in the subclass constructor. [web:61]

### 2) Subclass objects via superclass references (polymorphism)
- Referring to a subclass object using a superclass reference (upcasting). [web:65]
- Accessing members through a superclass reference (what you can/can’t call). [web:65]
- Casting between superclass and subclass (downcasting when needed, and using it carefully). [web:68]

### 3) The `Object` class
- Instantiating/understanding the `Object` class as the root of the class hierarchy. [web:69]
- Methods provided by `Object` like `equals`, `hashCode`, `toString`, `getClass`, `wait/notify`. [web:69]

## Mini examples

### `super` for method + constructor
```java
class Animal {
  Animal(String type) {
    System.out.println("Animal type: " + type);
  }

  void sound() {
    System.out.println("Some sound");
  }
}

class Dog extends Animal {
  Dog() {
    super("Dog"); // must be first statement in constructor
  }

  @Override
  void sound() {
    super.sound(); // call parent version
    System.out.println("Bark");
  }
}
