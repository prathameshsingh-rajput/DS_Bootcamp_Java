public class Sortings{
	public int[] bubbleSort(int []arr){

		for(int i = 0; i < arr.length-1; ++i){
			boolean isSorted = true;
			for(int j = 0; j < arr.length-1-i; ++j){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSorted = false;
				}
			}
			if(isSorted) return arr;
		}
		return arr;
	}

	public int[] selectionSort(int []arr){
		for(int i = 0; i < arr.length-1; ++i){
			int min = i;
			for(int j = i+1; j < arr.length; ++j){
				if(arr[min] > arr[j])
					min = j;
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}

	public int[] insertionSort(int []arr){

	}

	public void print(int []arr){
		System.out.print("\nArray => ");
		for(int i = 0; i < arr.length; ++i){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[]a){
		int []arr = {5, 2, 4, 1, 6, 3};
		int []arr1 = {0, 1, 2, 3, 4, 5};
		Sortings s = new Sortings();

		//s.print(s.bubbleSort(arr));
		s.print(s.selectionSort(arr));
	}
}

