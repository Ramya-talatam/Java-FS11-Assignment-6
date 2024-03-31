import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int r1 = n% 7;
        int r2 = n% 13;

        if (r1==0 && r2==0) {
            int q1 = n/ 7;
            int q2 = n / 13;

            System.out.println(n + " is divisible by both 7 and 13.");
            System.out.println("Quotient when divided by 7: " + q1);
            System.out.println("Remainder when divided by 7: " + r1);
            System.out.println("Quotient when divided by 13: " + q2);
            System.out.println("Remainder when divided by 13: " + r2);
        } else {
            System.out.println(n + " is not divisible by both 7 and 13 simultaneously.");
        }

        scanner.close();
    }
}
