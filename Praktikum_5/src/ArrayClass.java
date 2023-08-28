import java.util.ArrayList;
import java.util.Scanner;

public class ArrayClass {
    private ArrayList<Float> valueA = new ArrayList<Float>();
    private ArrayList<Float> valueB = new ArrayList<Float>();
    private ArrayList<Float> result = new ArrayList<Float>();
    private Scanner input = new Scanner(System.in);

    // Array Length
    public int ArrayLength() {
        System.out.print("Input jumlah data : ");
        int arrayLength = input.nextInt();
        return arrayLength;
    }

    // Input Array
    public void inputArray(){
        int jumlahData = ArrayLength();
        float data;

        // Array A
        System.out.println("\n===== INPUT VALUE A =====");
        for(int i = 0; i < jumlahData; i++){
            System.out.print("Element Array A["+i+"] = ");
            data = input.nextFloat();
            valueA.add(data);
        }
        // Array B
        System.out.println("\n===== INPUT VALUE B =====");
        for(int i = 0; i < jumlahData; i++){
            System.out.print("Element Array B["+i+"] = ");
            data = input.nextFloat();
            valueB.add(data);


            /*
             * Inisialisasi panjang ArrayList dari result
             */
            result.add(0f);
        }

    }

    // Method Penjumlahan
    public void Penjumlahan(){
        System.out.println("\n===== HASIL PENJUMLAHAN =====");
        for(int i = 0; i < result.size() ; i++){
            result.set(i, valueA.get(i) + valueB.get(i));
        }
    }

    // Method Pengurangan
    public void Pengurangan(){
        System.out.println("\n===== HASIL PENGURANGAN =====");
        for(int i = 0; i < result.size(); i++){
            result.set(i, valueA.get(i) - valueB.get(i));
        }
    }

    // Method Perkalian
    public void Perkalian(){
        System.out.println("\n===== HASIL PERKALIAN =====");
        for(int i = 0; i < result.size(); i++){
            result.set(i, valueA.get(i) * valueB.get(i));
        }
    }

    // Method Pembagian
    public void Pembagian(){
        System.out.println("\n===== HASIL PEMBAGIAN =====");
        for(int i = 0; i < result.size(); i++){
            result.set(i, valueA.get(i) / valueB.get(i));
        }
    }

    // Method Tampil Data
    public void TampilData(){
        for(int i = 0; i < result.size(); i++){
            System.out.println("Result index ke "+i+ " = "+result.get(i));
        }
    }

    // Reset Value
    public void ResetValue(){
        if(valueA.size() != 0){
            for(int i = 0; i < result.size(); i++){
                valueA.clear();
                valueB.clear();
                result.clear();
            }
        }
    }
}
