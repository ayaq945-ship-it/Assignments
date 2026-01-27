package Assignment_2;
//Write a function to sort a stack using only another Stack.
public class Question2 {
    public static SlinkedStack<Integer> sort(SlinkedStack<Integer> stack) {
        SlinkedStack<Integer> tempStack = new SlinkedStack<>();
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!tempStack.isEmpty() && tempStack.top() > temp) {
                stack.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        return tempStack;
    }
}