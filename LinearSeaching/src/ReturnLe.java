public class ReturnLe {
    public static void main(String[] args) {
int []num ={12,132,43,12,53,21,432,-34,32};
int target=-34;
int ans =returnle(num , target);
        System.out.println(ans);
    }
    static int returnle(int[]arr , int target){
        if(arr.length==0){
            return -1;
        }
        // use for eachloop here
        for (int element:arr) {
            if(element==target){
                return element;
            }
        }
        return -1;
    }
}
