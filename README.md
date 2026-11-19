# Calculator SE

A simple, menu-driven calculator developed in Java. The project demonstrates a modular approach to programming by keeping each arithmetic operation in its own class and calling those operations from a central application.

## Features

- Addition, subtraction, multiplication, and division.
- Separate Java classes for each arithmetic operation.
- A command-line menu for selecting an operation.
- Decimal number support using Java's `double` type.
- Repeated calculations until the user chooses to exit.
- A message when an invalid menu option is entered.

## Project Structure

```text
Calculator-SE/
├── Calculator.java       # Main program, menu, and user input
├── Addition.java         # Addition operation
├── Subtraction.java      # Subtraction operation
├── Multiplication.java   # Multiplication operation
└── Division.java         # Division operation
```

Each operation class exposes a static `calculate(double a, double b)` method. `Calculator.java` calls the appropriate method based on the user's menu selection.

## Requirements

- Java Development Kit (JDK) 8 or later.
- A terminal or command prompt.

Check that Java and the Java compiler are available:

```bash
java -version
javac -version
```

## Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/Arjun-143-kamath/Calculator-SE.git
```

### 2. Open the project directory

```bash
cd Calculator-SE
```

### 3. Compile the source files

Compile all Java files in the project directory:

```bash
javac *.java
```

### 4. Run the calculator

```bash
java Calculator
```

No external dependencies, Maven, or Gradle are required.

## Usage

When the application starts, it displays a menu:

```text
===== JAVA MODULAR CALCULATOR =====
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Exit
Enter your choice:
```

Choose an operation (1–4), enter the two numbers when prompted, and the calculator displays the result. The menu appears again so you can perform another calculation. Select option `5` to exit.

### Example

```text
===== JAVA MODULAR CALCULATOR =====
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Exit
Enter your choice: 1
Enter first number: 12
Enter second number: 5
Result: 17.0
```

## Implementation Note

The current division method uses Java's `double` arithmetic directly and does not explicitly validate a zero divisor. A division by zero can therefore produce `Infinity` or `NaN`, rather than a custom error message.

## Learning Objectives

This project is a small exercise in:

- Organizing a Java program across multiple classes.
- Separating responsibilities into individual modules.
- Using static methods to reuse operations.
- Taking command-line input with `Scanner`.
- Using loops and `switch` statements to control program flow.

---

**Repository:** [Calculator-SE](https://github.com/Arjun-143-kamath/Calculator-SE)
