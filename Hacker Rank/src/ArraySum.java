//print the sum of the array's elements: 1+2+3+4+10+11.
public class ArraySum {
    public static void main(String[] args) {
       int [] arr ={1,2,3,4,10,11};
        int sum=0;
        for(int i =0;i<=5;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
