package section_06_Strings;
// String function - compare == , .equals()
public class Example3 {
    public static void main(String[] args) {
        String s1 ="Tony";
        String s2 ="Tony";
        String s3 =new String("Tony");

        // 1. == compares object references, not content.
        if (s1 == s2){  // true
            System.out.println("String are equal");
        }else {
            System.out.println("String are not equal");
        }

        if (s1 == s3){ // false
            System.out.println("String are equal");
        }else {
            System.out.println("String are not equal");
        }

        // 2. .equals() -  This checks the actual content of the strings: "Tony" equals "Tony" → true
        if (s1.equals(s3)){  // true
            System.out.println("String are equal");
        }else {
            System.out.println("String are not equal");
        }
    }
}
