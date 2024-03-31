import java.util.Scanner;
class Largest_Smallest{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);        
        int n,sum=0,count=0;
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        char choice;	
        do
        {
            System.out.print("Enter the Number :");
            n = input.nextInt();        
            mx = Math.max(mx,n);
            mn = Math.min(mn,n);
            sum += n;
            count++;
            System.out.print("Do you want to Continue y/n ? :");
            choice = input.next().charAt(0);
 
        }while(choice=='y' || choice == 'Y');
        double average = (double) sum / count;
        System.out.println("Largest Number : " + mx);
        System.out.println("Smallest Number : " + mn);
        System.out.println("Average of all numbers entered: " + average);
    }  
}