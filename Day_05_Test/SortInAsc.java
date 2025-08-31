/*
WAP to enter the five element and display in ascending order ?
a[0]                                a[1]                          a[2]                         a[3]                            a[4]
5 3 6 4 1

Output like as
1 3 4 5 6 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class SortInAsc{
    public List<Integer> sort(List<Integer> arr){
        if(arr == null || arr.size() <= 1) return new ArrayList<Integer>();

        for(int i = 0; i < arr.size(); ++i){
			for(int j = 0; j < arr.size() - 1 - i; ++j){
				if(arr.get(j) > arr.get(j+1)){
					int temp = arr.get(j);
					arr.set(j, arr.get(1+j));
					arr.set(j+1, temp);
				}
			}
		}

		return arr;

    }
    public static void main(String[] args) {
		Integer arr[];
		Scanner in = new Scanner(System.in);
		SortInAsc obj = new SortInAsc();

		System.out.print("Enter size of an Array: ");
	    arr = new Integer[in.nextInt()];

		System.out.print("Enter "+arr.length+" elements: ");
		for(int i = 0; i < arr.length; ++i){
			arr[i] = in.nextInt();
		}

		List<Integer> list = obj.sort(Arrays.asList(arr));
		System.out.println(list);



    }
}