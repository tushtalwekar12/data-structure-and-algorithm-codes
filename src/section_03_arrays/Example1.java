package section_03_arrays;
// date : 05-02-2025
// Topic : Array as function argument
public class Example1 {
    public static void update(int marks[]){
        // loop
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks [] = {97,98,99};
        update(marks);

        // print marks array
        for (int i=0; i< marks.length; i++){
            System.out.println(marks[i] + " ");
        }
        System.out.println();
    }
}
