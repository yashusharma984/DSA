//        A
//        1 1
//        B C D
//        1 1 1 1
//        E F G H I
public class six {
    public static void main(String[] args) {
        char c ='A';
        for (int i = 1; i <=5 ; i++) {

            for (int j = 1; j <=i ; j++) {
                if(i%2!=0)
                {
                    System.out.print(" "+c);
                    c++;
                }else{
                    System.out.print(" 1");
                }
            }
            System.out.println(" ");
        }
    }
}
