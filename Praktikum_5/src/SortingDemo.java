import java.util.Scanner;

public class SortingDemo {
    public static void main(String[] args) {
        int []data;
        int arrayLength;
        int pilih;
        String lanjut;
        Sorting sort = new Sorting();
        Scanner input = new Scanner(System.in);
        System.out.println("========== Input Array ================");
        System.out.print("Input Size Array : "); arrayLength = input.nextInt();
        do{
        data = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++) {
            System.out.print("Input elements of array["+i+"] = "); data[i] = input.nextInt();
        }
        System.out.println("=======================================\n");
        System.out.println("========== Menu Sorting ===============");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Selection Sort");
        System.out.println("5. Merge Sort");
        System.out.println("=======================================");
        System.out.print("Inputkan pilihan : "); pilih = input.nextInt();
        System.out.println("\n=========== Flow Sorting ===========");
        // Pengkondisian
        switch(pilih){
            case 1: sort.BubbleSort(data);
                    System.out.print("Hasil Sorting : "); Sorting.printArray1(data);
                    break;
            case 2: sort.QuickSort(data, 0, arrayLength - 1);
                    System.out.print("Hasil Sorting : "); Sorting.printArray1(data);
                    break;
            case 3: sort.InsertionSort(data);
                    System.out.print("Hasil Sorting : "); Sorting.printArray1(data);
                    break;
            case 4: sort.SelectionSort(data);
                    System.out.print("Hasil Sorting : "); Sorting.printArray1(data);
                    break;
            case 5: sort.MergeSort(data, 0, data.length - 1);
                    System.out.print("Hasil Sorting : "); Sorting.printArray1(data);
                    break;
            default:System.out.println("404 Not Found");
                    break;
            }
            System.out.println("====================================");
            System.out.print("Ingin cek sorting kembali[Y/T] = "); lanjut = input.next();
        }while(lanjut.equalsIgnoreCase("Y"));
        input.close();
    }
}
