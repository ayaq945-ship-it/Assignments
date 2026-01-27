package Assignment_1;

import DoublyLinkedList.DoublyLinkedList;
//Write a function to search for an element in a doubly linked list .
public class Question12 {

    public void run() {

        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        int target = 30;
        int index = search(list, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found");
        }
    }


    private int search(DoublyLinkedList<Integer> list, int target) {

        DoublyLinkedList<Integer> temp = new DoublyLinkedList<>();
        int index = 0;
        int foundIndex = -1;

        while (!list.isEmpty()) {
            int value = list.removeFirst();

            if (value == target && foundIndex == -1) {
                foundIndex = index;
            }

            temp.addLast(value);
            index++;
        }

        while (!temp.isEmpty()) {
            list.addLast(temp.removeFirst());
        }

        return foundIndex;
    }
}