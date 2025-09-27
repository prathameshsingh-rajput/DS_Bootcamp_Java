public class Patterns{
    
    public static void main(String[]a){
        int m = 5;
        int n = 3;

        for(int i = 0; i < n; ++i){
            for(int j = 0; j < m; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("____________________________________________________");

        for(int i = 0; i < m; ++i){
            for(int j = 0; j <= i; ++j){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("_______________________l_____________________________");

        for(int i = 0; i < m; ++i){
            for(int j = m; j >= i; --j){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; ++j){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("____________________________________________________");

        for(int i = 0; i < m; ++i){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = m-i; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 0; i < m; ++i){
            for(int j = m; j > i+1; --j){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; ++j){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("____________________________________________________");

        for(int i = 0; i < m; ++i){
            for(int j = 0; j < i; ++j){
                System.out.print("  ");
            }
            for(int j = i; j < m; ++j){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("____________________________________________________");

        for(int i = m; i >= 0; --i){
            for(int j = 0; j <= m+3; ++j){
                if(i == 0 || j == 0 || i == m || j == m+3){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
            System.out.println("____________________________________________________");

            /*
        for(int i = 1; i <= 7; ++i){
            for(int j = 1; j <= 4; ++j){
                if(j == 1){
                    System.out.print("* ");
                }
                if(i+j == 4){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            for(int j = 1; j <= 4; ++j){
                if(i-5+j)
            }
            System.out.println();
        }*/

        for(int i = 0; i < 4; ++i){
            for(int j = 0; j < i; ++j){
                System.out.print("  ");
            }
            for(int j = 0; j < 4; ++j){
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println("____________________________________________________");

        for(int i = 0; i < m; ++i){
            for(int j = m-i-1; j >= 0; --j){
                System.out.print("  ");
            }
            for(int j = 0; j <= i; ++j){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}