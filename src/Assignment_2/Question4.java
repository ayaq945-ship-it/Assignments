package Assignment_2;
//Implement a priority queue where the smallest element is dequeue first.
public class Question4 {

    public static <E extends Comparable<E>> void enqueuePriority(SlinkedQueue<E> queue, E data) {
        SlinkedQueue<E> temp = new SlinkedQueue<>();
        boolean added = false;

        while (!queue.isEmpty()) {
            E front = queue.dequeue();
            if (!added && data.compareTo(front) <= 0) {
                temp.enqueue(data);
                added = true;
            }
            temp.enqueue(front);
        }

        if (!added) temp.enqueue(data);

        while (!temp.isEmpty()) {
            queue.enqueue(temp.dequeue());
        }
    }
}