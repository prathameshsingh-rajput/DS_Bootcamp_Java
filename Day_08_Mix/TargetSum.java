public class TargetSum {
    public static void getTargetSum(int []arr, int target){
        int sum = 0, i = 0, j = arr.length-1;

        while(i < j){
            sum = arr[i] + arr[j];
            if(sum == target){
                System.out.println("["+arr[i]+","+arr[j]+"]");
                return;
            }else if(sum > target){
                j--;
            }else{
                i++;
            }
        }
    }
    public static void main(String[]a){
        int []arr = {1, 5, 6, 8, 9, 10};
        int target = 19;
        TargetSum.getTargetSum(arr, target);
    }
    
}
