// Reverse

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev=0 , count=0;

        while(num!=0){
            int rem = num%10;  // 123%10 =3      // 12%10 =2
            rev = rev*10+ rem; // 0*10 + 3 = 3  // 3*10 +2 =32
            {
                count++;      // 1  // 2
            }
            num = num/10;  // 3    // 32
        }
        System.out.println("coutn here " +count);
        System.out.println("reverse number" + rev);
    }
}
