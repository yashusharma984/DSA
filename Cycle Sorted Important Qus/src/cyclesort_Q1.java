import java.util.Arrays;
// for ascending or decending case both use this cyclic sort method...
public class cyclesort_Q1 {
    public static void main(String[] args) {
        int [] arr ={3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i =0;
        while(i<arr.length){
            int index = arr[i]-1; // formmule use here index = value -1..here value is arr[i[
            if(arr[i] != arr[index]){ // here we compare that array value is equal to array index...
                swap( arr, i , index);
            }
            else{
                i++;
            }
        }
    }
    // use swap method to arrange it....
    static  void swap(int [] arr, int first , int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] = temp;
    }
}
