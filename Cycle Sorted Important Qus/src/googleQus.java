import java.util.ArrayList;
import java.util.List;

// find the number disappear in the Array
public class googleQus {
 // use int[] nums = {4,3,2,7,8,2,3,1};
  public List<Integer> findDisappear(int[] nums)
     {
         int i =0;
         while(i<nums.length){
             int index = nums[i]-1;
             if(nums[i]!= nums[index]){
                 swap(nums,i,index);
             }else{
                 i++;
             }
         }
         // just find missing number
         List<Integer> ans = new ArrayList<>();
         for (int in = 0; in <nums.length ; in++) {
            if(nums[in]!= in+1){
                ans.add(in +1);
            }
         }
         return ans;
     }
       void swap(int[] arr,int first ,int second){
        int temp = arr[first];
        arr[first]= arr[second];
          arr[second] = temp;

    }
}
