import java.util.Scanner;

public class DivisorSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        int sum = 0;

        System.out.print("Divisors of " + number + ": ");

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");  // Add space after each number (including last)
                sum += i;
            }
        }

        System.out.println(); // Move to new line after printing divisors
        System.out.println("Sum of divisors: " + sum);

        sc.close();
    }
}
