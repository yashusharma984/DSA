import java.util.Arrays;
// Merge sort example here in which we use merge sort by using three steps...

// 1. divide the array in 2 parts
// 2. divide the length of array by half...
// 3. Add the first and second  half arrays and merge in a single and return the mix array..

// below code to understand....

public class merge_example {
    public static void main(String[] args) {
        int[] arr = {5,3,2,7,21};
        int[] ans = mergesort(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] mergesort(int[] arr) {
        if(arr.length==1){
            return  arr;
        }
        int mid = arr.length/2;
        int[]left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left , right);
    }

    private static int[] merge(int[] first, int[] second) {
        int [] mix = new int [first.length+second.length];

        int i =0;
        int j =0;
        int k =0;

        while(i<first.length && j< second.length){
            if(first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k]=second[j];
                        j++;
            }
            k++;
        }
        // it may be possible that one of these arrays is not complete.
        // copy the remaining elements..
        while (i < first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return  mix;
    }

}
