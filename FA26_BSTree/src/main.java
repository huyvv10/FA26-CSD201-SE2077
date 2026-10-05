
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
        myTree.addNode(13);
        myTree.addNode(5);
        System.out.println("\nPreOrder");
        myTree.preOrder(myTree.getRoot());
        System.out.println("\nInOrder");
        myTree.inOrder(myTree.getRoot());
        System.out.println("\nPostOrder");
        myTree.postOrder(myTree.getRoot());
        System.out.println("\nBFS");
        myTree.breadth_first_traversal();
        System.out.println("\nNumber of internal nodes: "+
            myTree.countInternalNodes());
        System.out.println("Number of external nodes: "+
            myTree.countExternalNodes());
        System.out.println("Count nodes with 2 children: "+
            myTree.countNodesWithTwoChildren(myTree.getRoot()));
        System.out.println("Count nodes only has a left child: "+
            myTree.countNodesHasALeftChild());
        System.out.println("Count nodes only has a right child: "+
            myTree.countNodesHasARightChild());
        System.out.println("Right most node: "+
            myTree.findTheRightMostNode(myTree.getRoot()).data);
        System.out.println("Delete by Copying");
        myTree.deleteByCopying(myTree.getRoot(), 10);
        myTree.inOrder(myTree.getRoot());
        System.out.println("");
}

}
