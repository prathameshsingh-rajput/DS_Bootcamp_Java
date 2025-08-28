// Q.19) count occurrences of every element without using inbuilt data structures

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CountOccurrences{
	public void countOccur(int []arr){
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int ele : arr){
			map.put(ele, map.getOrDefault(ele, 0)+1);
		}

		for(Map.Entry<Integer, Integer> freq : map.entrySet()){
			System.out.println("Element "+freq.getKey()+" occurs "+freq.getValue()+ " times.");
		}
	}

	public static void main(String[]a){
		Scanner in = new Scanner(System.in);
		CountOccurrences obj = new CountOccurrences();

		int arr[] = new int[10];
		System.out.print("Enter 10 elements: ");
		for(int i = 0; i < 10; i++){
			arr[i] = in.nextInt();
		}

		obj.countOccur(arr);

		System.out.println();
		in.close();

	}
}
