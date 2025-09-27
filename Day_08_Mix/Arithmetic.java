import java.util.Scanner;

public class Arithmetic{
    public static void main(String[]a){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = in.nextInt();

        if(age <= 0){
            System.out.println("Invalid Age");
        }
        else if(age < 18){
            System.out.println("Minor");
        }else{
            System.out.println("Adult");
        }

        in.close();
    }
}