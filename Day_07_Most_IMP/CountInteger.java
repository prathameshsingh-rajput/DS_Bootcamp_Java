import java.util.*;

public class CountInteger{
	public static void countOcc(int []arr){
		Map<Integer, Integer> map = new LinkedHashMap<>();

		for(int a : arr){
			map.put(a, map.getOrDefault(a, 0)+1);
		}

		for(Map.Entry<Integer, Integer> result : map.entrySet()){
			System.out.println(result.getKey()+" occurs "+result.getValue());
		}
	}

	public static void checkPrime(int []arr){
		for(int a : arr){
			boolean prime = true;
			if(a <= 1) prime = false;
			for(int i = 2; i <= Math.sqrt(a); ++i){
				if(a % i == 0){
					prime = false;
					break;
				}
			}
			if(prime) {
				System.out.println(a+ " is prime.");
			}
			else{
				System.out.println(a+ " is not prime.");
			}

		}
	}
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int arr[] = new int[size];

		for(int i = 0; i < size; ++i){
			arr[i] = in.nextInt();
		}
		countOcc(arr);
		checkPrime(arr);
	}
}