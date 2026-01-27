package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList<String> list=new CircularLinkedList<String>();
        list.addFirst("aseel");
        list.addFirst("aya");
        list.addFirst("asma");
        list.addLast("abeer");
        list.removeFirst();
        list.removeLast();
        list.display();

    }
}