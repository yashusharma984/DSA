
public class Find {
    public static void main(String[] args) {
        int[] arr= {2,3,1,4,5};
        System.out.println(find(arr,4,0));
        System.out.println(findIndex(arr,4,0));

        // here we use index = arr.length-1 because we have to find from lastIndex..
        System.out.println(findIndexlast(arr,4,arr.length-1));
    }
    // here we get true / false
    static boolean find(int[]arr, int target , int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || find(arr,target,index+1);
    }
    // here we get index part returning
    static int findIndex(int[] arr, int target , int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
            return findIndex(arr , target,index+1);
        }
    }
    // find index from last
    static int findIndexlast(int[] arr, int target , int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }else{
            return findIndexlast(arr , target,index-1);
        }
    }
}
