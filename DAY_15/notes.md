
```md

# Notes — `super`, Polymorphism (References), Casting, and `Object`

## 1) `super`: accessing superclass members
- Use `super.member` to refer to a superclass field/method when a subclass overrides a method or hides a field and you still want the parent version. [web:61]
- Typical use case: call parent implementation inside an overridden method (`super.methodName()`). [web:61]

### Example
```java
class Parent {
  void show() { System.out.println("Parent"); }
}

class Child extends Parent {
  @Override
  void show() {
    super.show();
    System.out.println("Child");
  }
}
```
2) super(...): invoking superclass constructors
A subclass constructor can call a superclass constructor explicitly using super(...). 

Rule: super(...) must be the first statement inside the subclass constructor. 

Example
```
class Vehicle {
  int wheels;

  Vehicle(int wheels) {
    this.wheels = wheels;
  }
}

class Bike extends Vehicle {
  Bike() {
    super(2); // first statement
  }
}
```
This delegates initialization of the superclass part to the superclass constructor.

3) Superclass reference to subclass object (upcasting)
Upcasting is assigning a subclass object to a superclass reference (implicit). 

You can only call members that exist in the reference type at compile time, but overridden method behavior is based on the actual object at runtime (polymorphism). 

```
class A { void m() { System.out.println("A"); } }
class B extends A { @Override void m() { System.out.println("B"); } }

A x = new B();
x.m(); // prints "B"
```
Overridden methods dispatch to the subclass implementation even if the reference is the superclass type. 
4) Accessing fields vs methods through a superclass reference
Methods participate in overriding/polymorphism; fields don’t behave the same way as overridden methods (field hiding is different and generally discouraged). 

If you need specific subclass behavior that isn’t in the superclass type, you’ll need a subclass reference (possibly via casting). 

5) Casting between superclass and subclass
Downcasting is converting a superclass reference to a subclass reference (explicit cast). 

Use instanceof checks before downcasting to avoid ClassCastException. 

Example pattern

```
User u = getUser();
if (u instanceof Admin) {
  Admin a = (Admin) u;
  a.banUser();
}
```

This is a safe way to access subclass-specific methods. 

6) java.lang.Object basics
Object is the root class that provides commonly used methods. 

Common Object methods: equals(Object), hashCode(), toString(), getClass(), plus concurrency-related wait()/notify()/notifyAll(). 

Quick tip: overriding toString()

```
class Student {
  String name;
  int id;

  Student(String name, int id) {
    this.name = name;
    this.id = id;
  }

  @Override
  public String toString() {
    return "Student{name='" + name + "', id=" + id + "}";
  }
}
```
Overriding toString() makes object printing clearer during debugging/logging. 
