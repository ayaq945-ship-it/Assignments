package stack;

public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> l_Stack =new ArrayStack<Integer>(5);
        l_Stack.push(10);
        l_Stack.push(20);
        l_Stack.push(30);
        l_Stack.push(40);
        l_Stack.push(50);   //
        l_Stack.push(60);

        System.out.println("the top is :"+ l_Stack.top());
        while (!l_Stack.isEmpty()){
            System.out.println("element removerd:"+l_Stack.pop());
        }
    }
}