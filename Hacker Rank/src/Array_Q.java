public class Array_Q {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9};
        int max = 0;
        int min = 0;
        for (int i = 0; i <= 4; i++) {
            if (i <= 3) {
                max = max + arr[i];
            }
            else {
                for (i = 1; i <= 4; i++) {
                    min = min + arr[i];

                }
            }
        }
        System.out.print(max );
        System.out.print(" ");
        System.out.print(min);
    }
}
