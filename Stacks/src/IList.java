public interface IList<E> {
    void addFirst(E e);
    E removeFirst();
    int size();
    E first();
    E last();
    boolean  isEmpty();
    void addLast(E e);
}
