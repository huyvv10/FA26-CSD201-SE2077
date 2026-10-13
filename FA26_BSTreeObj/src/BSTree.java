
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;


public class BSTree {

    Node root;

    public BSTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    //Do nothing if CarName containing 'X' or 'x'
    //or price <30000. Otherwise insert Car to the tree
    public Node addNode(Car xCar) {
        if (xCar.name.contains("x")
                || xCar.name.contains("X")
                || xCar.price < 30000) {
            return root;
        }
        Node newNode = new Node(xCar);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node cur = root;
            while (cur != null) {
                if (xCar.price == cur.data.price) {
                    System.out.println("Car already existed.");
                    break;
                }
                if (xCar.price < cur.data.price) {
                    if (cur.left == null) {
                        cur.left = newNode;
                        break;
                    } else {
                        cur = cur.left;
                    }
                } else {
                    if (cur.right == null) {
                        cur.right = newNode;
                        break;
                    } else {
                        cur = cur.right;
                    }
                }
            }
        }
        return root;
    }

    public void visit(Node p) {
        if (p != null) {
            System.out.print(p.data.toString());
        }
    }

    //G -> L -> R
    public void preOrder(Node xRoot) {
        if (xRoot == null) {
            return;
        }
        visit(xRoot);   //Visit root
        if (xRoot.left != null) {
            preOrder(xRoot.left);
        }
        if (xRoot.right != null) {
            preOrder(xRoot.right);
        }
    }
    //L-> G -> R
    public void inOrder(Node xRoot) {
        if (xRoot == null) {
            return;
        }
        if (xRoot.left != null) {
            inOrder(xRoot.left);
        }
        visit(xRoot);   //Visit root
        if (xRoot.right != null) {
            inOrder(xRoot.right);
        }
    }
    //L -> R -> G
    public void postOrder(Node xRoot) {
        if (xRoot == null) {
            return;
        }
        if (xRoot.left != null) {
            postOrder(xRoot.left);
        }
        if (xRoot.right != null) {
            postOrder(xRoot.right);
        }
        visit(xRoot);   //Visit root
    }
    
    //Level Traversal - Breadth First Traversal
    public void breadthFirstTraversal(){
        if (isEmpty()) return;
        Queue<Node> myQ  = new LinkedList<>() ;
        myQ.add(root);
        while (!myQ.isEmpty()){
            Node p = myQ.peek();
            visit(p);
            myQ.poll();
            if (p.left!=null) myQ.add(p.left);
            if (p.right!=null) myQ.add(p.right);
        }
    }
}
