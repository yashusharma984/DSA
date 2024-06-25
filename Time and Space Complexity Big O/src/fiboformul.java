// this will give you the nth finaccii number so the
// output of this program is :- 14472334024676260
// in this we use direct formula of find nth finacci number
public class fiboformul {
    public static void main(String[] args) {
        System.out.println(fiboformula(79));
    }
    static long fiboformula(long n){
        // direct formula of nth finacci number .
        // ..sqrt means square root of 5
        return (long)(Math.pow(((1+Math.sqrt(5))/2),n)
                /Math.sqrt(5));
    }
    static long fibo(long n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
