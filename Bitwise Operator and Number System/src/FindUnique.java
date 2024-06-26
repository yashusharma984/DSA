// In this question will find the Unique arr..
// X(OR) Method based Question....
public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,2,6,4};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
     int unique =0;
        for (int n:arr){
            // X^(OR) method has been used here ..
            // due to X(OR) method it will make duplicate
            // value will be 0.
         unique^=n;
        }
     return unique;
    }
}
