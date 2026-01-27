package Assignment_1;
import CircularLinkedList.CircularLinkedList;
//Write a function to find the index of a given data value in a linked list If the data value is not found in the linked list, return -1.
public class Question8 {
    public void run() {
        CircularLinkedList<Integer> list = new CircularLinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        int target = 30;
        int index = -1;
        int i = 0;
        for(Integer val : new Integer[]{10,20,30,40}){
            if(val == target){
                index = i;
                break;
            }
            i++;
        }
        System.out.println("Index of " + target + " is: " + index);
    }
}