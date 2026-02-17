

# DAY_12 | 10 Feb

## Topics covered
- Fundamentals of OOP: objects, classes, and how they relate.
- Declaring new classes.
- Writing fields (instance variables).
- Creating objects (including creating multiple objects of the same class).
- Static vs instance (what’s the difference?).
- Class members: class variables, class constants, and class methods.

## What I practiced (quick)
- Designed simple classes with fields + methods.
- Created multiple instances and observed that each object holds its own instance state.
- Compared instance members vs `static` members.

## Mini code snippet
```java
class Student {
    String name;          // instance field
    static int count = 0;  // class variable (shared)

    Student(String name) {
        this.name = name;
        count++;
    }

    void intro() {
        System.out.println("Hi, I'm " + name);
    }

    static int getCount() {
        return count;
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Asha");
        Student s2 = new Student("Ravi");
        s1.intro();
        s2.intro();
        System.out.println(Student.getCount());
    }
}
