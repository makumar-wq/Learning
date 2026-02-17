
```md

# Day 12 Notes — Java OOP Basics

## Fundamentals (OOP)
- **Class**: blueprint (defines fields + methods).
- **Object**: an instance created from a class.
- **State**: stored in fields.
- **Behavior**: defined by methods.

## Declaring new classes
- A class groups data (fields) and behavior (methods).
- Keep fields `private` by default; expose behavior via methods (encapsulation).

## Writing fields
- Instance fields belong to each object (each object gets its own copy).
- Use meaningful names and initialize when it makes sense.

## Creating objects
- Use `new ClassName(...)` to create an object.
- Each `new` call creates a separate instance (separate instance state).

## Creating multiple objects
- Same class → many objects → each one can hold different values.
- Assigning one reference to another does not “copy” the object; it copies the reference.

## Static vs instance (what’s the difference?)
- Instance members need an object to use them.
- `static` members belong to the class and are shared across objects.
- Prefer calling static members with the class name: `ClassName.member`.

## Class members
### Class variables
- Shared values: counters, caches, config-like values (careful with global state).

### Class constants
- Use `static final` for constants.
- Naming convention: `UPPER_SNAKE_CASE`.

### Class methods
- Use `static` methods for operations not tied to a specific object state.
- Static methods can’t directly access instance fields/methods without an object reference.

## Questions to self (for revision)
- When should I use `static` vs instance?
- What exactly gets copied when I assign one object variable to another?
- Why do constants use `static final` and not just `final`?
