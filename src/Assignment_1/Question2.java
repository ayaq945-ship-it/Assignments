package Assignment_1;
import Arrays.Arrayss;
import java.util.Random;
//Write a program in Java to remove a random element from an array
public class Question2 {
    public void run() {
        Arrayss arrayHelper = new Arrayss();
        int[] arr = {10, 20, 30};
        System.out.println(" المصفوفة الاصلية:");
        arrayHelper.traversal(arr);

        Random rand = new Random();
        int randomIndex = rand.nextInt(arr.length);
        arrayHelper.shiftLeft_Delete(arr, randomIndex);

        System.out.println("المصفوفة بعد حذف عنصر عشوائي");
        arrayHelper.traversal(arr);
    }
}