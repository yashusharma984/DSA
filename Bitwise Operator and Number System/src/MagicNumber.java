//how to find the nth magic number
// Amazon Question...
public class MagicNumber {
    public static void main(String[] args) {
        int n =3;

        int ans =0;
        int base =4;
 // i  binary represntation it will give (1 1 0) base 2
        while (n>0){
            int last= n&1;
            // towards right shift (>>) operator
            n = n>>1;

            ans+= last *base;
            base = base *5;
        }
        System.out.println(ans);
    }
}
