public class minimumNum {
    public static void main(String[] args) {
        int[] arr ={14,23,232,-7,2,32,94};
        System.out.println(min(arr));
    }
     /// assume arr.length !=0
    static  int min(int[]arr){
        int ans =arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
