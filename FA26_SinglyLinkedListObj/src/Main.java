
public class Main {

    public static void main(String[] args) {
        SinglyLinkedListObj myList = new SinglyLinkedListObj();
        myList.addFirst(new Product(1, "Quan dai", 1, 1.5));
        myList.addFirst(new Product(2, "Quan short", 2, 5.5));
        myList.addFirst(new Product(3, "T-Shirt", 4, 3));
        myList.addFirst(new Product(4, "Xien ban", 5, 5));
        myList.addFirst(new Product(5, "Ban la", 8, 20));
        myList.display();
        myList.addLast(new Product(6, "May giat", 7, 350.5));
        myList.addLast(new Product(7, "Power way", 6, 250.0));
        myList.addLast(new Product(8, "Ban chai", 4, 5));
        myList.addLast(new Product(9, "Apple", 8, 15));
        myList.display();
    }
}
