import doubleylinkedlist.DoublyLinkedList;
import singlylinkedlist.SinglyLinkedList;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();

        list.addFirst("Eversmile");
        list.addFirst("Naruto");
        list.addFirst("Obito");
        list.addFirst("Sumere");

        System.out.println(list.size());

        DoublyLinkedList<Integer> linkedList = new DoublyLinkedList<>();
    }
}
