//Write a program in C to find the second largest element in an array ?
import java.util.*;
public class GetSecondLargest {
    public static void main(String[] args) {
        int arr[];
		Scanner in = new Scanner(System.in);

		System.out.print("Enter size of an Array: ");
	    arr = new int[in.nextInt()];

		System.out.print("Enter "+arr.length+" elements: ");
		for(int i = 0; i < arr.length; ++i){
			arr[i] = in.nextInt();
		}

		int max = arr[0], sMax = Integer.MIN_VALUE;

		for(int i = 1; i < arr.length; ++i){
			if(arr[i] > max){
				sMax = max;
				max = arr[i];
			}else if(arr[i] > sMax && arr[i] != max){
				sMax = arr[i];
			}
		}

		System.out.println("Second Largest Ele: "+sMax);
		in.close();
    }
}
