import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static String reverseString(String word){
        Stack<Character> stack = new Stack<>();
        char[] chars = word.toCharArray();
        for(char c :chars){
            stack.push(c);
        }
        for(int i =0; i<word.length(); i++){
            chars[i] = stack.pop();
        }
        return new String(chars);
    }
    public static int[] reverseArray(int[] arr){
       int[] tempArr =  new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int j : arr) {
            stack.push(j);
        }

        for(int i =0; i<arr.length;i++){
            tempArr[i] = stack.pop();
        }
        return tempArr;
    }
    public static void main(String[] args) {
        ArrayStack<String> arrayStack = new ArrayStack<>(10);

        arrayStack.push("Eversmile");
        arrayStack.push("Groot");
        arrayStack.push("Marry");
        arrayStack.push("John");

        System.out.println(arrayStack.size());
        System.out.println(arrayStack.peek());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.peek());

        ListStack<Integer> listStack = new ListStack<>();
        listStack.push(4);
        listStack.push(3);
        listStack.push(2);
        listStack.push(1);

        System.out.println(listStack.size());
        System.out.println(listStack.peek());
        System.out.println(listStack.pop());
        System.out.println(listStack.peek());
        System.out.println(reverseString("Eversmile"));
        int[] arr = {4,2,3};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }
}
