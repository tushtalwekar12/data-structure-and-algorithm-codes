package section_01_function_and_methods.function_overloading;
//function overLoading - mutiple function with same name but different parameter
// parameter : pass the value of numbers when u are calling the function in main()
public class Example01 {
    // function 1 - adding two numbers
    public static int sum(int a, int b){
        return a+b;
    }
    // function 2 - adding three numbers
    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    // function 3 - multiply 2 numbers
    public static float multiply(float a, float b){
        return a * b;
    }
    // function 4 - multiply 3 numbers
    public static float multiply(float a , float b, float c){
        return a * b * c;
    }
    public static void main(String[] args) {
       System.out.println(sum(2,3));
       System.out.println( sum(2,3,1));

       System.out.println(multiply(2,5));
       System.out.println(multiply(2,3,2));
    }
}
