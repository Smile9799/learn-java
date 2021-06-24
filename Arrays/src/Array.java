public class Array {

    public static int findMax(int[] arr){
        int max=arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int findMin(int[] arr){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void reverseArray(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    //prints array elements
    public static void print(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }
    public static void printPairs(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.println("["+arr[i]+","+arr[j]+"]");
            }
        }
    }
    public static int[] resizeArray(int[] arr, int size){
        int[] temp = new int[size];
        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        return temp;
    }
    public static void moveZerosToEndArray(int[] arr){
        int j=0; //zero tracker
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0  && arr[j] ==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
    }
    public static int[] sort(int[] arr){
        int[] tempArr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            for(int j=i+1;j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i =0;i<arr.length; i++){
            tempArr[i] = arr[i];
        }
        return tempArr;
    }
    public static int[] mergeSortedArray(int[] arr1,int[] arr2){
        int arrSize1 = arr1.length;
        int arrSize2 = arr2.length;
        int[] tempArr = new int[arrSize1 + arrSize2];

        int i=0,j=0,k=0;
        while (i<arrSize1 && j<arrSize2){
            if(arr1[i] > arr2[j]){
                tempArr[k] = arr2[j];
                j++;
            }else {
                tempArr[k] = arr1[i];
                i++;
            }
            k++;
        }
        while (i<arrSize1){
            tempArr[k] = arr1[i];
            i++;
            k++;
        }
        while(j<arrSize2){
            tempArr[k] = arr2[j];
            j++;
            k++;
        }
        return tempArr;
    }
//    public static int removeDuplicates(int[] arr, int n){
//        int[] tempArr = new int[n];
//        int j=0;
//        for(int i=0;i<n;i++){
//            if(arr[i] != arr[i+i]){
//                tempArr[j++] = arr[i];
//            }
//        }
//        tempArr[j++] = arr[n-1];
//        for(int i=0;i<j;i++){
//            arr[i] =  tempArr[i];
//        }
//        return j;
//    }
    public static void main(String[] args) {
        int[] arr = {1,0,8,0,4,7};
        int[] arr2 = {1,88,6,7,4,5,4,1};
        print(arr);
        printPairs(arr);
        int [] sortedArray = sort(arr);
        int [] sortedArray2 = sort(arr2);
        //System.out.println("duplicates: "+ removeDuplicates(sortedArray2,sortedArray.length));
        int [] mergeArray = mergeSortedArray(sortedArray,sortedArray2);
        System.out.println("*******merged array************");
        print(mergeArray);
        System.out.println("****sorted array****");
        print(sortedArray);
        moveZerosToEndArray(arr);
        print(arr);
        System.out.println(findMax(arr));
        System.out.println(findMin(arr));
        int end = arr.length - 1;
        reverseArray(arr,0,end);
        print(arr);
        int[] resizedArray = resizeArray(arr,(arr.length *2));
        print(resizedArray);
    }
}
