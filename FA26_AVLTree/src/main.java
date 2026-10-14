
public class main {

    public static void main(String[] args) {
        AVLTree myAVL = new AVLTree();
        myAVL.root=myAVL.insertAVLNode(myAVL.root, 15);
        myAVL.root=myAVL.insertAVLNode(myAVL.root, 7);
        myAVL.root=myAVL.insertAVLNode(myAVL.root, 25);
        myAVL.root=myAVL.insertAVLNode(myAVL.root, 6);
        myAVL.root=myAVL.insertAVLNode(myAVL.root, 9);
        myAVL.root=myAVL.insertAVLNode(myAVL.root, 11);
        myAVL.root=myAVL.insertAVLNode(myAVL.root, 18);
        myAVL.root=myAVL.insertAVLNode(myAVL.root, 20);
        myAVL.root=myAVL.insertAVLNode(myAVL.root, 4);
        myAVL.breadthFirstTraversal(myAVL.root);
        System.out.println("");
        myAVL.root=myAVL.delAVLByCopying(myAVL.root, 9);        
        myAVL.breadthFirstTraversal(myAVL.root);
        System.out.println("");
        
    }

}
