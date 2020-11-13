package SortingAlgorithms;

public class InsertionSort {
    //Insertion sort is a Stable algorithm
    //So if let's say there are two nines in the array we're going to insert the left most nine first
    //and then when we come to the right most nine. Remember that when we're looking for the insertion position,
    //we stop when we hit an element that is less than or equal to the one that we're inserting.
    //So when we're inserting the nine, we're eventually going to hit the first nine,
    //we inserted into the sorted partition. And that second nine will be inserted
    //to the right of the first nine. And so the relative positions
    //of those two nines will be preserved. And so insertion sort is a stable sort algorithm.

    public static void main(String [] args){

        //This implementation of Insertion sort starts of assuming that the first element in the array is sorted
        //an so the first unsorted index will start at 1

        //And so the outer loop is the one that's growing the sorted partition by one,
        //and the inner loop is that one that's looking for the correct position to insert each element
        //and is doing the shifting.

        //It works by taking each element and inserting it into its correct position in the sorted partition
        // and at the end, when we've gone through all the elements, the entire array is the sorted partition.

        int [] arr = {2, -1, 48, 11, -3, 8};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length;  firstUnsortedIndex++) {
            int newElement = arr[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
                arr[i] = arr[i - 1];
            }

            arr[i] = newElement;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
