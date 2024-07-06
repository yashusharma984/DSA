public class Sorted {
    public static void main(String[] args) {
       int[] arr ={1,2,3,5,6,8};
        System.out.println(sorted(arr,0));
    }
    // Qus:- We have check with
    // the help of Recursion that this
    // is sorted array or not
    static boolean sorted(int[] arr, int index) {
        // base condition of recursion
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr, index +1);
    }
}
