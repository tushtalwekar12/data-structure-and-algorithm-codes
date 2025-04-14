package section_04_sorting;
// date : 27-03-2025
// Bubble sort algorithm -
public class bubble_sort_1 {
    public static void bubbleSortAlgo(int[] arr, int swap){
        for (int turn =0; turn< arr.length-1; turn++){
            for (int j=0; j< arr.length-1-turn; j++){
               if (arr[j] > arr[j+1]){
                   // code for swap
                   int temp =arr[j];
                   arr[j] =arr[j+1];
                   arr[j+1] =temp;

                   swap ++; // to get the no. of swap operation perform
               }
            }
        }
        if (swap < 1){
            System.out.println("already sorted array");
        }
        System.out.println("no of perform : "+ swap);
    }
    public static void printArr(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,5,6,4};
        int swap =0;
        bubbleSortAlgo(arr,swap);
        printArr(arr);

    }
}
