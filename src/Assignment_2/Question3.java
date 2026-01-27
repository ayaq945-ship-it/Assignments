package Assignment_2;
//Write a function to reverse the order of elements in a queue.
class Question3 {

    public static <E> void reverse(SlinkedQueue<E> queue) {
        SlinkedQueue<E> tempQueue = new SlinkedQueue<>();
        int size = queue.size();

        Object[] arr = new Object[size];
        for (int i = 0; i < size; i++) {
            arr[i] = queue.dequeue();
        }

        for (int i = size - 1; i >= 0; i--) {
            queue.enqueue((E) arr[i]);
        }
    }
}