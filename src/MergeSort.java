public class MergeSort {
    public void mergeSort(int[] arr, int length) {
        if (length < 2) {
            return;
        }

        int mid = length / 2;

        int[] left = new int[mid];
        int[] right = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        for (int i = mid; i < length; i++) {
             right[i - mid] = arr[i];
        }

        mergeSort(left, mid);
        mergeSort(right, length - mid);
        merge(arr, left, right, mid, length - mid);
    }

    public static void merge(int[] arr, int[] left, int[] right, int leftLength, int rightLength) {
        int i = 0, j = 0, k = 0;
        while (i < leftLength && j < rightLength) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < leftLength) {
            arr[k++] = left[i++];
        }

        while (j < rightLength) {
            arr[k++] = right[j++];
        }
    }

    public void printArray(int arr[]) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}