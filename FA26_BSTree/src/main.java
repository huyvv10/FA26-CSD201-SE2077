
public class main {

                
public static void main(String[] args) {
        BSTree myTree = new BSTree();
        myTree.addNode(10);
        myTree.addNode(7);
        myTree.addNode(15);
        myTree.addNode(4);
        myTree.addNode(9);
        myTree.addNode(12);
        myTree.addNode(2);
        myTree.addNode(6);
        myTree.addNode(5);
        myTree.preOrder(myTree.getRoot());
        System.out.println("\nInOrder");
        myTree.inOrder(myTree.getRoot());
        System.out.println("\nPostOrder");
        myTree.postOrder(myTree.getRoot());
        System.out.println("");
}

}
