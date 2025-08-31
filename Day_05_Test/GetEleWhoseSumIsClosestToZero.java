/*
Write a program in Java to find two elements whose sum is closest to zero
Expected Output :
The given array is : 38 44 63 -51 -35 19 84 -69 4 -46
The Pair of elements whose sum is minimum are:
[44, -46]
*/

public class GetEleWhoseSumIsClosestToZero{
    public static void main(String[] args){
        int arr[] = {38, 4, 63, -24, -35, 19, 84, -69, 4, -46};
        int ele1 = arr[0], ele2 = arr[1];
		int closestSum = Math.abs(ele1 + ele2);

        for(int i = 0; i < arr.length-1; ++i){
            for(int j = i+1;  j < arr.length; ++j){
				int sum = Math.abs(arr[i] + arr[j]);
				if(sum < closestSum){
					closestSum = sum;
					ele1 = arr[i];
					ele2 = arr[j];
				}


			}
        }

        System.out.println("The Pair of elements whose sum is minimum are: ");
        System.out.println("[" + ele1 + ", " + ele2 + "]");
    }
}