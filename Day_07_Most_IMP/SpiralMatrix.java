import java.util.Scanner;

public class SpiralMatrix{
	public static void printMatrixSpiral(int [][]mat){

		int row = 0, col = 0;
		int rowEnd = mat.length-1, colEnd = mat[0].length-1;

		while(row <= rowEnd && col <= colEnd){

			for(int i = col; i <= colEnd; ++i){
				System.out.print(mat[row][i]+" ");
			}

			for(int i = row+1; i <= rowEnd; ++i){
				System.out.print(mat[i][colEnd]+" ");
			}

			if(row < rowEnd){
				for(int i = colEnd-1; i >= col; --i){
					System.out.print(mat[rowEnd][i]+" ");
				}
			}

			if(col < colEnd){
				for(int i = rowEnd-1; i > row; --i){
					System.out.print(mat[i][col]+" ");
				}
			}

			col++;
			row++;
			rowEnd--;
			colEnd--;
		}
	}
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		int row = in.nextInt();
		int col = in.nextInt();

		int mat[][] = new int[row][col];

		for(int i = 0; i < row; ++i){
			for(int j = 0; j < col; ++j){
				mat[i][j] = in.nextInt();
			}
		}

		printMatrixSpiral(mat);
	}
}