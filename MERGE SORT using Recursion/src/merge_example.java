import java.util.Arrays;
// Merge sort example here in which we use merge sort by using three steps...

// 1. divide the array in 2 parts
// 2. divide the length of array by half...
// 3. Add the first and second  half arrays and merge in a single and return the mix array..

// below code to understand....

public class merge_example {
    public static void main(String[] args) {
        int[] arr = {5,3,2,7,21};
        mergesortInPlace(arr , 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void  mergesortInPlace(int[] arr , int s , int e) {
        if(e-s ==1){

            return ;
        }
        int mid = (s+e) / 2;

         mergesortInPlace( arr,s,mid);
         mergesortInPlace(arr,mid,e);

         mergeInPlace(arr,s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s , int m, int e ) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // it may be possible that one of these arrays is not complete.
        // copy the remaining elements..
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l <mix.length ; l++) {
             arr[s+l] = mix[l];
        }
    }

}
