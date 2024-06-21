import java.util.ArrayList;
import  java.lang.Integer;
public class Operators {
    public static void main(String[] args) {
     /*
 The operator will convert string into integer value example is given below:-
    o/p : 195      */
        System.out.println('a' + 'b'); // operator example
        System.out.println("a" +"b"); // string example
        System.out.println((char)('a'+ 3)); // char example it will convert integer into character
        System.out.println("a" +1);
        // this is same as after a few steps: "a" +"1"
        // integer will be converted to Integer that will call toString()
        System.out.println("yash" + new ArrayList<>()); // o/p:- yash[]
        System.out.println("yash" + new Integer(54));
         String ans = new Integer(56) + "" + new ArrayList<>();
        System.out.println(ans);

    }
}
