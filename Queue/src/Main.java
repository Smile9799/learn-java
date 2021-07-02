public class Main {

    public static void main(String[] args) {
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();

        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);

        System.out.println(arrayQueue.first());
        System.out.println(arrayQueue.dequeue());

    }
}
