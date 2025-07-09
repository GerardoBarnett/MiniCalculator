# MiniCalculator

A simple console-based calculator application that can add and subtract two numbers.

## Features

- Addition of two numbers
- Subtraction of two numbers
- Console-based user interface
- Built with Java 17 and Maven

## Requirements

- Java 17 or higher
- Maven 3.6 or higher

## How to Build

```bash
mvn clean package
```

## How to Run

```bash
java -cp target/mini-calculator-1.0-SNAPSHOT.jar com.calculator.Main
```

## How to Run Tests

```bash
mvn test
```

## Code Quality and Coverage

This project is configured with:
- JaCoCo for code coverage
- SonarQube for code quality analysis

To run SonarQube analysis:

```bash
mvn clean verify sonar:sonar
```

## Project Structure

- `src/main/java/com/calculator/Calculator.java` - Core calculator functionality
- `src/main/java/com/calculator/Main.java` - Console application entry point
- `src/test/java/com/calculator/CalculatorTest.java` - Unit tests
