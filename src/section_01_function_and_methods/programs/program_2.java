package section_01_function_and_methods.programs;
// calculate Binomial coefficient - n! / r!(n-r)!
public class program_2 {
    // function- calculate factorial of n
    public static int factorial(int n){
        int f = 1;
        for (int i =1 ; i<= n; i++){
            f = f * i;
        }
        return f;
    }
    // calculate Binomial coefficient
    public static int bioCoeefi(int n , int r ){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int bioCoefficient = n_fact / (r_fact * nmr_fact);
        return bioCoefficient;
    }
    // main method
    public static void main(String[] args) {
        int n = 10;

        // call binoCoeefi function
        System.out.println(bioCoeefi(5,2));  // 10
    }
}
