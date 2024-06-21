import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // array is fixed
        // arraylist is a part of collection
        // suntax
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(67);
//        list.add(7);
//        list.add(6);
//        list.add(12);
//        list.add(627);
//        list.add(45);
//        list.add(323);

//        System.out.println(list.contains(43432323));
//        list.set(0,84);
//        list.remove(2);
//        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here ,
        }
        System.out.println(list);
    }
}
