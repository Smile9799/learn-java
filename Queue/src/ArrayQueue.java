public class ArrayQueue<E> implements IQueue<E> {

    private static final int CAPACITY =100;
    private E[] data;
    private int f = 0; // index of the front element
    private int sz = 0; // current number of elements

    public ArrayQueue(int capacity){
        data = (E[]) new Object[capacity];
    }
    public ArrayQueue(){
        this(CAPACITY);
    }
    @Override
    public int size() {
        return sz;
    }

    @Override
    public boolean isEmpty() {
        return sz==0;
    }

    @Override
    public void enqueue(E e) throws IllegalStateException{
        if(sz == data.length)
            throw new IllegalStateException("Queue is full");
        int avail = (f+sz) % data.length;
        System.out.println(avail);
        data[avail] = e;
        sz++;
    }

    @Override
    public E first() {
        if(isEmpty())
            return null;
        return data[f];
    }

    @Override
    public E dequeue() {
        if(isEmpty())
            return null;
        E temp = data[f];
        data[f] = null;
        f = (f+1) % data.length;
        System.out.println(f);
        sz--;
        return temp;
    }
}
