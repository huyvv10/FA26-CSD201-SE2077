
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
        System.out.println("7. Get maximum value");
        System.out.println("8. Get minimum value");
        System.out.println("9. Edit value at pos");
        System.out.println("10. Remove fist");
        System.out.println("11. Remove last");
        System.out.println("12. Remove at a specific position");
        System.out.println("13. Remove all element with a specific value");
        System.out.println("14. Sort the list in ascending order");
        System.out.println("15. Sort the list in descending order");
        System.out.println("16. Sort the list in range");
        System.out.println("17. Get the position first found x");
        System.out.println("18. Get the position the-k of a value");
        System.out.println("0. Quit");
        System.out.print("Your selection: ");
    }

    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.addFirst(6);
//        myList.addFirst(6);
//        myList.addFirst(6);
//        myList.addFirst(6);
//        myList.addFirst(6);
//        myList.addFirst(6);
        myList.addFirst(9);
        myList.addFirst(2);
        myList.addFirst(0);
        myList.addFirst(5);
        myList.addFirst(9);
        myList.addFirst(4);
        myList.display();
        myList.addLast(3);
        myList.addLast(8);
        myList.addLast(0);
        myList.addLast(6);
        myList.addLast(7);
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
                case 7:
                    System.out.println("The maximum value: "
                            + myList.getMaxValue());
                    break;
                case 8:
                    System.out.println("The minimum value: "
                            + myList.getMinValue());
                    break;
                case 9:
                    System.out.print("Input new value: ");
                    x = sn.nextInt();
                    System.out.print("Input position to edit: ");
                    pos = sn.nextInt();
                    myList.editAtPos(x, pos); break;
                case 10:
                    System.out.println("Remove first");
                    myList.removeFirst();
                    myList.display(); break;
                case 11:
                    System.out.println("Remove last");
                    myList.removeLast();
                    myList.display(); break;
                case 12:
                    System.out.println("Remove at a specific postion ");
                    System.out.print("Input pos = ");
                    pos=sn.nextInt();
                    myList.removeAtPos(pos);
                    myList.display(); break;
                case 13:
                    System.out.println("Remove all elements x");
                    System.out.print("Input a value to remove: ");
                    x = sn.nextInt();
                    myList.removeAll(x);
                    myList.display(); break;
                case 14:
                    System.out.println("Sort the list in ascending order");
                    myList.sortAsc();
                    myList.display();break;
                case 15:
                    System.out.println("Sort the list in descending order");
                    myList.sortDesc();
                    myList.display();break;
                case 16:
                    System.out.println("Sort in range");
                    myList.sortInRangeAsc(2, 7);
                    myList.display(); break;
                case 17:
                    System.out.println("Get the first pos of node");
                    System.out.print("Input searching number: ");
                    x = sn.nextInt();
                    pos = myList.getTheFirstPos(x);
                    if (pos!=-1)
                        System.out.println("The position first found "+x+" is: "+pos);
                    else
                        System.out.println("Find not found "+x +" in the list." );
                    break;
                case 18:
                    System.out.println("Get the position the-k of an element");
                    System.out.print("Input searching number: ");
                    x = sn.nextInt();
                    System.out.print("Input the-k: ");
                    int k=sn.nextInt();
                    pos=myList.getPositionTheK(x, k);
                    if (pos!=-1)
                        System.out.println("The position the-"+k+ " of " +x+" is: "+pos);
                    else
                        System.out.println("Find not found the position the-"+k+" of "+x +" in the list." );
                    break;                    
                case 0:
                    break;
                default:
                    System.out.println("Invalid selection.");
            }
        }  while (sel != 0);
    }
}
