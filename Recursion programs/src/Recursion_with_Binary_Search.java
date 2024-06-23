// Recursion question with binary Search
public class Recursion_with_Binary_Search {
    public static void main(String[] args) {
          int[] arr  = {1,2,3,4,55,66,78};
          int target =4;
          /*
          in the below case start is from 0 and end is
          equal to arr.length-1 which
           same case we use Binary search
           */
        System.out.println(search(arr,target,0,arr.length-1));
    }
    // it will return the type same as this...
    static  int search(int[] arr, int target , int start ,  int end){
      // start is greater than end
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]==target){
            return  mid;
        }
        // target is less than arr[mid] means element so end is mid-1;
        if(target<arr[mid]){
            // recursion logic here for return
           return search(arr,target, start, mid-1);
        }
        return search(arr,target,mid+1,end);
    }
}

// make sure to return the result of a function call
// of the return type...if there are return type int
// make sure you return what function are making