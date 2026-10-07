
public class BSTree {

    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
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

    public void breadth_first_traversal() {
        if (root == null) {
            return;
        }
        Queue myQ = new Queue();
        myQ.enqueue(root);
        while (!myQ.isEmpty()) {
            Node p = (Node) myQ.front();
            visit(p);
            myQ.dequeue();
            if (p.left != null) {
                myQ.enqueue(p.left);
            }
            if (p.right != null) {
                myQ.enqueue(p.right);
            }
        }
    }

    //Node which has at least one child
    public int countInternalNodes() {
        int count = 0;
        if (root == null) {
            return count;
        }
        Queue myQ = new Queue();
        myQ.enqueue(root);
        while (!myQ.isEmpty()) {
            Node p = (Node) myQ.front();
            if (p.left != null || p.right != null) {
                count++;
            }
            myQ.dequeue();
            if (p.left != null) {
                myQ.enqueue(p.left);
            }
            if (p.right != null) {
                myQ.enqueue(p.right);
            }
        }
        return count;
    }

    //Count leaf node - no children
    public int countExternalNodes() {
        int count = 0;
        if (root == null) {
            return count;
        }
        Queue myQ = new Queue();
        myQ.enqueue(root);
        while (!myQ.isEmpty()) {
            Node p = (Node) myQ.front();
            if (p.left == null && p.right == null) {
                count++;
            }
            myQ.dequeue();
            if (p.left != null) {
                myQ.enqueue(p.left);
            }
            if (p.right != null) {
                myQ.enqueue(p.right);
            }
        }
        return count;
    }

    public int countNodesWithTwoChildren(Node xRoot) {
        int count = 0, l = 0, r = 0;
        if (xRoot == null) {
            return 0;
        }
        if (xRoot.left != null && xRoot.right != null) {
            count++;
        }
        if (xRoot.left != null) {
            l = countNodesWithTwoChildren(xRoot.left);
        }
        if (xRoot.right != null) {
            r = countNodesWithTwoChildren(xRoot.right);
        }
        return count + l + r;
    }

    public int countNodesHasALeftChild() {
        int count = 0;
        if (root == null) {
            return count;
        }
        Queue myQ = new Queue();
        myQ.enqueue(root);
        while (!myQ.isEmpty()) {
            Node p = (Node) myQ.front();
            if (p.left != null && p.right == null) {
                count++;
            }
            myQ.dequeue();
            if (p.left != null) {
                myQ.enqueue(p.left);
            }
            if (p.right != null) {
                myQ.enqueue(p.right);
            }
        }
        return count;
    }

    public int countNodesHasARightChild() {
        int count = 0;
        if (root == null) {
            return count;
        }
        Queue myQ = new Queue();
        myQ.enqueue(root);
        while (!myQ.isEmpty()) {
            Node p = (Node) myQ.front();
            if (p.left == null && p.right != null) {
                count++;
            }
            myQ.dequeue();
            if (p.left != null) {
                myQ.enqueue(p.left);
            }
            if (p.right != null) {
                myQ.enqueue(p.right);
            }
        }
        return count;
    }

    //Return the right most node of the left subtree
    public Node findTheRightMostNode(Node p) {
        Node cur = p.left;
        while (cur.right != null) {
            cur = cur.right;
        }
        return cur;
    }

    public Node deleteByCopying(Node xRoot, int x) {
        if (xRoot == null) {
            return null;
        }
        if (x < xRoot.data) {
            xRoot.left = deleteByCopying(xRoot.left, x);
        } else if (x > xRoot.data) {
            xRoot.right = deleteByCopying(xRoot.right, x);
        } else {
            if (xRoot.left == null && xRoot.right == null) {
                return null;
            }
            //Case 1
            if (xRoot.left != null && xRoot.right == null) {
                return xRoot.left;
            }
            //Case 2
            if (xRoot.left == null && xRoot.right != null) {
                return xRoot.right;
            }
            //Case 3
            Node nodeCopy = findTheRightMostNode(xRoot);
            xRoot.data = nodeCopy.data;
            xRoot.left = deleteByCopying(xRoot.left, nodeCopy.data);
        }
        return xRoot;
    }

    public Node deleteByMerging(Node root, int x){
        if (root==null) return null;
        if (x < root.data){
            root.left = deleteByMerging(root.left, x);
        } else if (x > root.data){
            root.right = deleteByMerging(root.right, x);
        } else {
            //Case 1: leaf node
            if (root.left==null && root.right==null) return null;
            //Case 2: Only has a left child
            if (root.left!=null && root.right==null)
                return root.left;
            //Case 3: Only has a right child
            if (root.left==null && root.right!=null)
                return root.right;
            //Case 4: Has two children
            Node mergeNode = findTheRightMostNode(root);
            mergeNode.right=root.right;
            return root.left;
        }
        return root;
    }
    

}
