// In this question we are using powers how to manage...
public class Power {
    public static void main(String[] args) {
        int base = 3; // 3^6  3 power is 6
        int power = 6;

        int ans =1;

        while(power>0){
            // condition
            if((power & 1)==1) {
                ans *= base;
            }
            base *= base;
          power = power>>1;
        }
        System.out.println(ans);
    }
}
