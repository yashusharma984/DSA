public class l3 {
    public static void main(String[] args) {

        int []val ={12,32,23,43,565,-56445,-545434,-4334,54435,5445,-34+3,3544};
        int target=-34+3;
        int ans= Linear(val ,target);
        System.out.println("Array index number is : " + ans);
    }
    static int Linear(int[]arr , int target){
        if(arr.length==0){
            return -1;
        }
        // loop here for find index and matech element = target
        for (int index = 0; index <arr.length ; index++) {
            // if element = target it give return index
            int element = arr[index];{
                if(element==target){
                    return index;
                }
            }
        }
        // if the target not found it return -1
        return -1;
    }
}
