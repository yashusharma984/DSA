//a
//        12
//        bcd
//        3456
public class fife {
    public static void main(String[] args) {
        char c= 'a';
        int num =1;
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i ; j++) {
                if(i%2!=0){
                    System.out.print(c);
                    c++;
                }else {
                    System.out.print(num);
                    num++;
                }
            }
            System.out.println("  ");
        }
    }
}
