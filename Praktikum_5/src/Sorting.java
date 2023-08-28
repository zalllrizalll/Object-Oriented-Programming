public class Sorting {
    // Method Swap
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // Cetak Array 1 => Khusus BubbleSort, QuickSort, InsertionSort
    static void printArray1(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
    // Cetak Print Array => khusus Selection Sort & Merge Sort
    static void printArray2(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    // Bubble Sort
    public void BubbleSort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                printArray1(arr);
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }
    // Partition 
    static int partition(int arr[], int low, int high){
        // pivot
        int pivot = arr[high];
        // Index of smaller element and
        // Indicates the right position
        // of pivot found so far
        int i = low - 1;
        for(int j = low; j <= high - 1; j++){
            printArray1(arr);
        // If current element is smaller than pivot
            if(arr[j] < pivot){
                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i +1, high);
        return (i + 1);
    }
    /* The main function that implements QuickSort
        arr[] --> Array to be sorted,
        low --> Starting index,
        high --> Ending index
    */
    // Quick Sort
    public void QuickSort(int arr[], int low, int high){
        if(low < high){
            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);
            // Separately sort elements before
            // partition and after partition
            QuickSort(arr, low, pi - 1);
            QuickSort(arr, pi + 1, high);
        }
    }
    // Insertion Sort
    public void InsertionSort(int arr[]){
        int n = arr.length;
        printArray1(arr);
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
                greater than key, to one position ahead
                of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            printArray1(arr);
        }
    }
    // Selection Sort
    public void SelectionSort(int arr[]){
        int n = arr.length;
        printArray2(arr);
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
            printArray2(arr);
        }
    }
    // Merge Sort
    public void Sort(int arr[], int l, int m, int r){
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        printArray2(arr);
        /* Merge the temp arrays */
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
            printArray2(arr);
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
            printArray2(arr);
        }
    }
    // Main function that sorts arr[l..r] using
    // merge()
    void MergeSort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;
 
            // Sort first and second halves
            MergeSort(arr, l, m);
            MergeSort(arr, m + 1, r);
 
            // Merge the sorted halves
            Sort(arr, l, m, r);
        }
    }
}
