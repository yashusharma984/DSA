import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//        // arrays of primitives
//        arr[0] = 23;
//        arr[1] =45;
//        arr[2] =34;
//        arr[3] =32;
//        arr[4] =31;
//        System.out.println(arr[3]);
//
//        // input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
////        for (int i = 0; i < arr.length; i++) {
////            System.out.println(arr[i] + " ");
////        }
//
        // array of objects
        String[]  str = new String[4];
        for (int i = 0; i <str.length ; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "yash";
    }
}
