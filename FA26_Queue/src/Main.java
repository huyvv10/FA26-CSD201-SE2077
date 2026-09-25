
public class Main {

    public static void main(String[] args) {
        Queue myQ = new Queue();
        myQ.enqueue(6);
        myQ.enqueue(2);
        myQ.enqueue(8);
        myQ.enqueue(5);
        myQ.enqueue(9);
        myQ.enqueue(3);
        myQ.display();
        myQ.dequeue();
        System.out.println("The element at front of queue: "+myQ.front());
    
    }
}
