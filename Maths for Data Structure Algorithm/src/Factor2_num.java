public class Factor2_num {
    public static void main(String[] args) {
        factor2(20);
    }

    // Time Complexity = O(sqrt(n))
    static void factor2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + n / i + " ");
                    //O/P: 1 20 2 10 4 5
                }
            }
        }
    }
}