
import java.util.LinkedList;
import java.util.Queue;

public class AVLTree {

    Node root;

    public AVLTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int getHeight(Node p) {
        if (p == null) {
            return 0;
        }
        return p.height;
    }

    public int getBalance(Node p) {
        if (p == null) {
            return 0;
        }
        return getHeight(p.left) - getHeight(p.right);
    }

    public Node rightRotation(Node p) {
        if (p == null) {
            return null;
        }
        Node k = p.left;
        p.left = k.right;
        k.right = p;
        return k;
    }

    public Node leftRotation(Node p) {
        if (p == null) {
            return null;
        }
        Node k = p.right;
        p.right = k.left;
        k.left = p;
        return k;
    }

    public Node insertAVLNode(Node root, int x) {
        Node newNode = new Node(x);
        if (root == null) {
            root = newNode;
            return root;
        }
        if (x < root.data) {
            root.left = insertAVLNode(root.left, x);
        } else if (x > root.data) {
            root.right = insertAVLNode(root.right, x);
        } else {
            return root;
        }
        root.height = Math.max(getHeight(root.left), getHeight(root.right)) + 1;
        int balanceFactor = getBalance(root);
        //Case 1:
        if (balanceFactor > 1 && x < root.left.data) {
            return rightRotation(root);
        }
        //Case 2: 
        if (balanceFactor > 1 && x > root.left.data) {
            root.left = leftRotation(root.left);
            return rightRotation(root);
        }
        //Case 3:
        if (balanceFactor < -1 && x > root.right.data) {
            return leftRotation(root);
        }
        //Case 4:
        if (balanceFactor < -1 && x < root.right.data) {
            root.right = rightRotation(root.right);
            return leftRotation(root);
        }
        return root;
    }

    public void visit(Node p) {
        if (p == null) {
            return;
        }
        System.out.print(p.data + " ");
    }

    public void breadthFirstTraversal(Node p) {
        if (p == null) {
            return;
        }
        Queue<Node> myQ = new LinkedList<>();
        myQ.add(p);
        while (!myQ.isEmpty()) {
            Node cur = myQ.peek();  //front
            visit(cur);
            myQ.poll();             //dequeue
            if (cur.left != null) {
                myQ.add(cur.left);
            }
            if (cur.right != null) {
                myQ.add(cur.right);
            }
        }
    }

    //Return the right most node of the left subtree
    public Node findTheRightMostNode(Node p) {
        Node cur = p.left;
        while (cur.right != null) {
            cur = cur.right;
        }
        return cur;
    }

    public Node delAVLByCopying(Node xRoot, int x) {
        if (xRoot == null) {
            return null;
        }
        if (xRoot.left == null && xRoot.right == null) {
            return null;
        }
        if (x < xRoot.data) {
            xRoot.left = delAVLByCopying(xRoot.left, x);
        } else if (x > xRoot.data) {
            xRoot.right = delAVLByCopying(xRoot.right, x);
        } else if (x == xRoot.data) {
            //Case1: Leaf node
            if (xRoot.left == null && xRoot.right == null) {
                return null;
            }
            //Case2: Node has a left child
            if (xRoot.left != null && xRoot.right == null) {
                return xRoot.left;
            }
            //Case3: Node has a righ child
            if (xRoot.left == null && xRoot.right != null) {
                return xRoot.right;
            }
            //Case4: Node has 2 children
            Node newNode = findTheRightMostNode(xRoot.right);
            xRoot.data = newNode.data;
            xRoot.right = delAVLByCopying(xRoot.right, newNode.data);
        }
        xRoot.height = Math.max(getHeight(xRoot.left), getHeight(xRoot.right)) + 1;
        int balanceFactor = getBalance(xRoot);
        //TH1:
        if (balanceFactor > 1 && getBalance(xRoot.left) >= 0) {
            return rightRotation(xRoot);
        }
        //TH2:
        if (balanceFactor > 1 && getBalance(xRoot.left) < 0) {
            xRoot.left = leftRotation(xRoot.left);
            return rightRotation(xRoot);
        }
        //TH3:
        if (balanceFactor < -1 && getBalance(xRoot.right) <= 0) {
            return leftRotation(xRoot);
        }
        //TH4: 
        if (balanceFactor < -1 && getBalance(xRoot.right) > 0) {
            xRoot.right = leftRotation(xRoot.right);
            return leftRotation(xRoot);
        }
        return xRoot;
    }

}
