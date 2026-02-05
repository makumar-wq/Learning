# 📝 Notes – Spring Beans Basics

Today I started learning about Spring Framework basics,
especially what beans are and how Spring manages objects.


---

## 1️⃣ What Is Spring?

- Spring is a framework for Java
- It helps in building applications easily
- It manages objects for us instead of us creating them manually

Spring mainly helps with:
- Object creation
- Object dependency
- Object lifecycle

---

## 2️⃣ What Is a Bean?

- A bean is **an object managed by Spring**
- Spring creates the object, stores it, and gives it when needed
- Bean is not special by itself, Spring makes it special

In simple words:
> Any object that Spring manages is called a bean

---

## 3️⃣ Bean Container

- Spring uses a **container** to manage beans
- The container holds all beans

Main container:
- **ApplicationContext**

The container:
- Creates beans
- Injects dependencies
- Destroys beans when app stops

---

## 4️⃣ Configuration Metadata

Spring needs instructions to know:
- Which objects to create
- How to create them
- How they are connected

This info is called **configuration metadata**

It can be written using:
- XML
- Annotations
- Java configuration classes

---

## 5️⃣ Inversion of Control (IoC)

- Normally, we create objects using `new`
- In Spring, Spring creates objects for us

This is called **Inversion of Control**

Meaning:
- Control is given to Spring
- Not the developer

---

## 6️⃣ Dependency Injection (DI)

- One object needs another object to work
- Spring injects that dependency automatically

Types:
- Constructor injection
- Setter injection
- Field injection

This makes code:
- Loose coupled
- Easy to test
- Easy to maintain

---

## 7️⃣ Bean Definition

- Bean definition tells Spring:
  - Class name
  - Scope
  - Dependencies

Spring reads the definition and creates the bean.

---

## 8️⃣ Bean Scopes (Basic Idea)

Some common scopes:
- **singleton** → one object for whole app (default)
- **prototype** → new object every time

Scope defines:
- How many objects Spring creates

---

## 9️⃣ Bean Lifecycle (Basic Understanding)

Steps:
1. Bean is created
2. Dependencies injected
3. Bean is ready to use
4. Bean destroyed when app stops

Spring manages this automatically.

---

## 🔟 Why Use Spring Beans?

- No manual object creation
- Clean code
- Better structure
- Easy dependency management

---

## ✅ Final Thoughts

- Bean = object managed by Spring
- Spring controls object lifecycle
- IoC and DI are core ideas
- Spring reduces boilerplate code
