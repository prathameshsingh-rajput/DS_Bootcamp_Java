public class SortingAlgorithms {
    public void bubbleSort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-i-1; ++j){

                if(arr[j+1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArr(arr);
    }

    public void selectionSort(int arr[]){
        for(int i = 0; i < arr.length-1; ++i){
            int minIdx = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        printArr(arr);
    }

    public void insertionSort(int arr[]){
        for(int i = 1; i < arr.length; ++i){
            int curr = arr[i];
            int j = i-1;
            
            while(j >= 0 && arr[j] > curr){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
        printArr(arr);
    }

    

    public void printArr(int arr[]){
        for(int i = 0; i < arr.length; ++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[]a){
        int arr[] = {5, 8, 0, 4, 1, 6, 10, 2, 89};
        SortingAlgorithms obj = new SortingAlgorithms();

        obj.insertionSort(arr);
    }
}
