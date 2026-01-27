package Queue;

import SinglyLinkedList.SinglyLinkedList;

public class SlinkedQueue<E> implements queue<E> {
    SinglyLinkedList<E> sList=new SinglyLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return sList.isEmpty();
    }


    @Override
    public int size() {
        return sList.size();
    }

    @Override
    public void enqueue(E data) {
        sList.addLast(data);

    }

    @Override
    public E dequeue() {
        return sList.removeFirst();
    }

    @Override
    public E front() {
        return sList.getFirst();
    }
    public E last() {
        return sList.getLast();
    }

}