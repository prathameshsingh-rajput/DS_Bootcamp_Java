import java.util.*;
import java.util.Random.*;

public class GuessTheNum{
    public static void main(String[]a){
        Scanner in = new Scanner(System.in);
        int n;
        Random r = new Random();
        int num = r.nextInt(101);

        do{
            System.out.print("Guess the number: ");
            n = in.nextInt();

            if(num < n){
                System.out.println("To Large..");
                System.out.println("Wrong Chice.. Try Again!");
            }else{
                System.out.println("To Small..");
                System.out.println("Wrong Chice.. Try Again!");
            }
        }while(n != num);

        System.out.println("\n\nCongrats you guess the number...");
        System.out.println("You won the game..!!!");
        
        in.close();
    }
}