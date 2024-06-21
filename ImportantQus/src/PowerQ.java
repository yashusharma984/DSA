import java.util.Scanner;
//  write a program to check power
public class PowerQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        System.out.println("enter the power");
        int pow = sc.nextInt();
        int res=1;

        for (int i = 1; i <=pow ; i++) {
            res = res*num;
        }
        System.out.println("pow of " +num + "is" + res );
    }
}
