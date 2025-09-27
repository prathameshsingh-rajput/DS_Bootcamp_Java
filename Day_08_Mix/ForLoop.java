public class ForLoop{
    public static void printNums(int n){
        System.out.println("Numbers fron "+1+" to "+n);
        for(int i = 1; i <= n; ++i){
            System.out.print(i+" ");
        }

        System.out.println("\n\nNumbers fron "+n+" to "+1);
        for(int i = n; i >= 1; --i){
            System.out.print(i+" ");
        }

        System.out.println("\n\nTable of "+n);
        for(int i = 1; i <= 10; ++i){
            System.out.println(n+" x "+i+" = "+(n*i));
        }

        System.out.println("\nSquare of nums up to "+n);
        for(int i = 1; i <= n; ++i){
            System.out.println(i+ " -> "+(i*i)+"  ");
        }

        System.out.println("\nAll even nums from 1 to "+n);
        for(int i = 1; i <= n; ++i){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }

        System.out.println("\n\nA.P upto "+n+" with common difference 2: ");
        int ap = 1;
        for(int i = 0; i < n; i++){
            System.out.print(ap+" ");
            ap += 2;
        }
    }

    
    public static void main(String[]a){
        ForLoop.printNums(10);
    }
}