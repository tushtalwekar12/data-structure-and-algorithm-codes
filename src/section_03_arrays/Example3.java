package section_03_arrays;
// Largest Number : find the largest number in given array ,  { 1,2,6,3,5}
public class Example3 {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity  - minimum value in integer
        int smallest = Integer.MAX_VALUE; // +infinity

        for (int i=0; i<numbers.length; i++){
            // condition for find largest
            if (largest < numbers[i]){
                largest = numbers[i]; // If numbers[i] is greater than largest, update largest to numbers[i].
            }
            // condition for find smallest
            if (smallest > numbers[i]){
                smallest = numbers[i];  //If numbers[i] is smaller than smallest, update smallest to numbers[i]
            }
        }
        // print smallest
        System.out.println("smallest value is : "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {11,2,6,3,77,5};
        //  largest number print
        System.out.println("largest in the array is : "+ getLargest(numbers));
    }
}
