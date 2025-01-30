# Calculator Application

## Overview
This is a simple Java-based calculator application that allows users to perform various mathematical operations, including addition, subtraction, multiplication, division, Fibonacci sequence generation, and statistical calculations (mean and variance) on an array of numbers. The application is menu-driven and provides an interactive command-line interface.

## Features
The calculator supports the following operations:
1. **Addition**: Add two numbers.
2. **Subtraction**: Subtract one number from another.
3. **Multiplication**: Multiply two numbers.
4. **Division**: Divide one number by another (with error handling for division by zero).
5. **Fibonacci Sequence**: Generate and print the Fibonacci sequence up to a specified number of terms.
6. **Mean of Array**: Calculate the mean (average) of an array of numbers.
7. **Variance of Array**: Calculate the variance of an array of numbers.
8. **Exit**: Exit the application.

## Classes
The project consists of three main classes:
1. **`UserInput.java`**: Handles user input using the `Scanner` class. It provides methods to get a single number or an array of numbers from the user.
2. **`Calculator.java`**: Contains the logic for all mathematical operations, including arithmetic operations, Fibonacci sequence generation, and statistical calculations.
3. **`Main.java`**: The entry point of the application. It displays a menu to the user and processes their choice to perform the selected operation.

## How to Run the Application
### Prerequisites
- Ensure you have Java Development Kit (JDK) installed on your system.
- A terminal or command prompt to compile and run the Java program.

### Steps to Run
1. **Download the Files**:
   - Download the three Java files: `UserInput.java`, `Main.java`, and `Calculator.java`.

2. **Compile the Code**:
   - Open a terminal or command prompt.
   - Navigate to the directory where the Java files are located.
   - Compile the Java files using the following command:
     ```bash
     javac UserInput.java Calculator.java Main.java
     ```

3. **Run the Application**:
   - After compiling, run the application using the following command:
     ```bash
     java Main
     ```

4. **Use the Application**:
   - Follow the on-screen instructions to select an operation and provide the required inputs.

## Example Usage
1. **Addition**:
   - Select option `1` (Add).
   - Enter two numbers: `5` and `10`.
   - The program will output: `Result: 15.0`.

2. **Fibonacci Sequence**:
   - Select option `5` (Fibonacci Sequence).
   - Enter the number of terms: `7`.
   - The program will output: `Fibonacci Sequence: 0 1 1 2 3 5 8`.

3. **Mean of Array**:
   - Select option `6` (Mean of Array).
   - Enter the number of elements: `4`.
   - Enter the elements: `2.5`, `3.5`, `4.5`, `5.5`.
   - The program will output: `Mean: 4.0`.

4. **Exit**:
   - Select option `8` (Exit) to terminate the program.

## Code Structure
### `UserInput.java`
- Handles user input using the `Scanner` class.
- Provides methods:
  - `getNumberInput(String prompt)`: Prompts the user for a single number.
  - `getArrayInput()`: Prompts the user for an array of numbers.

### `Calculator.java`
- Contains methods for mathematical operations:
  - `add(double a, double b)`: Adds two numbers.
  - `subtract(double a, double b)`: Subtracts one number from another.
  - `multiply(double a, double b)`: Multiplies two numbers.
  - `divide(double a, double b)`: Divides one number by another.
  - `printFibonacci(int n)`: Prints the Fibonacci sequence up to `n` terms.
  - `calculateMean(double[] array)`: Calculates the mean of an array.
  - `calculateVariance(double[] array)`: Calculates the variance of an array.

### `Main.java`
- The main class that runs the application.
- Displays a menu and processes user input to perform the selected operation.

## License
This project is open-source and available under the MIT License. Feel free to modify and distribute it as needed.

### How to Use the README.md File
1. Save the content above in a file named `README.md`.
2. Place the `README.md` file in the same directory as your Java files.
3. Use the README file to provide documentation for your project when sharing it with others or uploading it to a repository (e.g., GitHub).
