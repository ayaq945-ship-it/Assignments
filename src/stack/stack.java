package stack;

public interface stack <E> {
    public boolean isEmpty();
    public int size();
    public void push(E data);
    public E top();
    public E pop();

}