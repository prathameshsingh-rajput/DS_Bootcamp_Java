

/*Write a program in Java to find the ceiling in a sorted array? 
Given a sorted array in ascending order and a value x, the ceiling of x is the smallest 
element in array greater than or equal to x, and the floor is the greatest element smaller than 
or equal to x. 
Expected Output : 
The given array is : 1 3 4 7 8 9 9 10 
The ceiling of 5 is: 7 
*/

public class GetCeilingEle{
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 7, 8, 9, 9, 10};
        int x = 5;

        for(int i = 0; i < arr.length; ++i){
            if(arr[i] >= x){
                System.err.println("The ceiling of "+x+" is: "+arr[i]);
                 break;
            }
        }
    }
}