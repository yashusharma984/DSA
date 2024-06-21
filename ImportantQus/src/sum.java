import java.util.Scanner;

// sum of number
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        if (num % 2 == 0) {
            for (int i = 0; i < num; i++) {
                sum = sum + i;
            }
            System.out.println("total sum is " + sum);
        }
    }
}
