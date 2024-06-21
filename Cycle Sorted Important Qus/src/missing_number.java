import java.util.Arrays;
// method to find out the number which is missing here...
public class missing_number {
    public static void main(String[] args) {
        int []  arr = {4,0,2,1};
        missing(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int missing(int[] arr) {
        int i = 0;
    while (i<arr.length){
        int index = arr[i];
        if( arr[i]<arr.length && arr[i] != arr[index]){
            swap(arr, i , index);
        }else{
            i++;
        }
    }
    // search for first missing number here  ( in means index )
        for (int in = 0; in <arr.length ; in++) {
            if(arr[in]!= in){
                return in;
            }
        }
        // case 2:
        return arr.length;
    }
    static  void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}
