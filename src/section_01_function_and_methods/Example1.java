package section_01_function_and_methods;
// add two number
public class Example1 {
    public static  int addTwoNum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(addTwoNum(a,b));
    }
}
