package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<String> dlist =new DoublyLinkedList<String>();
        dlist.addFirst("aseel");
        dlist.addFirst("fatima");
        dlist.addLast("aya");
        dlist.addLast("asma");
        dlist.removeFirst();
        dlist.removeLast();
        dlist.display();

    }
}