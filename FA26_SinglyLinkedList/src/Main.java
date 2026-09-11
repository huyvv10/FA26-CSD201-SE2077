
import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("\n==============");
        System.out.println("1. Add first");
        System.out.println("2. Add last");
        System.out.println("3. Display list");
        System.out.println("4. Count nodes");
        System.out.println("5. Add at pos");
        System.out.println("6. Get node at pos");
        System.out.println("0. Quit");
        System.out.print("Your selection: ");
    }

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
        int sel, x, pos;
        Scanner sn = new Scanner(System.in);
        do {
            menu();
            sel = sn.nextInt();
            switch (sel) {
                case 1:
                    System.out.print("Input x: ");
                    x = sn.nextInt();
                    myList.addFirst(x);
                    break;
                case 2:
                    System.out.print("Input x: ");
                    x = sn.nextInt();
                    myList.addLast(x);
                    break;
                case 3:
                    myList.display(); break;
                case 4:
                    System.out.println("Number of nodes: "
                            + myList.countNodes());
                    break;
                case 5:
                    System.out.print("Input x = ");
                    x = sn.nextInt();
                    System.out.print("Input pos = ");
                    pos = sn.nextInt();
                    myList.insertAtPos(x, pos);
                    myList.display();
                case 6:
                    System.out.print("Input pos to get value: ");
                    pos = sn.nextInt();
                    Node xNode = myList.getNodeAtPos(pos);
                    if (xNode!=null)
                        System.out.println("The value at "+pos+" is: "+xNode.info);
                    else
                        System.out.println("The position "+ pos+ " is out of range.");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid selection.");

            }
            
        }  while (sel != 0);

    }
}
