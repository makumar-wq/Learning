# 🧠 My Notes – Computer Memory Basics

Date: 2-02-26 | Monday
DAY_06

---

## 1. Computer Memory and Its Characteristics

Today I learned that **computer memory** is where data and instructions live while the computer works.

Some important things about memory:
- **Speed** → How fast data comes
- **Size** → How much data it can store
- **Cost** → Faster memory is expensive
- **Volatility** → Some memory forgets data when power is off

I understood that not all memory is same.

---

## 2. Memory Hierarchy

Memory is arranged like a ladder.

Top = very fast but very small  
Bottom = very big but very slow

Order (from fastest to slowest):
1. Registers
2. Cache
3. RAM
4. Secondary memory (HDD / SSD)

Closer to CPU = faster  
Far from CPU = slower

---

## 3. Principle of Locality

This part was interesting 😮

It means:
- If I use something now, I will probably use it again soon
- If I use one memory location, nearby locations may also be used

Two types:
- **Temporal locality** → Same data used again
- **Spatial locality** → Nearby data used

That is why cache works so well.

---

## 4. How Is Computer Memory Managed?

Memory is managed by the system automatically.

What I learned:
- Programs get memory when they start
- Memory is released when program ends
- OS decides where data goes (RAM, cache, etc.)

As a programmer, I should:
- Avoid wasting memory
- Clean unused objects (important later in Java)

---

## 5. Volatile and Non-Volatile Memory

### Volatile Memory
- Loses data when power is off
- Example: RAM, Cache, Registers
- Very fast

### Non-Volatile Memory
- Keeps data even after power off
- Example: HDD, SSD
- Slower but permanent

---

## 6. Registers

- Smallest and fastest memory
- Inside CPU
- Stores instructions and values being used right now

Very expensive but super fast ⚡

---

## 7. RAM (Random Access Memory)

- Main working memory
- Programs run from here
- Data is lost when power is off

More RAM = more programs can run smoothly

---

## 8. Cache Memory

- Between CPU and RAM
- Faster than RAM
- Stores frequently used data

Helps CPU work faster without waiting for RAM.

---

## 9. Main Memory vs Secondary Memory

**Main Memory**
- RAM
- Fast
- Temporary

**Secondary Memory**
- Hard disk / SSD
- Slow
- Permanent storage

---

## 10. Stack Memory

- Stores method calls and local variables
- Works in LIFO (Last In First Out)
- Automatically managed

Fast and safe 👍

---

## 11. Heap Memory

- Stores objects
- Bigger than stack
- Managed by Garbage Collector

Used a lot in Java programs.

---

## 12. Stack vs Heap (Quick Compare)

| Stack | Heap |
|------|------|
| Stores local variables | Stores objects |
| Fast | Slower |
| Auto managed | GC managed |
| Small | Large |

---

