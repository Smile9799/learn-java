package singlylinkedlist;

public class SinglyLinkedList<E> implements ISList<E> {

    private Node<E> head=null;
    private Node<E> tail = null;

    private int size = 0;

    public SinglyLinkedList(){}

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public E first() {
        if(isEmpty())
            return null;
        return head.getElement();
    }

    @Override
    public E last() {
        if(isEmpty())
            return null;
        return tail.getElement();
    }

    @Override
    public void addFirst(E e) {
        head = new Node<>(e,head);
        if(size==0)
            tail = head;
        size++;
    }

    @Override
    public void addLast(E e) {
        Node<E> newest = new Node<>(e,null);
        if(size==0)
            head=newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }

    @Override
    public E removeFirst() {
        if(isEmpty())
            return null;
       E temp = head.getElement();
       head = head.getNext();
       size--;
       if(size==0)
           tail = null;
       return temp;
    }
}
