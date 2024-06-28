public class Prime_Number {
    public static void main(String[] args) {
        int n = 13;
        for (int i = 1; i<=n ; i++) {
            if( n % i !=0){
                System.out.println(i+ " is Not Prime ");
            } else {
                System.out.println(i + " is Prime ");
            }
        }

    }
}
