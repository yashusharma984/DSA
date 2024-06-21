// uSE binary Sorted method...
public class Find_element {
    public static void main(String[] args) {
     int [] arr ={2,3,5,9,14,16,18};
     int target =14;
        System.out.println( "Index of Array  : "+Binary(arr,target));
    }

    static int Binary(int[] arr, int target) {
        // check start to end
        int start = 0;
        int end = arr.length - 1;
        // condition if start less than , equal to end
        while (start <= end) {

            // find element condition & formula
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
