import java.util.*;

public class TargetSumPair{
	public static List<List<Integer>> getTargetSumPair(int arr[], int target){
		List<List<Integer>> result = new ArrayList<>();

		for(int i = 0; i < arr.length-1; i++){

			for(int j = i+1; j < arr.length; ++j){

				if(arr[i] + arr[j] == target){
					int min = Math.min(arr[j], arr[i]);
					int max = Math.max(arr[j], arr[i]);
					result.add(Arrays.asList(min, max));
				}
			}
		}

		return result;
	}

	public static void main(String[]a){
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();
		int arr[] = new int[size];

		for(int i = 0; i < size; ++i)
			arr[i] = in.nextInt();
		int t = in.nextInt();
		System.out.println(getTargetSumPair(arr, t));
	}
}