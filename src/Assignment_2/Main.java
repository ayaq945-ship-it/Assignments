package Assignment_2;

public class Main {
    public static void main(String[] args) {

        // --- السؤال الاول ---
        System.out.println("=== السؤال الاول ===");
        String text = "Hello World!";
        System.out.println("النص الأصلي: " + text);
        String reversed = Question1.reverse(text);
        System.out.println("النص بعد العكس: " + reversed);

        // --- السؤال الثاني ---
        System.out.println("\n=== السؤال الثاني ===");
        SlinkedStack<Integer> stack = new SlinkedStack<>();
        stack.push(30);
        stack.push(10);
        stack.push(20);
        stack.push(50);
        System.out.print("قبل الفرز: ");
        stack.display();
        SlinkedStack<Integer> sortedStack = Question2.sort(stack);
        System.out.print("بعد الفرز: ");
        sortedStack.display();


        // --- السؤال الثالث ---
        System.out.println("===  السؤال الثالث ===");
        SlinkedQueue<Integer> queue1 = new SlinkedQueue<>();
        queue1.enqueue(10);
        queue1.enqueue(20);
        queue1.enqueue(30);
        System.out.print("قبل العكس: ");
        printQueue(queue1);
        Question3.reverse(queue1);
        System.out.print("بعد العكس: ");
        printQueue(queue1);

        // --- السؤال الرابع  ---
        System.out.println("\n=== السؤال الرابع  ===");
        SlinkedQueue<Integer> pq = new SlinkedQueue<>();
        Question4.enqueuePriority(pq, 50);
        Question4.enqueuePriority(pq, 10);
        Question4.enqueuePriority(pq, 30);
        System.out.print("العناصر كامل    : ");
        printQueue(pq);
        System.out.println("أصغر عنصر: " + pq.dequeue());
        System.out.print("بقية العناصر بعد إزالة أصغر عنصر: ");
        printQueue(pq);

        // --- السؤال الخامس ---
        System.out.println("\n=== السؤال الخامس ===");

        SlinkedQueue<Integer> q1 = new SlinkedQueue<>();
        q1.enqueue(5);
        q1.enqueue(15);
        q1.enqueue(25);
        SlinkedQueue<Integer> q2 = new SlinkedQueue<>();
        q2.enqueue(10);
        q2.enqueue(20);
        q2.enqueue(30);
        System.out.print("العناصر  للقائمة الأولى: ");
        printQueue(q1);
        System.out.print("العناصر  للقائمة الثانية: ");
        printQueue(q2);
        SlinkedQueue<Integer> merged = Question5.merge(q1, q2);
        System.out.print("النتيجة بعد الدمج: ");
        printQueue(merged);
    }
    // دالة مساعدة لطباعة SlinkedQueue
    public static <E> void printQueue(SlinkedQueue<E> queue) {
        SlinkedQueue<E> temp = new SlinkedQueue<>();
        while (!queue.isEmpty()) {
            E val = queue.dequeue();
            System.out.print(val + " ");
            temp.enqueue(val);
        }
        System.out.println();
        while (!temp.isEmpty()) queue.enqueue(temp.dequeue());
    }
}