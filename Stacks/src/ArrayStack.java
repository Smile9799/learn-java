public class ArrayStack <E> implements Stack<E>{
    public static final int CAPACITY = 100;
    private E[] data;
    private int t=-1;
    public ArrayStack(){
        this(CAPACITY);
    }
    public ArrayStack(int capacity){
        data  = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return t+1;
    }

    @Override
    public boolean isEmpty() {
        return t == -1;
    }

    @Override
    public E pop() {
        if(isEmpty())
            return null;
        E temp = data[t];
        data[t] = null;
        t--;
        return temp;
    }

    @Override
    public void push(E e) throws IllegalStateException{
        if(size() == data.length)
            throw new IllegalStateException("Stack is full");
        data[++t] =e;
    }

    @Override
    public E peek() {
        if(isEmpty())
            return null;
        return data[t];
    }
}
