package Assignment_2;
//Write a function to reverse a string using Stack.
public class Question1 {
    public static String reverse(String str) {
        SlinkedStack<Character> stack = new SlinkedStack<>();
        // دفع كل حرف إلى الـ Stack
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }
        // إخراج الأحرف من الـ Stack بالعكس
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}