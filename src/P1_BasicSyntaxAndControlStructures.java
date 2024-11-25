import java.util.Scanner;  // Import the Scanner class for user input
public class P1_BasicSyntaxAndControlStructures {
    public static boolean isPrimeNumber(int number){
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }
    // Main method: the starting point of any Java application
    public static void main(String[] args) {
        // Print "Hello, World!" to the console
        System.out.println("Hey! Hello, World!");

        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Task choice (1/2/3): ");
        int task = scanner.nextInt();
        switch (task){
            case 1:
            {

                // Display choices to the user
                System.out.println("Welcome to the Simple Calculator!");
                System.out.println("Please select an operation:");
                System.out.println("1. Addition (+)");
                System.out.println("2. Subtraction (-)");
                System.out.println("3. Multiplication (*)");
                System.out.println("4. Division (/)");

                // Get the user's choice
                System.out.print("Enter your choice (1/2/3/4): ");
                int choice = scanner.nextInt();

                // Get the numbers from the user
                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();

                double result;  // Variable to store the result

                // Perform the chosen operation
                if (choice == 1) {
                    result = num1 + num2;
                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                } else if (choice == 2) {
                    result = num1 - num2;
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                } else if (choice == 3) {
                    result = num1 * num2;
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                } else if (choice == 4) {
                    // Check for division by zero
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                    }
                } else {
                    System.out.println("Invalid choice. Please run the program again.");
                }
                break;
            }
            case 2:
            {
                // Fibonacci Sequence
                /*
                This program will generate the first n numbers of the Fibonacci sequence.
                The Fibonacci sequence is a series of numbers
                where each number is the sum of the two preceding ones, usually starting with 0 and 1.
                */
                System.out.print("Enter the number of terms in the Fibonacci sequence: ");
                int n = scanner.nextInt();

                int first = 0, second = 1;

                System.out.println("Fibonacci Sequence:");
                for (int i = 1; i <= n; i++) {
                    System.out.print(first + " ");

                    int next = first + second;
                    first = second;
                    second = next;
                }
                break;
            }
            case 3:
            {
                // Prime Number Checker
                System.out.print("Enter a number to check if it's prime: ");
                int number = scanner.nextInt();

                if(isPrimeNumber(number))
                {
                    System.out.println(number + " is a prime number.");
                }
                else{
                    System.out.println(number + " is not a prime number.");
                }
            }
            default: System.out.println("Invalid Choice!");
        }

        // Close the Scanner
        scanner.close();

    }
}
/*
* Notes:
* We import java.util.Scanner to allow the program to read user input from the console.
*/
