package SortingAlgorithms;

public class SelectionSort {

    public static void main(String [] args){
        //Selection sort has a time complexity of O(N^2). It has 2 loops and each loop can be considered N so N * N gives us N^2
        //The algorithm grows in a quadratic way as the number of steps increase
        int [] arr = {2, -1, 48, 11, -3, 8};

        for (int lastUnsortedIndex = arr.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int highestIndex = 0;
            for (int i =1; i<=lastUnsortedIndex; i++){//using <= as compared to bubble sort where only < was used
                //because in bubble sort, we didn't need the equals because we were comparing i against i plus one
                // and so, the last index we wanted to check was lastUnsortedIndex minus one against lastUnsortedIndex
                //but here we wanna compare every element against whatever's largest so we need to compare this last element as well.

                //For sorting in descending order:
                // if (arr[highestIndex] > arr[i]){
                    //highestIndex = i;
                //}
                if (arr[i] > arr[highestIndex]){
                    highestIndex = i;
                }
            }
            swap(arr, highestIndex, lastUnsortedIndex);
        }

        System.out.println("The values of the array:");
        for (int value : arr){
            System.out.println(value);
        }
    }

    public static void swap(int [] arr, int largestValueIndex, int lastUnsortedIndex){
        if (largestValueIndex == lastUnsortedIndex){
            return;
        }

//Fixed the error in the below commented code
//        int temp = arr[largestValueIndex];
//        arr[lastUnsortedIndex] = temp;
//        arr[largestValueIndex] = arr[lastUnsortedIndex];
        int temp = arr[lastUnsortedIndex];
        arr[lastUnsortedIndex] = arr[largestValueIndex];
        arr[largestValueIndex] = temp;
    }
}
