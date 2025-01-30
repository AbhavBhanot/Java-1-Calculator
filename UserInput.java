
import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
    }

    // Function to get number input
    public int getNumberInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    // Function to get array input
    public double[] getArrayInput() {
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        double[] array = new double[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }

        return array;
    }
}