public class ProblemALG004r {

    public static int[][] generateMagicMatrix(){
        int[][] magicSquare = new int[7][7];
        int i = 3;
        int j = 6;

        for (int num = 1; num <= 7 * 7;) {
            if (i == -1 && j == 7)
            {
                j = 7 - 2;
                i = 0;
            }
            else {
                if (j == 7){
                    j = 0;
                }
                if (i < 0){
                    i = 6;
                }
            }

            if (magicSquare[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            }
            else{
                magicSquare[i][j] = num++;
            }
            j++;
            i--;
        }
        return magicSquare;
    }
    public static void display(int [][] magicSquare, int n){
        // print magic square
        System.out.println("The Magic Square for " + n
                + ":");
        System.out.println("Sum of each row or column "
                + n * (n * n + 1) / 2 + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(magicSquare[i][j] + " ");
            System.out.println();
        }
    }
    public static void swap(int[][] arr, int row1, int col1, int row2, int col2){
        int num1 = arr[row1][col1];
        int num2 = arr[row2][col2];
        arr[row1][col1] = num2;
        arr[row2][col2] = num1;
    }
    public static void arrTranspose(int[][] arr){
        int size = arr.length;
        for(int diag = 0; diag < size; diag++){
            for(int i=diag+1; i<size; i++){
                swap(arr, diag, i, i, diag);
            }
        }
    }
    public static void arrReflect(int[][] arr){
        int size = arr.length;
        for(int i=0; i < size; i++){
            for(int j=0; j < Math.floor(size/2); j++){
                swap(arr, i, j, i, size-j-1);
            }
        }
    }
    public static void rotate(int[][] arr,int k){
        for(int i=0; i<k;i++){
            arrTranspose(arr);
            arrReflect(arr);
        }
    }
    public static void main(String[] args) {
        System.out.println("*********************Before rotating********************");
        int[][] arr =generateMagicMatrix();
        display(arr,7);

        System.out.println("*******************After rotating: 0***********************");
        rotate(arr,0);
        display(arr,7);
        System.out.println("*******************After rotating: 1***********************");
        rotate(arr,1);
        display(arr,7);
        System.out.println("*******************After rotating: 2***********************");
        rotate(arr,2);
        display(arr,7);
        System.out.println("*******************After rotating: 3***********************");
        rotate(arr,3);
        display(arr,7);
    }
}
