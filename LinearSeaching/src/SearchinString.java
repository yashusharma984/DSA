public class SearchinString {
    public static void main(String[] args) {
        String name= "Yash Bhardwaj";
        char target ='d';
        System.out.println(searchCh(name,target));
    }
    static boolean searchCh(String str , char target){
        if(str.length()==0){
            return false;
        }
        // for loop use here
//        for (int i = 0; i <str.length() ; i++) {
//            if(target==str.charAt(i)){
//                return true;
//            }
//        }

        // use for each loop
        for ( char ch :str.toCharArray()
             ) { if (ch==target){
                 return true;
        }

        }
        return false;
    }
}
