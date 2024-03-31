import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        System.out.print("Enter the employee's year of joining: ");
        int joinYear = scanner.nextInt();

        int years= currentYear - joinYear;

        int bonus = 0;

        if (years> 5) {
            bonus = 5000;
        } else if (years>= 3 && years <= 5) {
            bonus = 3000;
        }

        if (bonus > 0) {
            System.out.println("awarded bonus: Rs. " + bonus + "/-");
        } else {
            System.out.println("No bonus awarded.");
        }

        scanner.close();
    }
}
