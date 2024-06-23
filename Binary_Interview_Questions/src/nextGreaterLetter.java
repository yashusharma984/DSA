// if there is no character in the array that is larger than the
// target element it index is automatically = 0 ( means it wrap around)


public class nextGreaterLetter {
    public static void main(String[] args) {
        // example  here target is 'j' but is there no character larger than target so o/p is 'c'
             char[] word ={'c','f','j'};
              char target ='j';
              //o/p: c
              char ans = nextGreatestLetter(word,target);
              System.out.println(ans);

    }
    public static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
 // condition for mid element find
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } // it give you the letter by reminder
        return letters[start % letters.length];
    }
}

