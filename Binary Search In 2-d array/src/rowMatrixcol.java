import java.util.Arrays;

public class rowMatrixcol {
    public static void main(String[] args) {
        int[][] arr ={
                {10,20,30},
                {15,25,35,},
                {28,39,37}
        };
        int target = 25;
        System.out.println(Arrays.toString(Matrix(arr,target)));
    }
    static  int [] Matrix(int[][]matrix , int target){
        int row =0;
        int col = matrix.length-1;
        // condition here
        while(row<matrix.length && col>=0){
            if(matrix[row][col]<=target){
                return new int[]{row,col};
            }
            // condition if the row , col less than target so row will increase , otherwise columjn will decrease
            if(matrix[row][col]<target){
                row++;
            }else{
                col--;
            }
        }
        return new int[] {-1,-1};
    }
}
