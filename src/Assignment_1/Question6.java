package Assignment_1;
import CircularLinkedList.CircularLinkedList;
//Write a function in to rotate a linked list to the right by k places, where k is anon-negative integer
public class Question6 {
    public void run() {
        CircularLinkedList<Integer> list = new CircularLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);


        System.out.println("  القائمة الدائرية الاصلية:");
        list.display();

        int k = 2;
        for(int i=0;i<k;i++){
            Integer last = list.removeLast();
            list.addFirst(last);
        }

        System.out.println("القائمة بعد تدويرها الى اليمين بمقدار " + k + " خانة:");
        list.display();
    }

}