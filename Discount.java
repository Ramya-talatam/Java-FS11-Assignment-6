import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per item: ");
        double price = scanner.nextDouble();

        double total;
        total = quantity * price ;
        if (quantity > 50) {
            total *= 0.90;
        } else if (quantity >= 25 && quantity <= 50) {
            total*=0.95; 
        } 

        System.out.println("Total expenses: Rs. " + total);

        scanner.close();
    }
}
