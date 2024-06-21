/*
palidrone case here we use to find...
 */
public class palidrone {
    public static void main(String[] args) {
//   String str = "abccba";
//   String str = "abvca"; it is not plalidrone
        String str = "";
        System.out.println(ispalidrone(str));
    }
    static  boolean ispalidrone(String str){
        // below case show that if the string is null or equal to zero it give true.....
        if(str == null || str.length()==0){
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i <=str.length() /2 ; i++) {
             char start = str.charAt(i);
             char end = str.charAt(str.length()-1-i);

             if(start!=end){
                 return false;
             }
        }
        return true;
    }
}
