public class SinglyLinkedList<E> implements IList<E>{

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size =0;

    public SinglyLinkedList(){}

    @Override
    public void addFirst(E e) {
        head = new Node<>(e,head);
        if(size==0){
            tail = head;
        }
        size++;
    }

    @Override
    public E removeFirst() {
        if(isEmpty())
            return null;
        E temp = head.getElement();
        head = head.getNext();
        size--;
        if(size==0){
            tail=null;
        }
        return temp;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E first() {
        if (isEmpty())
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
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void addLast(E e) {
        Node<E> newNode = new Node<>(e,null);
        if(isEmpty()){
            head = newNode;
        }else {
            tail.setNext(newNode);
        }
        tail=newNode;
        size++;
    }
}
