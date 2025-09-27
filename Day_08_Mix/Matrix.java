public class Matrix{
    public static int maximumEle(int a[][]){
        int max = Integer.MIN_VALUE;
        int i = 0, j = 0, row = 0, col = 0;
        for(i = 0; i < a.length; ++i){
            for(j = 0; j < a[0].length; ++j){
                if(a[i][j] > max){
                    max = a[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("Location: "+row+"x"+col);
        return max;
    }
    public static int minimumEle(int a[][]){
        int min = Integer.MAX_VALUE;
        int i = 0, j = 0, row = 0, col = 0;
        for(i = 0; i < a.length; ++i){
            for(j = 0; j < a[0].length; ++j){
                if(a[i][j] < min){
                    min = a[i][j];
                    row = i;
                    col = j;
                }

            }
        }
        System.out.println("Location: "+row+"x"+col);
        return min;
    }

    public static int maxSumRow(int a[][]){
        int i = 0, j = 0, row = 0;
        int result = 0;
        for(i = 0; i < a.length; ++i){
            int sum = 0;
            for(j = 0; j < a[0].length; ++j){
                sum += a[i][j];
            }

            if(sum > result){
                result = sum;
                row = i;
            }
        }
        System.out.println("Maximum sum is in row:"+ row);
        return result;
    }

    public static int diagonalSum(int a[][]){
        int sum = 0;
        for(int i = 0; i < a.length; ++i){
            for(int j = 0; j < a[0].length; ++j){
                if(i == j)
                    sum += a[i][j];
            }
        }
        return sum;
    }

    public static int diagonalSumPrimaryAndSecondary(int a[][]){
        int sum = 0;
        for(int i = 0; i < a.length; ++i){
            for(int j = 0; j < a[0].length; ++j){
                if(i == j)
                    sum += a[i][j];
                if(i + j == a.length -1)
                    sum+= a[i][j];
            }
        }
        if(a.length% 2 != 0){
            sum -= a[a.length/2][a.length/2];
        }
        return sum;
    }

    public static void main(String[]arg){
        int a[][] = {{10 , 2 , 3, 4},
                    {5, 2, 1, 2},
                    {7, 6, 5, 3},
                    {1, 2, 10,8 }};
        
                    int b[][] = {{10 , 2 , 3},
                                {5, 2, 1},
                                {7, 6, 5}};
                    
        System.out.println(Matrix.minimumEle(a));
        System.out.println(Matrix.maximumEle(a));
        System.out.println("Max Sum: "+Matrix.maxSumRow(a));
        System.out.println("Sum of Diagonal elements: "+ Matrix.diagonalSum(a));
        System.out.println("Sum of Diagonal Primary and Secondary elements: "+ Matrix.diagonalSumPrimaryAndSecondary(a));
        System.out.println("Sum of Diagonal Primary and Secondary elements: "+ Matrix.diagonalSumPrimaryAndSecondary(b));


        
    }
}