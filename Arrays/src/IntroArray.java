public class IntroArray {
    public static void main(String[] args) {
//         store a roll number
        int a =20;

        // declaraion syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers:
        int[] rno1 = new int[5];
        int[] rno2 = { 12,32,33,2,32};
        int[] rno3 ; //declaration of array ros is getting defined in the stack
        rno3 = new int[5]; // actually here object is being created in the memory(heap)
        System.out.println(rno2[4]);
        String[] arr = new String[3];
        System.out.println(arr[0]);
    }
}
