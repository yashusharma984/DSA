// qus = the maximum height candles are 4 with high , the 2 of largest return
// so the o/p : 2 ;

import java.util.List;

public class BirthdayCake {
    public static void main(String[] args) {
//  simple method to get return ans...

       int [] candles = {4,4,1,3};
     int max =0;
     int count =0;
     // find the largest element in
        for (int i = 0; i <=3 ; i++) {
            if(candles[i]>max){
                max = candles[i];
            }
        }
        // total no of largest element in array
        for (int i = 0; i <=3 ; i++) {
            if(candles[i]==max){
                count++;
            }
        }
        System.out.println(count);
    }


        // second method to solve............

//        int[] candles = {4,4,1,3};
//        int size=0;
//
//    }
//    static  int birthday(List<Integer> candles){
//     int n = candles.size();
//     int max =0;
//     int count=0;
//     // find the largest element in the candles
//        for (int i = 0; i <n ; i++) {
//            if (candles.get(i)>max){
//                max = candles.get(i);
//            }
//        }
//        //find the number of largest element in array
//        for (int i = 0; i <n ; i++) {
//            if(candles.get(i)==max){
//                count++;
//            }
//        }
//        return count;
//    }
}
