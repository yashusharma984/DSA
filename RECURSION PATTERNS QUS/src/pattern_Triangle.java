/*
Qus : print a pattern with the use of recursion
           * * * *
           * * *
           * *
           *

           *
           * *
           * * *
           * * * *
 */

import java.util.Arrays;

public class pattern_Triangle {

    public static void main(String[] args) {

        triangle(4, 0);
        triangle2(4, 0);

        int[] arr = {4, 3, 2, 1};
        bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void triangle(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("* ");
            triangle(row, col + 1);
        } else {
            System.out.println();
            triangle(row - 1, 0);
        }
    }

    // normal traingle
    static void triangle2(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            triangle2(row, col + 1);
            System.out.print("* ");
        } else {
            triangle2(row - 1, 0);
            System.out.println();
        }
    }

    // bubble sort....question here
    static void bubble(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {

            if (arr[col] > arr[col + 1]) {
                // swap
                int temp = arr[col];
                arr[col] = arr[row];
                arr[col + 1] = temp;
            }
            bubble(arr, row, col + 1);
        } else {
            bubble(arr, row - 1, 0);
        }
    }
}
