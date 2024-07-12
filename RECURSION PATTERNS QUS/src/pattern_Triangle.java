/*
Qus : print a pattern with the use of recursion
           * * * *
           * * *
           * *
           *
 */

public class pattern_Triangle {

    public static void main(String[] args) {
          triangle(4,0);
          triangle2(4,0);



    }
    static  void triangle(int row , int col){
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print("* ");
            triangle(row, col+1);
        }else{
            System.out.println();
            triangle(row-1 , 0);
        }
    }

    // normal traingle
    static  void triangle2(int row , int col){
        if(row==0){
            return;
        }
        if(col<row){
            triangle2(row, col+1);
            System.out.print("* ");
        }else{
            triangle2(row-1 , 0);
            System.out.println();
        }
    }
}
