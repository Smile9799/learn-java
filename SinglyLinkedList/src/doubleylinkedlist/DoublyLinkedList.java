package doubleylinkedlist;

public class DoublyLinkedList<E> implements IDList<E>{
    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;

    public DoublyLinkedList(){
        header = new Node<>(null,null,null);
        trailer = new Node<>(null,header,null);
        header.setNext(trailer);
    }
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
        return header.getNext().getElement();
    }

    @Override
    public E last() {
        if(isEmpty())
            return null;
        return trailer.getPrev().getElement();
    }

    @Override
    public void addFirst(E e) {
        addBetween(e,header,header.getNext());
    }

    @Override
    public void addLast(E e) {
        addBetween(e,trailer.getPrev(),trailer);
    }

    @Override
    public E removeFirst() {
        return remove(header.getNext());
    }

    @Override
    public E removeLast() {
        return remove(trailer.getPrev());
    }

    @Override
    public void addBetween(E element,Node<E> previous,Node<E> next) {
        Node<E> node = new Node<>(element,previous,next);
        previous.setNext(node);
        next.setPrev(node);
        size++;
    }

    @Override
    public E remove(Node<E> node) {
        Node<E> previous = node.getPrev();
        Node<E> next = node.getNext();
        previous.setNext(next);
        next.setPrev(previous);
        size--;
        return node.getElement();
    }
}
