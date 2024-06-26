// In this question we are find the number of Digits ...
public class NoOfDigits {
    public static void main(String[] args) {

        int n = 10;
        int base = 2;
        int ans = (int)(Math.log(n)/Math.log(base))+1;

        System.out.println(ans);
    }
}
