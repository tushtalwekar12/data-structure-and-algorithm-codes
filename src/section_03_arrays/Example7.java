package section_03_arrays;
// 1. max-subarray sum - by brute force
public class Example7 {
    public static void maxSubArraySum(int[] numbers){
        int currentSum  =0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0; i< numbers.length; i++){
            int start = i;
            for (int j=i; j<numbers.length;  j++){
                int end = j;
                currentSum =0;
                for (int k =start; k<=end; k++){
                    currentSum += numbers[k]; // sub-array sum
                }
                System.out.println("current sum :"+ currentSum);
                // condition
                if (maxSum < currentSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("max-subarray sum is : "+ maxSum);
    }
    public static void main(String[] args) {
        int [] numbers = {2,4,6,8,10};
        maxSubArraySum(numbers);
    }
}
