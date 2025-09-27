public class SpiralMatrix{
    public static void printSpiralMatrix(int mat[][]){
        if(mat == null || mat.length <= 0){
            System.out.println("Matrix is invalid..");
            return;
        }

        
        
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the M x N Matrix size: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println("Enter "+m+" by "+n+" matrix array:");
        int mat[][] = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; ++j){
                mat[i][j] = sc.nextInt();
            }
        }

        SpiralMatrix.printSpiralMatrix(mat);
    }
}