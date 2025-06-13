import java.util.Scanner;
public class base1{
    
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int num=Integer.parseInt(sc.nextLine());
    int sum=0;
    if(num<=9){
        System.out.println("Single digit result: "+num);
     }   else{
            for(;num>9;){
                for(sum=0;num!=0;num/=10){
                    int res=0;
                    res=num%10;
                    sum=sum+res;
                    

                }
                num=sum;
            }
            System.out.println("Single digit result: "+sum);
        }
    }

}




