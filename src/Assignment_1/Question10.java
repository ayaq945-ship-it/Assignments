package Assignment_1;

import DoublyLinkedList.DoublyLinkedList;
// Write a function to remove duplicates elements from doubly Linked List
public class Question10 {

    public void run() {

        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(10);
        list.addLast(30);
        list.addLast(20);

        System.out.println("   القائمة الاصلية:");
        list.display();

        DoublyLinkedList<Integer> noDuplicates = new DoublyLinkedList<>();

        // إزالة التكرار
        while (!list.isEmpty()) {
            int value = list.removeFirst();

            if (!exists(noDuplicates, value)) {
                noDuplicates.addLast(value);
            }
        }

        System.out.println("  بعد ازالة التكرارات:");
        noDuplicates.display();
    }

    private boolean exists(DoublyLinkedList<Integer> list, int value) {
        DoublyLinkedList<Integer> temp = new DoublyLinkedList<>();
        boolean found = false;

        while (!list.isEmpty()) {
            int v = list.removeFirst();
            if (v == value) {
                found = true;
            }
            temp.addLast(v);
        }

        while (!temp.isEmpty()) {
            list.addLast(temp.removeFirst());
        }

        return found;
    }
}