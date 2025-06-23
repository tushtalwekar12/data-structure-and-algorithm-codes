package section_01_function_and_methods;
// syntax - function - block of code , reusable code
public class Example1 {
    // write printHelloWorld Function -
    public static void printHelloWorld()
    {
        System.out.println("Hello World");
    }

    // Write calculateSum() function
    public static int calculateSum(int num1 ,int num2) // passing parameters or formal parameter
    {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String [] args)
    {
        printHelloWorld();  // call to function

        int a =2;
        int b =3;
        int Sum = calculateSum(a,b);  // passing Argument or actual parameter
        System.out.println("The sum is : "+ Sum);

    }

}
