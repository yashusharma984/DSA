// In this we are checking that number is Odd or Even...
public class oddEven {
    public static void main(String[] args) {
       int n = 68;
        System.out.println(isodd(n));
    }
    static boolean isodd(int n ){
        return (n & 1) == 1;
    }
}
