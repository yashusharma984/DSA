public class finaacii_number_loops {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.println(finacciformula(i));
        }
    }
    static int finacciformula(int n){
         return (int)(Math.pow(((1+Math.sqrt(5))
                 /2),n)/Math.sqrt(5));
    }
    static int fibo(int n){
        // base condition..
        if(n<2){
            return n;
        }
        // finacii basic formula to find limit finaaci number
        // for more it will create exponential complexity
        // due to duplicate of finacciis.. no ouput will come...
        return fibo(n-1)+fibo(n-2);
    }
}
