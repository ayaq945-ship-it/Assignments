package Assignment_1;
import CircularLinkedList.CircularLinkedList;
//Write a function to split a circular linked list into two halves
public class Question16 {

    public void run() {
        CircularLinkedList<Integer> list = new CircularLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);

        System.out.println("  القائمة الاصلية:");
        list.display();

        int n = list.size();
        CircularLinkedList<Integer> firstHalf = new CircularLinkedList<>();
        CircularLinkedList<Integer> secondHalf = new CircularLinkedList<>();

        int count = 0;
        while(count < n){
            int val = list.removeFirst();
            if(count < n/2){
                firstHalf.addLast(val);
            } else{
                secondHalf.addLast(val);
            }
            count++;
        }

        System.out.println("النصف الاول :");
        firstHalf.display();
        System.out.println("النصف الثاني :");
        secondHalf.display();
    }
}