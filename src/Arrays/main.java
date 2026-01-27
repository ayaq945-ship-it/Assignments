package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arrayss arr = new Arrayss();

        int []numbers={1,2,3,4,5,6,7};

        int resultb= arr.binarySearch(numbers,5);
        if(resultb!= -1)
            System.out.println("value found at index:"+resultb);
        else
            System.out.println("not found!!!");

//        int result =arr.linearSearch(numbers,9);
//        if(result!= -1)
//            System.out.println("value found at index:"+result);
//        else
//            System.out.println("not found!!!");





        //arr.shiftLeft_Delete(numbers,2);
        // arr.traversal(numbers);




        //numbers[2]=7;

        // arr.update(numbers,8,7);
        //arr.delete(numbers,2);

        // arr.Reverse_traversal(numbers2);


        /// System.out.println("PLease enter  "+numbers2.length+"  elements:");
        // arr.input(numbers2);





        //1
        // System.out.println(Arrays.toString(numbers2));

        //2


        //3
//        for (int i=0;i<numbers.length;i++){
//            System.out.println("Index["+i+"]"+"="+numbers[i]);
//        }


    }
}