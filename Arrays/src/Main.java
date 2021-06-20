import java.util.Scanner;

public class Main {

    public static int[] arr(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many items");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            System.out.println("Enter the value ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    public static void printArr(int [] arr){
        System.out.println("Array contents\n**************");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("**************");
    }
    public static int findMax(int[] arr){
        int max = arr[0];
        int index  = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        return max;
    }
    public static int linearSearch(int[] arr, int n){
        int index = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == n){
                index  =  i;
                return index;
            }
        }
        return index;
    }
    public static void printAllPairs(int[] arr){

        for(int i =0; i<arr.length -1; i++){
            for(int j=i+1; j<arr.length;j++){
                System.out.println("["+arr[i]+","+arr[j]+"]");
            }
        }
    }
    public static void main(String[] args) {

        int[] arr = arr();
        printArr(arr);
        System.out.println("Largest number: "+findMax(arr));
        System.out.println("results of linear search: "+linearSearch(arr,12));
        printAllPairs(arr);
    }
}
