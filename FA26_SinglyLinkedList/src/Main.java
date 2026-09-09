
public class Main {

    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.addFirst(6);
        myList.addFirst(9);
        myList.addFirst(2);
        myList.addFirst(0);
        myList.addFirst(5);
        myList.display();
        myList.addLast(3);
        myList.addLast(8);
        myList.display();   
        System.out.println("Number of nodes: "
                + myList.countNodes());
               
    }
}
