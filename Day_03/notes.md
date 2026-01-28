
## 1. Ternary Operator (One-line Condition)



The ternary operator is a shorthand for simple `if-else` statements. It reduces code clutter when assigning values based on a condition.



**Syntax:**

`type variable = (condition) ? value_if_true : value_if_false;`



**Example:**

```java

int a = 5;

int b = 10;



// Traditional if-else is bulky:

// int max;

// if (a > b) max = a; else max = b;



// Clean Ternary approach:

int max = (a > b) ? a : b; 

System.out.println(max); // Output: 10



```



**⚠️ Note : **



* **Don't Nest:** Avoid `(a > b) ? a : (b > c) ? b : c`. It becomes unreadable fast. Stick to standard `if-else` for complex logic.

* **Return Value:** Unlike `if-else`, a ternary operator *must* return a value or be part of an expression (like inside a `println`).



---



## 2. Increment & Decrement (`++`, `--`)



Used to increase or decrease a variable by 1. The placement of the operator (Prefix vs. Postfix) changes *when* the value updates.



* **Prefix (`++val`):** Update first, then use the value.

* **Postfix (`val++`):** Use the current value first, then update.



**Example:**



```java

int a = 5;

System.out.println(++a); // Prints 6 (Incremented immediately)



int b = 5;

System.out.println(b++); // Prints 5 (Prints current, increments AFTER)

System.out.println(b);   // Prints 6 (Now it holds the new value)



```



**⚠️ Note : **



* Be very careful using these inside mathematical equations (e.g., `int x = a++ * --b;`). It is often better to separate the increment onto its own line for clarity.



---



## 3. Break and Continue



These keywords give me manual control over loops.



* **`break`**: Immediately kills the loop. Execution moves to the code *after* the loop block.

* **`continue`**: Skips the *rest* of the current iteration and jumps back to the top to start the next one.



**Example:**



```java

for (int i = 0; i < 10; i++) {

    if (i % 2 == 0) {

        continue; // Skip even numbers

    }

    if (i > 7) {

        break; // Stop completely if i is greater than 7

    }

    System.out.println(i);

}

// Output: 1, 3, 5, 7



```



---



## 4. The For-Loop



Best used when I know exactly how many times I need to iterate.



**Syntax:**

`for (initialization; condition; modification) { ... }`



**Example:**



```java

// Print numbers 0 to 4

for (int i = 0; i < 5; i++) {

    System.out.println("Index: " + i);

}



```



**⚠️ Note : **



* **Variable Scope:** The variable `i` created in the loop statement (`int i = 0`) **only exists inside the loop**. I cannot try to print `i` after the closing brace `}`.



---



## 5. Switch Statement



A cleaner alternative to multiple `if-else-if` blocks when checking a single variable against specific values.



**Example:**



```java

int val = 2;



switch (val) {

    case 1:

        System.out.println("One");

        break;

    case 2:

        System.out.println("Two");

        break; // <--- Crucial!

    case 3:

        System.out.println("Three");

        break;

    default:

        System.out.println("Unknown");

}



```



**⚠️ Note : **



* **The "Fall-through" Error:** If I forget the `break` statement, Java will execute the matching case **AND** every case after it until it hits a break or the end. Always double-check breaks!



---



## 6. Primitive Data Types



Java has 8 primitive types. I need to memorize the sizes to avoid overflow errors.



| Type | Size | Description | Range (Approx) |

| --- | --- | --- | --- |

| **byte** | 8 bits | Very small integer | -128 to 127 |

| **short** | 16 bits | Small integer | -32k to +32k |

| **int** | 32 bits | Standard integer | -2B to +2B |

| **long** | 64 bits | Large integer | Massive (Use 'L' suffix) |

| **float** | 32 bits | Decimal (low precision) | ~7 digits (Use 'f' suffix) |

| **double** | 64 bits | Decimal (high precision) | ~15 digits (Default) |

| **char** | 16 bits | Single character | Unicode values |

| **boolean** | ~1 bit | True/False | `true` or `false` |



**Example:**



```java

long population = 7000000000L; // Needs 'L' because it's bigger than int

float price = 12.99f;          // Needs 'f' or Java thinks it's a double

char letter = 'A';             // Single quotes for chars



```
**⚠️ Note : **



* **Integer Overflow:** If an `int` calculation exceeds 2 billion, it will wrap around to negative numbers silently. If dealing with large sums, use `long`.
