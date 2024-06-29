import java.util.ArrayList;
// In this Question we are find the factor number...
// and in this we check repeated also by using Arraylist
// time and space both will be Big_O(sqrt(n))
// O/P :- 1 20 2 10 4 5
public class ArrayList_Sqr_Root_Factor {
    public static void main(String[] args) {
      factor(20);
    }
    static void factor(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i+" ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.print(list.get(i)+ " ");
        }
        }
    }
