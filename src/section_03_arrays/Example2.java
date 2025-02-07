package section_03_arrays;
//find the index of element in a given array . key = 10 , array {2,4,6,8,10,12, 14,16}
public class Example2 {
    public static int linearSearch(int numbers[], int key){
        for (int i=0; i< numbers.length; i++){
            // condition to check key is present or not
            if (numbers[i] == key){
                return i; // return index of key
            }
        }
        return -1; // if not present
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 10;

        int index = linearSearch(numbers, key);
        if(index == -1){
            System.out.println("Not found");
        }else {
            System.out.println("key is at index : "+ index);
        }
    }
}
