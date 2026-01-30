

### Instantiation

```java
numbers = new int[5];
```

### Declaration + Instantiation

```java
int[] numbers = new int[5];
```

### Creating array with specified elements

```java
int[] numbers = {1, 2, 3, 4, 5};
```

### Length of an array

```java
numbers.length
```

This tells how many elements are inside the array.

### Accessing elements

```java
numbers[0]; // first element
numbers[1]; // second element
```

Index always starts from **0**.

---

## 2. Processing Arrays Using Loops

### Using normal for loop

```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

### Using for-each loop

```java
for (int num : numbers) {
    System.out.println(num);
}
```

for-each loop is simpler when we don’t need index.

---

## 3. Reading an Array from Standard Input

Mostly done using `Scanner`.

```java
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];

for (int i = 0; i < n; i++) {
    arr[i] = sc.nextInt();
}
```

First read size, then fill array using loop.

---

## 4. Strings and Arrays

### Splitting a string

```java
String text = "java is fun";
String[] words = text.split(" ");
```

Now `words` becomes an array.

### Iterating over a string

```java
for (int i = 0; i < text.length(); i++) {
    System.out.println(text.charAt(i));
}
```

String is not an array but works similar.

---

## 5. Methods and Parameters

### Method with parameters

```java
static void greet(String name) {
    System.out.println("Hello " + name);
}
```

### Method without parameters

```java
static void sayHi() {
    System.out.println("Hi");
}
```

### Method with different number of parameters

```java
static int add(int a, int b) {
    return a + b;
}
```

Arguments are passed values, parameters are method variables.

---

## 6. printf() and String.format()

### printf()

```java
System.out.printf("My age is %d", 20);
```

### Common format specifiers

* `%d` → integer
* `%f` → float / double
* `%s` → string
* `%n` → new line

### String.format()

```java
String msg = String.format("Score is %d", 90);
System.out.println(msg);
```

`printf()` prints directly, `String.format()` returns a string.

---

## 7. Final Variables

### final variable

```java
final int MAX = 100;
```

Value cannot be changed once assigned.

### final reference variable

```java
final int[] arr = {1, 2, 3};
arr[0] = 10; // allowed
```

Reference cannot change, but elements can.

### When to use final

* When value should not change
* To avoid bugs
* To make code safer


