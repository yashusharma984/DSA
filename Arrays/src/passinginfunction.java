import java.util.Arrays;

public class passinginfunction {
    public static void main(String[] args) {
  int[] num = {23,34,3,54,3 };
        System.out.println(Arrays.toString(num));
change(num);
        System.out.println(Arrays.toString(num));
    }
    static void change(int[] arr){
        arr[0]=99;
    }
}
