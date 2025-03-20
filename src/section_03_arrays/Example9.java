package section_03_arrays;
// maxSub array Sum - kadans algorithm
public class Example9 {
    public static void maxSubArraySum(int[] numbers) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            // calculate currentSum
            currentSum = currentSum + numbers[i];

            if (currentSum < 0) { // condition
                currentSum = 0;
            }

            // check maxSum between currentSum and maxSum using Math.max()
            maxSum = Math.max(currentSum, maxSum);
        }
        System.out.println("max sum is : " + maxSum);
    }

    // function for if all element are negative return smallest negative numbers
    public static void maxSubArraySum2(int[] numbers3){
        int currentSum = numbers3[0]; // Initialize with the first element
        int maxSum = numbers3[0]; // Initialize maxSum with the first element

        for (int i = 1; i < numbers3.length; i++) {
            // For all negative numbers, keep track of the largest negative sum
            currentSum = Math.max(numbers3[i], currentSum + numbers3[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("MaxSum :  " + maxSum);
    }

    public static void main(String[] args) {
        // Test Cases -
        // if all element are positive
        // int[] numbers ={2,4,6,8,10}; // maxSum = 30

        // if some element are positive and some are negative
        //int[] numbers ={-2,-3,4,-1,-2,1,5,-3}; // maxSum = 7

        // if all element are negative
         int[] numbers3 ={-1,-2,-3}; // maxSum =-1

        maxSubArraySum2(numbers3);
    }
}
