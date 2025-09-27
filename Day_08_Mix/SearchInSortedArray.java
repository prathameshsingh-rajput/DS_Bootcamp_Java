public class SearchInSortedArray {
    public static int searchTarget(int []arr, int target, int si, int ei){
        if(si > ei) return -1;
        
        
            int mid = si + (ei - si);

            //target found
            if(arr[mid] == target){
                return mid;
            }

            // mid on Line 1
            if(arr[si] <= arr[mid]){
                //case 1: left
                if(arr[si] <= target && target <= arr[mid]){
                    return searchTarget(arr, target, si, mid-1);
                }
                else{
                    //case 2: right
                    return searchTarget(arr, target, mid+1, ei);
                }
            }
            // mid on Line 2
            else{
                //case 3: right
                if(arr[mid] <= target && target <= arr[ei]){
                    return searchTarget(arr, target, mid+1, ei);
                }else{
                    //case 4: left
                    return searchTarget(arr, target, si, mid-1);
                }
            }
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3, 4,};
        int target = 90;
        int result = searchTarget(arr, target, 0, arr.length - 1);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}

