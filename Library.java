import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days the book is late: ");
        int d = scanner.nextInt();

        double fine = 0.0;

        if (d <= 7) {
            fine = d * 0.50;
        } else if (d <= 14) {
            fine = 7 * 0.50 + (d - 7) * 1.00;
        } else if (d <= 21) {
            fine = 7 * 0.50 + 7 * 1.00 + (d - 14) * 5.00;
        } else {
            System.out.println("Your membership is canceled");
            System.exit(0);
        }

        System.out.println("Fine for returning the book after" + d + " days is Rs. " + fine);

        scanner.close();
    }
}
