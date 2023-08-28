public class MatrixExample {
    public static void main(String[] args) {
        int array[][] = {{1,3,5}, {2,4,6}};
        System.out.println("Row Size\t= " + array.length);
        System.out.println("Column Size\t= " + array[1].length);
        System.out.println("\n========== CETAK DATA ==========");
        outputArray(array);
    }
    public static void outputArray(int[][] array) {
        //int rowSize = array.length;
        //int columnSize = array[0].length;
        for(int i = 0; i <= 1; i++) {
            System.out.print("[ ");
            for(int j = 0; j <= 2; j++){
                System.out.print(""+array[i][j]);
            }
            System.out.println(" ]");
        }
        System.out.println();
    }
}
