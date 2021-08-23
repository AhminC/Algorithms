public class Testing {
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4,3,2,1};
//        InsertionSort insertionSort = new InsertionSort();
//        insertionSort.sort(arr);
//        insertionSort.printArray(arr);

//        MergeSort mergeSort = new MergeSort();
//        mergeSort.printArray(arr);
//        mergeSort.mergeSort(arr, arr.length);
//        mergeSort.printArray(arr);

        QuickSort quickSort = new QuickSort();
        quickSort.printArray(arr);
        quickSort.quickSort(arr, arr[0], arr.length);
        quickSort.printArray(arr);
    }


}
