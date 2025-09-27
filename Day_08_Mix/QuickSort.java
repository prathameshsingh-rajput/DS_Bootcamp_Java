public class QuickSort{
	public static void quickSort(int arr[], int si, int ei){
		if(si >= ei) return;

		int pIdx = partition(arr, si, ei);

		quickSort(arr, si, pIdx-1);
		quickSort(arr, pIdx+1, ei);

	}

	public static int partition(int arr[], int si, int ei){

		int pivot = arr[ei];
		int k = si-1;
		int i = 0;

		for(i = si; i < ei; ++i){
			if(arr[i] < pivot){
				int temp = arr[++k];
				arr[k] = arr[i];
				arr[i] = temp;
			}
		}
		int temp = arr[++k];
		arr[k] = pivot;
		arr[ei] = temp;

		return k;
	}


	public static void main(String[]args){
		int []arr = {5, 8, 7, 1, 6, 0, 9, 9};

		quickSort(arr, 0, arr.length-1);
		for(int i = 0; i < arr.length; ++i){
			System.out.print(arr[i]+" ");
		}

		System.out.println();
	}
}