// In this we are finding the Binary NUmber in format of 0,1
public class SetBits {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(Integer.toBinaryString(n));
        //O/P:- 1010
          System.out.println(setBits(n));
    }
    static  int setBits(int n){
        int count =0;

//        while (n>0){
//           count++;
//           n -=(n &  -n);
//        }

        while (n>0){
            count++;
            n = n &(n-1);
        }
        return count;
    }
}
