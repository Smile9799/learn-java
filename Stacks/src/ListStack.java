public class ListStack <E> implements Stack<E>{
    private SinglyLinkedList<E> list = new SinglyLinkedList<>();
    public ListStack(){}
    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public E pop() {
        return list.removeFirst();
    }

    @Override
    public void push(E e) {
        list.addFirst(e);
    }

    @Override
    public E peek() {
        return list.first();
    }
}
