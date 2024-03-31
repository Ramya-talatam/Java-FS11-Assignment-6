import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        int count = 0;
        
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        if (count>0) {
            System.out.println("Vowels are present in the string.");
        } else {
            System.out.println("Vowels are not present in the string.");
        }
        System.out.println("Total number of vowels: " + count);

        scanner.close();
    }
}
