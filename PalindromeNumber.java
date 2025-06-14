import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int ori=number;
        int reversed = 0;

        while(number != 0) {
            int digit = number % 10;  
                   // Get last digit
            reversed = reversed * 10 + digit; // Append digit
            number = number / 10;             // Remove last digit
        }
        if(reversed==ori){
            System.out.println(reversed +" is a Palindrome number.");

        }
        else{
            System.out.println(ori+" is Not a Palindrome number.");
        }

       
        
        sc.close();
    }
}
