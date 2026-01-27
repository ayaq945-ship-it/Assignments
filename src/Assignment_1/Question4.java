package Assignment_1;
import Arrays.Arrayss;
//Write a Java program to reverse an array
public class Question4 {

    public void run() {
        Arrayss arrayHelper = new Arrayss();
        int[] arr = {1, 2, 3};
        System.out.println("المصفوفة الاصلية :");
        arrayHelper.traversal(arr);

        System.out.println("المصفوفة المعكوسة :");
        arrayHelper.Reverse_traversal(arr);
    }
}