// find in the range of array [1 to 4 ]
public class searchInRange {
    public static void main(String[] args) {
     int[] num = {12,32,53,23,43,132,35,32,543,32,432};
     int target =23;
        System.out.println(Range(num ,target , 1 ,6));
    }

    static  int Range(int[] arr , int target , int start , int end){
        if(arr.length==0){
            return  -1;
        }
        for (int index = start; index <end ; index++) {
            int element =arr[index];
           if(element==target) {
                return index;
            }
        }
        return -1;
    }
}
