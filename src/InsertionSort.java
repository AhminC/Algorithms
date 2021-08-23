public class InsertionSort {
    public void sort(int arr[]) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int key = arr[i];
            int temp = i - 1;

            while (temp >= 0 && arr[temp] > key) {
                arr[temp + 1] = arr[temp];
                temp = temp - 1;
            }
            arr[temp + 1] = key;
        }
    }

    public void printArray(int arr[]) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

}
