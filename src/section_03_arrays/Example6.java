package section_03_arrays;
// print subarray and calculate sum of subarray and find maxsum and minsum
public class Example6 {
    public static void subArray(int[] numbers){
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i=0; i< numbers.length; i++){
            int start = i;
            for (int j=i; j< numbers.length; j++){
                int end = j;
                int sum = 0; // Variable to store the sum of the current subarray
                for (int k= start; k<= end ; k++){
                    System.out.print(numbers[k]+ " ");
                    sum += numbers[k]; // Add the current element to sum
                }
                // update maxsum and minsum
                if (sum > maxSum){
                    maxSum = sum;
                }
                if (sum < minSum){
                    minSum = sum;
                }

                System.out.println("=> Sum : "+ sum);// Print sum of current subarray
            }
            System.out.println();
        }
        // Print the overall max and min sum
        System.out.println("Maximum Subarray Sum : "+ maxSum);
        System.out.println("Minimum Subarray Sum : "+ minSum);
    }
    public static void main(String[] args) {
        int [] numbers = {2,4,6,8,10};
        subArray(numbers);
    }
}
