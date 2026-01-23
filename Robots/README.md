DAY-2 (23 JAN)
# Robot Factory

This is a simple Java project that demonstrates the concept of object-oriented programming using a Robot Factory theme.

## Project Structure

The project is organized into the following folders:

- **base**: Contains the abstract `Robot` class.
- **interfaces**: Contains interfaces that define robot behaviors (`movable`, `social`, `workable`).
- **types**: Contains concrete robot implementations (e.g., `industrial`).

## Files

- **Main.java**: The main entry point of the application.
- **base/Robot.java**: An abstract class that defines the basic a robot.
- **interfaces/movable.java**: An interface for robots that can move.
- **interfaces/social.java**: An interface for robots that can interact socially.
- **interfaces/workable.java**: An interface for robots that can perform work.
- **types/industrial.java**: A concrete implementation of an industrial robot.

## How to Compile and Run

1.  **Compile the code:**
    Open a terminal and navigate to the root directory of the project (`Robots`). Then, run the following command to compile all the `.java` files:

    ```bash
    javac Main.java base/*.java interfaces/*.java types/*.java
    ```

2.  **Run the application:**
    After successful compilation, run the following command from the root directory:

    ```bash
    java Main
    ```

## Output

When you run the application, you will see the following output:

```
Welcome to the Robot Factory!
Industrial Robot has a heavy-duty chassy
Industrial Robot is powered by electricity
Industrial Robot has proximity and vision sensors
Industrial Robot uses Java as its programming language
Industrial Robot can pick objects
Industrial Robot can scan the environment
```

## What I Learned from this Project

This project is a practical exercise in understanding core Object-Oriented Programming (OOP) principles in Java.

### Abstraction
The `base.Robot` class is an **abstract class**. It provides a blueprint for what a robot is, defining common characteristics and behaviors that all robots must have (like `chassy()`, `powerSource()`, etc.), but it cannot be instantiated on its own. This forces developers to create specific types of robots that build upon this base, hiding the complex inner workings.

### Inheritance
The `types.industrial` class **extends** the `base.Robot` class. This is a clear example of **inheritance**, where the `industrial` robot automatically inherits the fields and methods of the `Robot` class. This promotes code reuse and establishes a logical hierarchy.

### Interfaces
The project uses several **interfaces** (`interfaces.movable`, `interfaces.social`, `interfaces.workable`) to define capabilities or behaviors that can be implemented by different classes. The `types.industrial` class **implements** these interfaces, promising to provide concrete implementations for methods like `move()`, `communicate()`, and `pick_object()`. This allows for a flexible and modular design where different robots can share common functionalities without being related by inheritance.
