
import java.util.Scanner;


public class Main {
    public static void menu(){
        System.out.println("\n------Double linked list ----");
        System.out.println("1. Add First");
        System.out.println("2. Add Last");
        System.out.println("3. Display");
        System.out.println("4. Count number of nodes");
        System.out.println("5. Add at pos");
        System.out.println("6. Remove First");
        System.out.println("7. Remove Last");
        System.out.println("8. Remove At pos");
        System.out.println("9. Remove first x");
        System.out.println("10. Remove All x");
        System.out.println("0. Quit");
        System.out.print("Your selection: ");
    }
    public static void main(String[] args) {
        DoubleLinkedList myList = new DoubleLinkedList();
        myList.addFirst(6);
        myList.addFirst(4);
        myList.addFirst(9);
        myList.addFirst(2);
        myList.addFirst(8);
        myList.display();
        myList.addLast(7);
        myList.addLast(3);
        myList.addLast(5);
        myList.addLast(9);
        myList.addLast(8);
        myList.display();
        int n, x, pos;
        String sel;
        Scanner sn = new Scanner(System.in);
        do{
            menu();
            sel = sn.nextLine();  
            switch (sel){
                case "1":
                    System.out.print("Input x = ");
                    x = sn.nextInt();
                    myList.addFirst(x);
                    myList.display(); 
                    sn.nextLine();  //Clear buffer
                    break;                    
                case "2":
                    System.out.print("Input x = ");
                    x = sn.nextInt();
                    myList.addLast(x);
                    myList.display(); 
                    sn.nextLine();  //Clear buffer
                    break;
                case "3":
                    myList.display(); 
                    sn.nextLine();  //Clear buffer
                    break;
                case "4":
                    System.out.println("Number of nodes: "+ myList.countNodes());
                    break;
                case "5":
                    System.out.print("Input x = ");
                    x = sn.nextInt();
                    System.out.print("Input position pos = ");
                    pos = sn.nextInt();
                    myList.addAtPos(x, pos);
                    myList.display();
                    sn.nextLine(); break;
                case "6":
                    System.out.println("Remove first");
                    myList.removeFirst();
                    myList.display();
                    break;
                case "7":
                    System.out.println("Remove last");
                    myList.removeLast();
                    myList.display();
                    break;
                case "8":
                    System.out.print("Input pos to remove: ");
                    pos = sn.nextInt();
                    myList.removeAtPos(pos);
                    myList.display(); 
                    sn.nextLine();
                    break;
                case "0":
                    System.out.println("Bye bye!");
                    break;
                default:
                    System.out.println("Invalid selection. Please select again.");
                    break;
            }       
        }while (!sel.equals("0"));
              
    }
}
