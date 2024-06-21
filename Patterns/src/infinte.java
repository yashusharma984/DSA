//   print noop question=- infinte loop
//   1
//   2 3
//   4 5 6
//   7 8 9 1
//   2 3 4 5 6
//   7 8 9 10 11

public class infinte {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; ; i++) {
            for (int j = 1; j <= i; j++) {
                if (num >= 9) {
                    System.out.print(num);
                }
                if (j <= 4 && i <= 4) {
                    System.out.print(num);
                }
            }
                System.out.println();
                num++;
            }
        }
    }

