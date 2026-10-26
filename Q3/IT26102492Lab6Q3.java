import java.util.Scanner;

public class IT26102492Lab6Q3 {
    public static void main(String[] args) {

        int number;
        double meanOfSquares;
        double rms;
        double sumOfSquares = 0;
        int count = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter positive integers (terminate input with -99):");

        while (true) {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number == -99) {
                break;
            }

            if (number > 0) {
                // Add the square and increase the count
                sumOfSquares += Math.pow(number, 2);
                count++;
            } else {
                // Reject negative numbers other than the sentinel -99
                System.out.println(
                        "Invalid input. Please enter a positive integer or -99.");
            }
        }

        // Check whether any valid numbers were entered
        if (count > 0) {
            // Calculate Root Mean Square (RMS)
            meanOfSquares = sumOfSquares / count;
            rms = Math.sqrt(meanOfSquares);

            // Display the RMS result
            System.out.println();
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        } else {
            System.out.println("No positive numbers were entered.");
        }

        input.close();
    }
}