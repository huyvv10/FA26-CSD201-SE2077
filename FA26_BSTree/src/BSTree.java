
public class BSTree {

    private Node root;

    public Node getRoot() {
        return root;
    }

    public BSTree() {
        root = null;
    }

    public void addNode(int x) {
        Node newNode = new Node(x);
        if (root == null) {
            root = newNode;
        } else {
            Node cur = root;
            while (cur != null) {
                if (x == cur.data) {
                    System.out.println(x + " already existed.");
                } else {
                    if (x < cur.data) {
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
        }
    }

    public void visit(Node p) {
        if (p != null) {
            System.out.print(p.data + " ");
        }
    }

    public void preOrder(Node p) {
        visit(p);
        if (p.left != null) {
            preOrder(p.left);
        }
        if (p.right != null) {
            preOrder(p.right);
        }
    }
    public void inOrder(Node p) {
        if (p.left != null) {
            inOrder(p.left);
        }
        visit(p);
        if (p.right != null) {
            inOrder(p.right);
        }
    }
    public void postOrder(Node p) {
        if (p.left != null) {
            postOrder(p.left);
        }
        if (p.right != null) {
            postOrder(p.right);
        }
        visit(p);
    }
}
