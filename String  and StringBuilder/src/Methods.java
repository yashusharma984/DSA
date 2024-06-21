import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Yash bhardwaj Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('a'));
        // strip is help to remove extra space
        System.out.println("        yash   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
