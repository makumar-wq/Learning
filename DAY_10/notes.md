# 📝 Notes – Spring Bean Definition & Basics

These are my notes from today.
Today I learned more deeply about how Spring defines beans
and how Spring understands what objects to create.
I am writing this in simple language so I can revise easily later.

---

## 1️⃣ What Is a Bean Definition?

- A bean definition tells Spring **how to create a bean**
- It is like a blueprint
- Spring reads this info and creates the object

Bean definition contains:
- Class name
- Bean name
- Scope
- Dependencies
- Lifecycle callbacks

---

## 2️⃣ Bean Metadata

Spring needs metadata to manage beans.

Metadata answers:
- Which class?
- How many objects?
- When to create?
- How to destroy?

Spring uses this metadata internally.

---

## 3️⃣ Ways to Define a Bean

Beans can be defined using:
- XML configuration
- Annotations
- Java configuration classes

Spring supports all three.

---

## 4️⃣ Bean Naming

- Every bean has a name
- Name is used to fetch the bean from container
- If name is not given, Spring creates a default name

Bean name must be unique inside the container.

---

## 5️⃣ Bean Scope (More Detail)

Scope decides **how many objects Spring creates**.

Common scopes:
- `singleton` → one object for whole application (default)
- `prototype` → new object every time requested

Scope affects:
- Memory usage
- Object lifecycle

---

## 6️⃣ Bean Dependencies

- Beans often depend on other beans
- Spring resolves dependencies automatically
- This is done using Dependency Injection

Spring makes sure:
- Required beans are created first
- Correct order is followed

---

## 7️⃣ Lazy and Eager Initialization

- **Eager** → bean created at startup (default for singleton)
- **Lazy** → bean created only when needed

Lazy initialization helps:
- Reduce startup time
- Save memory

---

## 8️⃣ Bean Lifecycle (More Clear)

Basic lifecycle steps:
1. Bean definition is read
2. Bean instance is created
3. Dependencies are injected
4. Bean is ready to use
5. Bean is destroyed on shutdown

Spring handles this fully.

---

## 9️⃣ Role of ApplicationContext

- ApplicationContext is the main Spring container
- It manages:
  - Bean creation
  - Dependency injection
  - Lifecycle

Everything starts from the container.

---

## 🔟 Why Bean Definition Is Important

- Spring cannot work without it
- Controls object creation
- Makes application configurable
- Separates logic from configuration

---
