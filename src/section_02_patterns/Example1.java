package section_02_patterns;
// star pattern
public class Example1 {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){  // outer loop - number of lines to print
            for (int j = 1; j<=i; j++){  // i times print
                System.out.print("*"); // what to print
            }
            System.out.println(); // next line
        }
    }
}
