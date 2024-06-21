//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
public class s3 {
    public static void main(String[] args) {
        // upper print
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
        // lower print
        for (int k = 5; k>=1 ; k--) {
            for (int e = 1; e <k ; e++) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }

    }
}
