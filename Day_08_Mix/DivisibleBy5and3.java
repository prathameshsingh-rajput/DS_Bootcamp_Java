import java.util.Scanner;

public class DivisibleBy5and3{
    public static void main(String[]a){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = in.nextInt();
        
        if(n % 3 == 0 && n % 5 == 0){
            System.out.println("Yes it is divisible by 5 and 3.");
        }else{
            System.out.println("Not Divisible.");
        }
        in.close();
    }
}