public class Calculator {

    // Addition
    public double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public double divide(double a, double b) {
        return a / b;
    }

    // Print Fibonacci sequence
    public void printFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Calculate mean of array
    public double calculateMean(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Calculate variance of array
    public double calculateVariance(double[] array) {
        double mean = calculateMean(array);
        double variance = 0;

        for (double num : array) {
            variance += Math.pow(num - mean, 2);
        }

        return variance / array.length;
    }
}
