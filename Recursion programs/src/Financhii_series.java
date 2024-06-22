public class Financhii_series {
    public static void main(String[] args) {
//        System.out.println(fibo(2));
//        System.out.println(fibo(5));
        int ans = fibo(6);
        System.out.println(ans);
    }
    static  int fibo(int n){
        // base condition

        if(n<2){
            return n;
        }
      return fibo(n-1) + fibo(n-2); // formula use...
    }
}
