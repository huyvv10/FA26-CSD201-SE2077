public class DoubleLinkedList {
    private Node head, tail;
    
    public DoubleLinkedList(){
        head=tail=null;
    }
    
    public boolean isEmpty(){
        return head==null;
    }
    
    public void addFirst(int x){
        Node newNode = new Node(x);
        if (isEmpty()){
            head=tail=newNode;
        } else {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }
    
    public void addLast(int x){
        Node newNode = new Node(x);
        if (isEmpty()){
            head=tail=newNode;
        } else {
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
    }
    
    //Return number of nodes within the list
    public int countNodes(){
        Node cur=head;
        int count=0;
        while (cur!=null){
            count++;
            cur=cur.next;
        }        
        return count;
    }
    
    //Insert x into position pos
    public void addAtPos(int x, int pos){
        int n = countNodes();
        if (pos<0 || pos>n) return;
        if (pos==0) {
            addFirst(x); return;
        }
        if (pos==n){
            addLast(x); return;
        }
        Node newNode = new Node(x);
        int i = 0;
        Node cur = head;
        while (i!=pos){
            i++;
            cur=cur.next;
        }
        newNode.next=cur;
        cur.prev.next=newNode;
        newNode.prev=cur.prev;
        cur.prev=newNode;
    }
    
    public void removeFirst(){
        if (isEmpty()) return;
        if (head.next==null){
            head=tail=null; return;
        }
        head.next.prev=null;
        head=head.next;
    }
    
    public void removeLast(){
        if (isEmpty()) return;
        if (head.next==null){
            head=tail=null; return;
        }        
        tail.prev.next=null;
        tail=tail.prev;
    }
    
    public void removeAtPos(int pos){
        if (isEmpty()) return;
        int n = countNodes();
        if (pos<0 || pos>=n) return;
        if (pos==0){
            removeFirst(); return;
        }
        if (pos==n-1){
            removeLast(); return;
        }
        int i=0;
        Node cur=head;
        while (i!=pos){
            i++;
            cur=cur.next;
        }
        cur.prev.next=cur.next;
        cur.next.prev=cur.prev;
    }
    
    public void removeFirstFound(int x){
        
    }

    public void removeAll(int x){
        
    }
    
    void display(){
        Node cur=head;
        while (cur!=null){
            System.out.print(cur.info+" ");
            cur=cur.next;
        }
        System.out.println("");
    }
}
