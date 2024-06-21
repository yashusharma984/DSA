import java.util.Arrays;

public class Search2dArr {
    public static void main(String[] args) {
        int[][] arr = {
            {23,2,3},
            {12,32,4,6},
            {33,59,52,5},
            {12,43}
            };
        int target = 5;
        int [] ans = search(arr,target); // format of return value {row ,col}
        System.out.println(Arrays.toString(ans));
        System.out.println("maximum in 2-d Array : "+ max(arr));
        System.out.println("minimum in 2-d Array : "+ min(arr));

    }
    // search array
    static int[] search(int[][]arr ,int target){
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col]==target){
                    return new int[] {row ,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    // maximum value
    static int max(int[][]arr){
        int max =Integer.MIN_VALUE;
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col]>max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
 // minimum value

    static int min(int[][]arr){
        int min = Integer.MAX_VALUE;
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col]<min){
                    min = arr[row][col];
                }
            }
        }
        return min;
    }

}
