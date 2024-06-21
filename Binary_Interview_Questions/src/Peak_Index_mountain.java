// peak index in a mountain Array
// arr=[0,1,0]
// arr = [0,2,1,0]
public class Peak_Index_mountain {
    public static void main(String[] args) {
      int [] num= {0,2,1,0};
        System.out.println("peak index of mountain :"+ peakIndexMountainArray(num));
    }
    public static int peakIndexMountainArray(int[]arr ){
         int start =0 ;
         int end = arr.length-1;
         while(start<end){
             int mid = start +(end-start)/2;
             if(arr[mid]> arr[mid+1]){
                 // you are in dec part of Array
                 // this may be the ans , but look at left
                 //this is why end!=mid-1
                 end=mid;
             }
             else {
                 //you are in asc part of array
                 start = mid+1; // because we know that mid+1 element > mid element
             }
         }
         // in the end , start ==end and pointing to the largest number because of the 2 check above
        // start and end are always trying to find max element in the above 2 checks
        // hence when they are pointing to just one element,that is the max one because that is what the check says
        // more elabortation at every point of time for start and end , they have the best possible answer till that time
        // if we are saying that only one item is remaining ,hence cuz of above line is the best possible ans
    return start; //or return end as both are;
    }
}
