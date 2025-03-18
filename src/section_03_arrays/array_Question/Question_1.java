package section_03_arrays.array_Question;
/*
Find the Largest and Smallest Element in an Array

Given an array, find the maximum and minimum elements.
Example: arr = [3, 1, 5, 2, 4] → Output: max = 5, min = 1
*/
public class Question_1 {
    public static int getLargest(int[] arr){
        int smallest = Integer.MAX_VALUE; // to get LARGEST value in INTEGER
        int largest = Integer.MIN_VALUE;  // to get SMALLEST value in INTEGER
        for (int i =0; i< arr.length; i++){
            // 1. find largest
            if (largest < arr[i]){   // If arr[i] is greater than largest, update largest to arr[i].
                largest = arr[i];
            }
            // 2. find Smallest
            if (smallest > arr[i]){  // If arr[i] is smaller than smallest, update smallest to arr[i]
                smallest = arr[i];
            }
        }
        System.out.println("largest of the array : "+ largest);
        return smallest;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,4,3,57,6};
        System.out.println("Smallest of the array : "+ getLargest(arr));
    }
}
