public class Lq2 {
    public static void main(String[] args) {
// if the array is not found return -1
        int []num = {1,4,-2,42,-4,2332,1,-83,245};
        int target =-4;
        int ans=LinearS(num ,target);
        System.out.println(ans);
    }

    // make a static array
    static int LinearS(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            // check here element is =target
            int element = arr[index];
            {
                if (element == target) {
                    return index;
                }
            }
        }
        // if target  not found
        return -1;
    }
}
