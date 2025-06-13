import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user
        //System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int rev=0;
        
        //long factorial = 1;

        
            while( num!=0){
                
                int digit=0;
                digit = num % 10;
                
                rev = rev * 10 + digit;
                num=num/10;

            }
                



            
            System.out.println("Reversed number: "+rev);
        }
    }

