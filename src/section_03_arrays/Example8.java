package section_03_arrays;
// maxSub array Sum - by prefix sum
public class Example8 {
    public static void maxSubArraySum(int [] numbers){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[numbers.length]; // create prefix array

        prefix[0] =numbers[0];
        // calculate prefix array
        for (int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        // calculate start
        for (int i=0; i< numbers.length; i++){
            int start = i;
            // calculate end
            for (int j=i; j< numbers.length; j++){
                int end =j;

                // calculate current sum
                currentSum = start == 0 ? prefix[end] :  prefix[end] - prefix[start -1];

                if (maxSum < currentSum){    // condition
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("max sum is : "+ maxSum);
    }
    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,10};
        maxSubArraySum(numbers);
    }
}
