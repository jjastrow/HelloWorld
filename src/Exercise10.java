/**
 * Created by zach on 3/10/16.
 */
public class Exercise10 {
    public static void main(String[] args) throws Exception {
        String palindrome = "racecar";
        String nonPalindrome = "hello";
        if (isPalindrome(palindrome) && !isPalindrome(nonPalindrome)) {
            System.out.println("IT WORKS!");
        }
        else {
            throw new Exception("Fail");
        }
    }

    public static boolean isPalindrome(String s) {
        //return s.equals(new StringBuilder(s).reverse().toString());

//        int i = 0;
//        while (true) {
//            if (i == s.length()/2) {
//                return true;
//            }
//            else if (s.charAt(i) == s.charAt(s.length()-i-1)) {
//                i++;
//            }
//            else {
//                return false;
//            }
//        }

        int len = s.length();
        for (int j = 0; j < len/2; j++) {
            if (s.charAt(j) != s.charAt(len-j-1)) {
                return false;
            }
        }
        return true;
    }
}
