
```md
# Day 13 Notes — Constructors, Packages, and References

## Using constructors
- Constructors initialize objects.
- Constructor name == class name, and it has no return type.

## `this` keyword
- `this.field` clarifies “current object’s field” (useful when parameter names match field names).
- `this(...)` calls another constructor in the same class (constructor chaining).

## Default and no-argument constructor
- If I don’t write any constructor, Java provides a default no-arg constructor.
- If I write at least one constructor, and still need a no-arg one, I must define it explicitly.

## Constructor overloading
- Same constructor name with different parameter lists.
- Helps provide multiple ways to create valid objects.

## Invoking constructors from other constructors
- Use `this(...)` as the first statement in the constructor to delegate initialization.

## Packages (basics)
- `package` statement (if used) must be the first line in the file.
- Packages help organize code and avoid class-name collisions.

## Importing classes
- `import some.package.ClassName;` imports one class.
- `import some.package.*;` imports all public classes in that package (but doesn’t import subpackages).

## Importing standard classes
- Common examples: `java.util.*`, `java.time.*`.

## Static imports
- `import static java.lang.Math.*;` lets me use static members without `Math.` prefix (use sparingly for readability).

## Default package
- Avoid using the default package for anything beyond tiny experiments; it doesn’t scale well.

## Sharing references
```java
Student a = new Student("A");
Student b = a;     // b references the same object
b.name = "B";      // changes the same object that 'a' refers to
