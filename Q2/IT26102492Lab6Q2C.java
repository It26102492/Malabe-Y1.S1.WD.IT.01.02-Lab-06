import java.util.Scanner;

public class IT26102492Lab6Q2C {
    public static void main(String[] args) {

        int number;
        int count = 1;
        int sum = 0;
        double average;

        Scanner input = new Scanner(System.in);

        // Enter 10 numbers and calculate their sum
        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            number = input.nextInt();

            sum = sum + number;
            count++;
        }

        // Calculate and display the average
        average = (double) sum / 10;

        System.out.println();
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        input.close();
    }
}