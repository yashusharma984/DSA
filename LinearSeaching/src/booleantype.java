// check by linear method the array are present or not
public class booleantype {
    public static void main(String[] args) {
        int []num ={22,5354,32243,6453,1332,54343,31234242,32,};
        int target=32;
        boolean type = returnl(num , target);
        System.out.println("Target is : " + type);
    }
    static boolean returnl(int[]arr ,int target){
        if(arr.length==0){
            return false;
        }
        // use for eachloop
        for (int element:arr) {
            if(element==target){
                return true;
            }
        }
        return  false;
    }
}
