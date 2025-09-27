import java.util.*;
public class ProfitLoss{
    public static void  main(String[]a){
        Scanner in = new Scanner(System.in);
        System.out.print("ENter cost prize of an item: ");
        double cp = in.nextDouble();
        System.out.print("ENter selling prize of an item: ");
        double sp = in.nextDouble();

        if(cp < sp){
            System.out.println("Seller made profit.");
        }else if(cp > sp){
            System.out.println("Seller made loss.");
        }else{
            System.out.println("There is no Profit or Loss.");
        }
        in.close();
    }
}