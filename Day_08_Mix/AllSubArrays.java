public class AllSubArrays{
    public static void printAllSubArrays(int arr[]){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; ++j){
                for(int k = i; k <= j; ++k){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[]a){
        int arr[] = {1, 2, 3, 4, 5, 6};
        AllSubArrays.printAllSubArrays(arr);
    }
}