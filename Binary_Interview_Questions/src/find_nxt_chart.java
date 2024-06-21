public class find_nxt_chart {
    public static void main(String[] args) {
        char[]wrd={'a','b','c'};
        char target ='c';
        //o/p:-a
        char ans = nextGen(wrd,target);
        System.out.println(ans);
    }

    static char nextGen(char[] word, char target) {
        int start = 0;
        int end = word.length - 1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<word[mid]){
                end = mid-1;}
            else{
                start= mid+1;
            }
        }
        return word[start%word.length];
    }
}
