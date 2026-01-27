package Assignment_2;

import SinglyLinkedList.SinglyLinkedList;
import stack.stack;

public class SlinkedStack<E> implements stack<E> {
    SinglyLinkedList<E> slist =new SinglyLinkedList<E>();
    @Override
    public boolean isEmpty() {
        return slist.isEmpty();
    }
    @Override
    public int size() {
        return slist.size();
    }

    public void display(){
        slist.display2();
    }

    @Override
    public void push(E data) {
        slist.addFirst(data);
    }
    @Override
    public E top() {
        return slist.getFirst();
    }
    @Override
    public E pop() {
        return slist.removeFirst();
    }
}