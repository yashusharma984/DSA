import java.util.Scanner;

// count of a number
public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits you want to count");
        int num = sc.nextInt(); // 123
        int count=0;
        while(num!=0)
        {
            num = num/10;
            count++;
        }
        System.out.println(count);
    }
}
