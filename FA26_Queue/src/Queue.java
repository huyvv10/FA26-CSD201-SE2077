public class Queue {
    private Node head, tail;
    
    //Empty queue
    public Queue(){
        head=tail=null;
    }
    
    public boolean isEmpty(){
        return head==null;
    }
    
    //enqueue as addLast
    public void enqueue(Object x){
        Node newNode = new Node(x);
        if (isEmpty()){
            head=tail=newNode;
        } else {
            tail.next=newNode;
            tail=newNode;
        }
    }
    
    //Remove an element at the front of queue
    //Remove first
    public void dequeue(){
        if (isEmpty()) {
            System.out.println("The queue is empty.");
            return;
        }
        if (head.next==null){
            head=tail=null;
        } else {
            head=head.next;
        }
    }
    
    //Read data at the front of queue without remove
    public Object front(){
        if (isEmpty()) return null;
        return head.data;
    }
    
    public void display(){
        Node cur=head;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println("");
    }
}
