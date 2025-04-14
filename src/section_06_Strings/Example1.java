package section_06_Strings;
// check if string is palindrome
public class Example1 {
    public static boolean ispalindrome(String str){
        for (int i=0; i<str.length()/2; i++){
            int n =str.length();
            // check condition for not a palindrome
            if (str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(ispalindrome(str));
    }
}
