import java.util.Scanner;

public class StrongNumber {
    
    // Method to calculate factorial
    public static int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int original = number;
        int sum = 0;

        // Loop through each digit
        while(number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        // Check if it's a Strong Number
        if(sum == original) {
            System.out.println(original + " is a Strong Number.");
        } else {
            System.out.println(original + " is Not a Strong Number.");
        }

        sc.close();
    }
}
