import java.util.ArrayList;

public class Find{
    public static void main(String[] args) {
//        int[] arr= {2,3,1,4,5};
        int[] arr = {2,3,1,4,4,5};
        System.out.println(find(arr,4,0)); //O/P:- TRUE

        System.out.println(findIndex(arr,4,0)); // O/P:- 3

        // here we use index = arr.length-1 because we have to find from lastIndex..
        System.out.println(findIndexlast(arr,4,arr.length-1)); // O/P:- 4

        // here ww find the index... O/P:- [3,4]
//        findAllIndex(arr,4,0);
//        System.out.println(list);

           ArrayList<Integer> ans = findAllIndex(arr,4,0,new ArrayList<>());
        System.out.println(ans);  // O/P: [3,4] , size of array is 2.
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

    // after find answer add in the list.. by using Arraylist...
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target , int index){
        if(index==arr.length){
            return ;
        }
        if(arr[index]==target){
            list.add(index);
        }  // call rest of array...
        findAllIndex(arr,target,index+1);
    }


    // O/P: [3,4] , size of array is 2.
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index , ArrayList<Integer> list){
      if(index==arr.length){
        return list ;
    }
        if(arr[index]==target){
        list.add(index);
    }  // call rest of array...
    return findAllIndex(arr,target,index + 1,list);
}
}
