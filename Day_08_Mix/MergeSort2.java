public class MergeSort2 {
    public static void mergeSort(int arr[], int si, int ei){
        if(si >= ei) return;

        int mid = si + (ei - si) / 2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merger(arr, si, ei, mid);
    }

    public static void merger(int arr[], int si, int ei, int mid){
        int temp[] = new int[ei - si + 1];
        int i = si, j = mid+1, k = 0;

        while(i <= mid && j <= ei){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid){
            temp[k++] = arr[i++];
        }

        while(j <= ei){
            temp[k++] = arr[j++];
        }

        for(int a = si, m = 0; a < temp.length; ++a){
            arr[a] = temp[m++];
        }
        return;
    }
    public static void main(String[] args) {
        int arr[] = {40, 50, 10, 8, 18, 90};
        mergeSort(arr, 0, arr.length-1);

        for(int i : arr){
            System.out.println(i+" ");
        }
    }
}
