// Main.java
// Name: Abhav Bhanot
// PRN:23070126005
// Batch:A1

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the calculator app: ");
        UserInput userInput = new UserInput();
        Calculator calculator = new Calculator();

        boolean exit = false;

        while (!exit) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n5. Fibonacci Sequence\n6. Mean of Array\n7. Variance of Array\n8. Exit");
            int choice = userInput.getNumberInput("Enter your choice: ");

            switch (choice) {
                case 1:
                    double a = userInput.getNumberInput("Enter first number: ");
                    double b = userInput.getNumberInput("Enter second number: ");
                    System.out.println("Result: " + calculator.add(a, b));
                    break;
                case 2:
                    a = userInput.getNumberInput("Enter first number: ");
                    b = userInput.getNumberInput("Enter second number: ");
                    System.out.println("Result: " + calculator.subtract(a, b));
                    break;
                case 3:
                    a = userInput.getNumberInput("Enter first number: ");
                    b = userInput.getNumberInput("Enter second number: ");
                    System.out.println("Result: " + calculator.multiply(a, b));
                    break;
                case 4:
                    a = userInput.getNumberInput("Enter numerator: ");
                    b = userInput.getNumberInput("Enter denominator: ");
                    if (b != 0) {
                        System.out.println("Result: " + calculator.divide(a, b));
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    int n = userInput.getNumberInput("Enter the number of terms: ");
                    System.out.println("Fibonacci Sequence: ");
                    calculator.printFibonacci(n);
                    break;
                case 6:
                    double[] array = userInput.getArrayInput();
                    System.out.println("Mean: " + calculator.calculateMean(array));
                    break;
                case 7:
                    array = userInput.getArrayInput();
                    System.out.println("Variance: " + calculator.calculateVariance(array));
                    break;
                case 8:
                    System.out.println("Exiting the program. Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
