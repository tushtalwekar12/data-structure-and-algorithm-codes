package section_03_arrays;
// date : 05-02-2025
// Topic : Array as function argument - array are pass by reference
public class Example1 {
    // write function for add 1 in an given array
    public static void addOneInAnArray(int[] marks)
    {
        for (int i=0; i< marks.length; i++)
        {
            marks[i] =marks[i] + 1;
        }

    }
    public static void main(String[] args) {
        int[] marks = {97,98,99}; // create an array
        System.out.println("Before Update :");
        for (int i =0; i< marks.length; i++)
        {
            System.out.print(marks[i]+ " ");
        }
        System.out.println();
        // call function
        addOneInAnArray(marks);

        // print an array
        System.out.println("After Update :");
        for (int i =0; i< marks.length; i++)
        {
            System.out.print(marks[i]+ " ");
        }

    }
}
