/*
Write a program in Java to find sum of right diagonals and left Diagonals of a matrix
Test Data :
Input the size of the square matrix : 2
Input elements in the first matrix :
element - [0],[0] : 1
element - [0],[1] : 2
element - [1],[0] : 3
element - [1],[1] : 4
Expected Output :
The matrix is :
1 2
3 4
Addition of the right Diagonal elements is :5
Addition of the Left Diagonal elements is :5
*/

public class GetDiagonalSum{
    public static void main(String[] args) {
        int arr[][] = {{1, 4, 1}, {8, 4, 0}, {8, 4, 10}};
        int rightDiagonalSum = 0, leftDiagonalSum = 0;

        System.out.println("The matrix is : ");
        for(int i = 0; i < arr.length; ++i){
			for(int j = 0; j < arr.length; ++j){
				if(i == j){
					rightDiagonalSum += arr[i][j];
				}
				if(i + j == arr.length -1){
					leftDiagonalSum += arr[i][j];
				}
				System.out.print(arr[i][j]+" ");
			}
            System.out.println();
        }

        System.out.println("Addition of the right Diagonal elements is :" + rightDiagonalSum);
        System.out.println("Addition of the Left Diagonal elements is :" + leftDiagonalSum);
    }
}
