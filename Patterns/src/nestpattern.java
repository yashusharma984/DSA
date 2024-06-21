
// print nested loop
//    1
//    1 0
//    1 0 1
//    1 0 1 0
//    1 0 1
//    1 0
//    1

public class nestpattern {
    public static void main(String[] args) {
        for (int i = 1; i <=4 ; i++) {

            for (int j = 1; j <=i ; j++) {
                if(j%2==0)
                {
                    System.out.print("0"+" ");
                }else{
                    System.out.print("1" +" ");
                }
            }
            System.out.println( );
        }
        for (int k = 3; k >=1 ; k--) {
            for (int w = 1; w <=k ; w++) {
                if(w%2==0)
                {
                    System.out.print("0"+" ");
                }else{
                    System.out.print("1"+" ");
                }
            }
            System.out.println( );
        }
    }
}
