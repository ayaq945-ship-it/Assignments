package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list=new SinglyLinkedList<Integer>();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.removeFirst();
        list.addLast(40);
        list.addLast(50);
        list.removeLast();
        list.display();




    }
}