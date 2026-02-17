# Day 13 | 11Feb

## Topics covered
- Using constructors.
- Keyword `this`.
- Default and no-argument constructor.
- Constructor overloading.
- Invoking constructors from other constructors (constructor chaining).
- Packages: basics, avoiding conflicts, importing classes, importing standard classes, static imports, default package.
- Objects & references: immutability, sharing references, nullability.

## Mini code snippet (constructor overloading + chaining)
```java
class Point {
    int x, y;

    Point() {
        this(0, 0);   // calls another constructor
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
