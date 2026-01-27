package Assignment_2;
//Write a function to merge two sorted queues into a single sorted queue.
public class Question5 {
    public static <E extends Comparable<E>> SlinkedQueue<E> merge(SlinkedQueue<E> q1, SlinkedQueue<E> q2) {
        SlinkedQueue<E> merged = new SlinkedQueue<>();
        while (!q1.isEmpty() && !q2.isEmpty()) {
            if (q1.front().compareTo(q2.front()) <= 0) {
                merged.enqueue(q1.dequeue());
            } else {
                merged.enqueue(q2.dequeue());
            }
        }
        while (!q1.isEmpty()) merged.enqueue(q1.dequeue());
        while (!q2.isEmpty()) merged.enqueue(q2.dequeue());
        return merged;
    }
}