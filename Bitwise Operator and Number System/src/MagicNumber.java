//how to find the nth magic number
// Amazon Question...
public class MagicNumber {
    public static void main(String[] args) {
        int n =6;

        int ans =0;
        int base =4;

       // i  binary represntation it will give (0 1 1) base 2
        // and the loop run 3 times ..you can check by debug
            while (n>0){
            int last= n & 1; // by this you will get binary. 0 1 1
            // towards right shift (>>) operator
            n = n>>1;

            ans+= last *base;
            base = base *5;
        }
        System.out.println(ans);
    }
}
