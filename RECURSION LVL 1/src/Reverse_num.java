// Reverse A numbewr by using Recursion method
public class Reverse_num{
    public static void main(String[] args) {
        rev1(1234);
        System.out.println(rev);
    }
    static  int rev =0;
    // method one to Reverse a number...
    static void rev1(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        rev =rev * 10 +rem;
        rev1(n/10);
    }

    static void rev2(int n){
        // sometimes you might
        // need some additional variables in the arguments
        // in that case, make another function
    }
}
