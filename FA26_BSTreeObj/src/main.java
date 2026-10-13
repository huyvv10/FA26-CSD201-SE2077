
public class main {

    public static void main(String[] args) {
        BSTree myBST = new BSTree();
        myBST.root=myBST.addNode(new Car("V01","Vinfast VF9", 70000));
        myBST.root=myBST.addNode(new Car("M02","Mazda CX5", 35000));
        myBST.root=myBST.addNode(new Car("V03","Vinfast VF8", 37000));
        myBST.root=myBST.addNode(new Car("T04","Camry 2.0", 50000));
        myBST.root=myBST.addNode(new Car("H05","Santafe", 45000));
        myBST.root=myBST.addNode(new Car("F06","Phantom Ghost", 350000));
        myBST.root=myBST.addNode(new Car("F07","X-Ford", 650000));
        myBST.root=myBST.addNode(new Car("K08","Kia morning", 20000));
        myBST.root=myBST.addNode(new Car("H09","Hyndai i20", 30000));
        System.out.println("---PreOrder ---");
        myBST.preOrder(myBST.root);
        System.out.println("\n---InOrder ---");
        myBST.inOrder(myBST.root);
        System.out.println("\n---PostOrder ---");
        myBST.postOrder(myBST.root);
        System.out.println("\n---BFS---");
        myBST.breadthFirstTraversal();
        System.out.println("");
    }
}
