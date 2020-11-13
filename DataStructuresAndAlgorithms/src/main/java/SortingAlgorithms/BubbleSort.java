package SortingAlgorithms;

public class BubbleSort {

    public static void main (String [] args){
        System.out.println("Hello world!");
        //Bubble sort has a time complexity of O(N^2)
        int [] arr = {2, -1, 48, 11, -3, 8};

        //Steps
        /*1. Need to keep track of the index to the right most that have been sorted
          2. Need to loop through each index and compare the current index value with the index value +1 to it
          3. If the current index value is greater than the current index value + 1 then swap them and compare the next 2 indexes
          4. else simply compare the next two indexes
         */
        for (int lastUnsortedIndex = arr.length-1; lastUnsortedIndex>0; lastUnsortedIndex--){
            for (int i=0;i<lastUnsortedIndex; i++){
                    if (arr[i] > arr[i + 1]) {
                        swap(arr, i, i + 1);
                }
            }
        }
        System.out.println("Sorted array:");
        for (int a : arr){
            System.out.println(a);
        }
    }

    private static void swap(int[] arr, int currentIndex, int nextIndex) {
        if (currentIndex  == nextIndex){
            return;
        }
        int temp = arr[currentIndex];
        arr[currentIndex] = arr[nextIndex];
        arr[nextIndex] = temp;
    }
}
