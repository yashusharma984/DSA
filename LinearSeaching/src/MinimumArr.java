// find the minimum array in this range
public class MinimumArr {
    public static void main(String[] args) {
        int [] Num = {12,32,23,54,3,11,34,2};
        System.out.println( "The minimum array is  : " +MinArr(Num) );
    }
    static  int MinArr(int[]arr){
        int ans = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}
