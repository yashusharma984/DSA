public class BinarySearchSQRT {
    public static void main(String[] args) {
        // In this question i am finding the squae_root of 40..
        int squr_root = 40;
        int p =3;

        System.out.println(sqrt(squr_root,p));
    }
    // time  complexity :O(log(n))
    static double  sqrt(int n , int p){
        int start =0;
        int end =n;

        double root = 0.0;
// Binary logic start here
        while (start<=end){
            int mid = start +(end-start)/2;

            // square of mid == n
            if(mid*mid ==n){
                return mid;
            }
            if(mid*mid>n){
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        double incr =0.1;
        for (int i = 0; i <p; i++) {
            while (root*root<=n){
                root+=incr;
            }
            root-=incr;

            incr/=10;
        }
        return root;
    }
}
