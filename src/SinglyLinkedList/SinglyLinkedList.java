package SinglyLinkedList;

public class SinglyLinkedList<E> {
    private Node<E> head=null;
    private Node<E> tail=null;
    private int size=0;

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size()==0;
    }

    public void addFirst(E data){
        Node<E> newNode=new Node(data,head);
        head=newNode;
        if (isEmpty())
            tail=newNode;
        size++;
    }
    public E getFirst(){
        return head.getData();
    }
    public E removeFirst(){
        if(isEmpty())return null;
        E delete= head.getData();
        head=head.getNext();
        size--;
        if(isEmpty()) {
            tail=head;
        }
        return delete;
    }
    public void display(){
        Node<E> temp=head;
        while (temp!=null){
            System.out.print(temp.getData()+"---->");
            temp=temp.getNext();
        }
        System.out.println(" null");


    }
    public void display2(){
        Node<E> temp = head;
        System.out.print("[ ");
        while (temp != null){
            System.out.print(temp.getData() + " "); // ← إضافة مسافة بين العناصر
            temp = temp.getNext();
        }
        System.out.println("]"); // ← إضافة سطر جديد بعد الطباعة
    }


    public void addLast(E data){
        Node<E> newNode=new Node(data,null);
        if(isEmpty()){
            head=newNode;
        }
        else {
            tail.setNext(newNode);
        }
        tail=newNode;
        size++;
    }
    public E removeLast(){
        if (isEmpty())return null;
        E delete=tail.getData(); //store the deleted data
        if (head==tail){
            head=null;
            tail=null;
        }
        else {
            Node<E>temp=head;
            while (temp.getNext()!=tail){
                temp=temp.getNext();
            } temp.setNext(null);
            tail=temp;
        }
        size--;
        return delete;
    }

    public void addAtPosition(E data,int position){
        if(position<1|| position>size+1){
            throw new IllegalArgumentException("invaild position");
        }
        if(position==1){
            addFirst(data);
            return;
        }
        else {
            Node<E>temp=head;
            Node<E>newNode=new Node(data,null);
            int count=1;
            while (count<position-1){
                temp=temp.getNext();
                count++;
            }newNode.setNext(temp.getNext());
            temp.setNext(newNode);

            if(newNode.getNext()==null){
                tail=newNode;
            }
            size++;
        }

    }














    public E getLast(){
        return tail.getData();
    }







    class Node<E>{
        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }


}