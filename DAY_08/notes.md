# 📝 Notes – Systems, Architecture, and References

These are my notes from today.
I learned about systems, system design basics, different types of architecture,
and also about strong and weak references.
I wrote this in simple words so future me won’t get confused.

---

## 1️⃣ What Is a System?

- A system is a group of parts working together.
- Each part has a role.
- If one part fails, system behavior can change.

Examples:
- Banking system
- E-commerce system
- Operating system

---

## 2️⃣ System Design (Basic Idea)

- System design is about **planning before building**.
- It answers questions like:
  - How will components talk?
  - How will data flow?
  - How will system scale?

Main goals:
- Performance
- Scalability
- Reliability
- Maintainability

---

## 3️⃣ What Is Technology (Tech)?

- Tech is the **tools and platforms** we use to build systems.
- It includes:
  - Programming languages
  - Frameworks
  - Databases
  - Cloud services

Examples:
- Java, Python
- Spring Boot
- MySQL
- AWS

Tech is **how** we build.

---

## 4️⃣ Solution Architecture

- Solution architecture focuses on **solving one problem**.
- It designs how different components work together for a specific solution.

Includes:
- Backend
- Frontend
- Database
- APIs

It answers:
- What services are needed?
- How data moves between them?

---

## 5️⃣ Enterprise Architecture

- Enterprise architecture is **big-picture planning**.
- It looks at the whole organization, not one app.

It includes:
- Business goals
- Processes
- Systems
- Technology standards

Enterprise architecture answers:
- How all systems fit together
- What technologies should be used across company

---

## 6️⃣ Difference Between Tech, Solution, and Enterprise Architecture

- Tech → tools used
- Solution architecture → design for one solution
- Enterprise architecture → design for entire organization

---

## 7️⃣ References in Java (Overview)

- Reference means pointing to an object in memory.
- Java has different types of references to manage memory better.

---

## 8️⃣ Strong Reference

- Default reference type
- Object is not garbage collected if strong reference exists

Example:
```java
Object obj = new Object();
```
9️⃣ Weak Reference

Object can be garbage collected

Used when memory is limited

Use case:

Caches

🔟 Soft Reference

Similar to weak reference

Garbage collected only when memory is low

Better for:

Memory-sensitive caching

1️⃣1️⃣ Phantom Reference

Used for cleanup after object is removed

Cannot access object directly

Mostly used for:

Advanced memory management

1️⃣2️⃣ Why Different References Matter

Helps avoid memory leaks

Improves performance

Gives control over object lifecycle
