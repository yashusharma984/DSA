import java.util.Arrays;
import java.util.Scanner;

public class mutiDimension {
    public static void main(String[] args) {


        /*
        1 2 3
        4 5 6
        7 8 9
         */
        // 2d arrays
//        int[][] arr = new int[3][3];
//        int[][] arr ={
//                {1, 2, 3},
//                {4 ,5, 6},
//                {7, 8, 9}
//        };

        Scanner sc = new Scanner(System.in);
        System.out.println("enter row size");
        int size1 = sc.nextInt();
        System.out.println("enter column size");
        int size2 = sc.nextInt();
        int [][] arr = new int[size1][size2];
        System.out.println("size of arrays " + arr.length); //no.of rows
        // input

        System.out.println("enter the values here ");
        for (int row = 0; row <arr.length ; row++) {
            //for each col in every row
            for (int col = 0; col <arr[row].length ; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        System.out.println("now the output has start");
        // output
//        for (int row = 0; row <arr.length ; row++) {
//            //for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println( );
//        }
        // second way to print
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
        // third way to print
        for(int[] a:arr)
        {
            System.out.println(Arrays.toString(a));
        }
    }
}
