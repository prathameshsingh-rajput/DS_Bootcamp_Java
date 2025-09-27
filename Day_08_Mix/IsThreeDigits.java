import java.util.Scanner;

public class IsThreeDigits{
    public static void main(String[]a){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive number:");
        int n = in.nextInt();

        String s = n+"";
        boolean isThreeDigits = (s.length() == 3);
        System.out.println("Three Digits: "+isThreeDigits); 
        in.close();
    }
}