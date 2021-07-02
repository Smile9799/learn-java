package doubleylinkedlist;

public interface IDList <E>{
    int size();
    boolean isEmpty();
    E first();
    E last();
    void addFirst(E e);
    void addLast(E e);
    E removeFirst();
    E removeLast();
    void addBetween(E element,Node<E> previous,Node<E> next);
    E remove(Node<E> node);
}
