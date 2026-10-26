import java.util.Scanner;

public class IT26102492Lab6Q2B {
    public static void main(String[] args) {

        int number;
        int count = 1;

        Scanner input = new Scanner(System.in);

        // Enter and display 10 numbers
        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            number = input.nextInt();

            System.out.println("Number " + count + " is: " + number);
            count++;
        }

        input.close();
    }
}