//        1
//        11
//        111
//        1111
//        ***
//        **
//        *

public class qus {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            if (i <= 4) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("1");
                }
            } else {
                for (int j = 7; j >= i; j--) {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }
}

