
//        Z
//        5 9
//        X V T
//        13 17 21 25

public class seceb {
    public static void main(String[] args) {
        char c ='Z';
        int num = 5;
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i ; j++) {
                if(i%2!=0)
                {
                    System.out.print(" " +c);
                    c-=2;
                } else{
                    System.out.print(" " +num);
                    num+=4;
                }
            }
            System.out.println(" ");
        }
    }
}
