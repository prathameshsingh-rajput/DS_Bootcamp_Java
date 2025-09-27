public class QuickSort2{
    public static void quickSort2(int []arr, int si, int ei){
        if(si >= ei) return;

        int pivotIndex = partition(arr, si, ei); 

        quickSort2(arr, si, pivotIndex-1);
        quickSort2(arr, pivotIndex+1, ei);
    }

    public static int partition(int []arr, int si, int ei){
        int pivot = arr[ei];
        int k = si - 1;
        int i = si;
        for(i = si; i < ei; ++i){
            if(arr[i] < pivot){
                int temp = arr[i];
                arr[i] = arr[++k];
                arr[k] = temp;
            }
        }     
        int temp = arr[++k];
		arr[k] = pivot;
		arr[ei] = temp;     
        return k;
    }
    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 10, 1, 2, 1};
        quickSort2(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}