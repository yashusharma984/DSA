//        *
//        * *
//        * * *
//        * * * *
//        * * * * *

//        * * * *
//        * * *
//        * *
//        *
public class mix_qus {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        //lower case
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
