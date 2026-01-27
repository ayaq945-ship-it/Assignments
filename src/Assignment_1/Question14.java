package Assignment_1;
import CircularLinkedList.CircularLinkedList;
// Write a function to delete a node from a specific position in a circular linked
public class Question14 {
    public void run() {
        CircularLinkedList<Integer> list = new CircularLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);

        int position = 2;
        System.out.println("القائمة الاصلية  :");
        list.display();

        for(int i=0;i<position;i++){
            list.addLast(list.removeFirst());
        }
        list.removeFirst();

        System.out.println("بعد حذف العصر الذي بالموقع[" + position + "]:");
        list.display();
    }
}