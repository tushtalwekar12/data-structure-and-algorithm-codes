package section_03_arrays.array_Question;
/*
Reverse an Array

Reverse the elements of an array in-place.
Example: arr = [1, 2, 3, 4, 5] → Output: [5, 4, 3, 2, 1]
 */
public class Question_2 {
    public static void reverseAnArray(int[] numbers){
        int first = 0;
        int last = numbers.length -1;

        while (first < last){
            // swap code
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first ++; // updation
            last --;
        }
    }
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6};
        // call
        reverseAnArray(numbers);

        // print an array
        System.out.println("reverse an array : ");
        /*
        for (int i=0; i < numbers.length; i++){
           System.out.print(numbers[i] + " ");
       }
         */
        //Instead of a regular for loop for printing, you can use enhanced for-loop (foreach):
        for (int num : numbers){
            System.out.print(num + " ");
        }
    }
}
