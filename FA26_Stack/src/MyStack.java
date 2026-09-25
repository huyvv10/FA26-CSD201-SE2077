
public class MyStack {

    private Node head;

    //Empty stack
    public MyStack() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(Object x) {
        Node newNode = new Node(x);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    //Read data at the top of stack without remove
    public Object top() {
        if (isEmpty()) {
            return null;
        }
        return head.data;
    }

    //Remove an element at top of tack
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            head = head.next;
        }
    }

    public void display() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println("");
    }
}
