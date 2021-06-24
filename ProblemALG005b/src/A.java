public class A {
    // size of matrix
    static final int M=5;
    static final int N=5;
    public static void inplace_rotate(int[][] arr,int k){
        for(int i=0;i<k;i++){
            inplace_transpose(arr);
            inplace_reflect(arr);
        }
    }

    // pre: arr is square
    public static void inplace_reflect(int[][] arr){
        int size = arr.length;
        for(int k=0; k < size; k++){
            for(int i=0; i < Math.floor(size/2); i++){
                swap(arr, k, i, k, size-i-1);
            }
        }
    }

    // pre: matrix is square
    public static void inplace_transpose(int[][] arr){
        int size = arr.length;
        for(int diag = 0; diag < size; diag++){
            for(int i=diag+1; i<size; i++){
                swap(arr, diag, i, i, diag);
            }
        }
    }

    // Swaps elements of int array
    public static void swap(int[][] arr, int row1, int col1, int row2, int col2){
        int num1 = arr[row1][col1];
        int num2 = arr[row2][col2];
        arr[row1][col1] = num2;
        arr[row2][col2] = num1;
    }
    // function to display the matrix
    static void displayMatrix(int matrix[][])
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][] matrix = {{17,24,1,8,15},
                {23,5,7,14,16},
                {4,6,13,20,22},
                {10,12,19,21,3},
                {11,18,25,2,9}};
        inplace_rotate(matrix,3);
        //rotateClockWise(matrix,1);
        //rotateMatrix(matrix,2);
        displayMatrix(matrix);
    }
}
