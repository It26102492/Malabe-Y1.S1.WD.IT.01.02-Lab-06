import java.util.Scanner;

public class IT26102492Lab6Q1 {
    public static void main(String[] args) {

        double number;
        double square;
        double squareRoot;

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        number = input.nextDouble();

        // Validate the input
        if (number <= 0) {
            System.out.println("Error: The number must be greater than zero");
        } else {
            // Calculate the square of the number
            square = number * number;

            // Calculate the square root of the number
            squareRoot = Math.sqrt(number);

            // Display the square and square root
            System.out.println();
            System.out.println("The square of " + number + " is: " + square);
            System.out.println("The square root of " + number
                    + " is: " + squareRoot);
        }

        input.close();
    }
}