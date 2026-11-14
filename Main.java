
import java.util.Scanner;

// Parent class
class Calculator {

    // Class variables
    double num1;
    double num2;

    // Constructor
    Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Addition method
    void add() {
        System.out.println("Answer: " + (num1 + num2));
    }

    // Subtraction method
    void subtract() {
        System.out.println("Answer: " + (num1 - num2));
    }
}

// Child class to inherit the parent class
class AdvancedCalculator extends Calculator {

    // Constructor
    AdvancedCalculator(double num1, double num2) {
        super(num1, num2);
    }

    // Multiplication method
    void multiply() {
        System.out.println("Answer: " + (num1 * num2));
    }

    // Division method
    void divide() {
        if (num2 != 0) {
            System.out.println("Answer: " + (num1 / num2));
        } else {
            System.out.println("Cannot divide by zero!");
        }
    }
}

// Main class
public class Main {

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask user to enter numbers
        System.out.print("Enter first number: ");
        double a = input.nextDouble();

        System.out.print("Enter second number: ");
        double b = input.nextDouble();

        // Create object
        AdvancedCalculator c1 = new AdvancedCalculator(a, b);

        // Display calculator menu
        System.out.println("\n===== CALCULATOR =====");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Choose an operation (1-4): ");
        int choice = input.nextInt();

        // Perform selected operation
        switch (choice) {

            case 1:
                c1.add();
                break;

            case 2:
                c1.subtract();
                break;

            case 3:
                c1.multiply();
                break;

            case 4:
                c1.divide();
                break;

            default:
                System.out.println("Invalid choice!");
        }

        input.close();
    }
}
