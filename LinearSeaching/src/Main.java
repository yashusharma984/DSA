public class Main {
    public static void main(String[] args) {
        int[] nums ={23,34,2,12,53,23,132,123,43};
        int target =53;
        int ans = linearSearch(nums , target);
        System.out.println(ans);

    }
    // search in the array :return the index if item fond
    // other wise if item not found return -1

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is =target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line execute if none of the retunr statements above have executed
        //hence the target not found
        return-1;

    }
}