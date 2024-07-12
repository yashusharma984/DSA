import java.util.ArrayList;

public class findAllindex2 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,4,5};

        ArrayList<Integer> ans = findallindex2(arr, 4,0);
        System.out.println(ans); //O/P: [3 ,4]

    }
    static ArrayList<Integer> findallindex2(int[] arr ,int target , int index){
      ArrayList<Integer> list = new ArrayList<>();

        if(index==arr.length){
            return list;
        }
        // this will contain answer for that function call only
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansfrombelowcalls = findallindex2(arr,target,index+1);

        // using addAll here to add all...
        list.addAll(ansfrombelowcalls);

        return list;
    }
}
