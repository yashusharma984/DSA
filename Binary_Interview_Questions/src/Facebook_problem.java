public class Facebook_problem {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        // check  first occurance of target
        ans[0] = search(nums, target, true);
        if (ans[0] != 1) {
        ans[1] = search(nums, target, false);
    }
        return ans;
    }
    //  this function just return the index of target
    int search(int[] nums, int target ,boolean findstartIndex){

        int ans =-1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            // to find middle element
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potentiAL ANS FOUND
                ans = mid;
                if(findstartIndex==true){
                    end = mid-1;}else{
                    start = mid+1;
                    }
                }
        }
        return  ans;
    }
}
