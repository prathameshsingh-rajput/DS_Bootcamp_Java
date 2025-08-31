//WAP to enter the 10 element array and print the occurrence of every element ?

import java.util.HashMap;
import java.util.Scanner;

public class PrintOccurences{
	public static void printOcc(int arr[]){
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i = 0; i < arr.length; ++i){
			if(!map.containsKey(arr[i])){
				map.put(arr[i], 1);
			}else{
				int freq = map.get(arr[i]);
				map.put(arr[i], ++freq);
			}
		}

		System.out.println(map);
	}
    public static void main (String[]a){
        int arr[];
		Scanner in = new Scanner(System.in);

		System.out.print("Enter size of an Array: ");
	    arr = new int[in.nextInt()];

		System.out.print("Enter "+arr.length+" elements: ");
		for(int i = 0; i < arr.length; ++i){
			arr[i] = in.nextInt();
		}


		printOcc(arr);


    }
}