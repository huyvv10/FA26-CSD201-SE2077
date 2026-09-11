public class SinglyLinkedList {
    Node head, tail;

    public SinglyLinkedList() {
        head=tail=null;
    }
    
    public boolean isEmpty(){
        return head==null;
    }
    //Insert x into the begining of the list
    public void addFirst(int x){
        Node newNode = new Node(x);
        if (isEmpty()){
            head=tail=newNode;
        } else{
            newNode.next=head;
            head=newNode;
        }
    }
    
    //Insert x into the last of the list
    public void addLast(int x){
        Node newNode = new Node(x);
        if (isEmpty()){
            head=tail=newNode;
        } else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    
    //Count number of elements within the list
    public int countNodes(){
        int count=0;
        Node cur=head;
        while (cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    
    public void insertAtPos(int x, int pos){
        int n = countNodes();
        if (pos<0 || pos>n) return;
        if (pos==0) {addFirst(x); return;}
        if (pos==n) {addLast(x); return;}
        Node newNode = new Node(x);
        int i=0;
        Node cur=head;
        while (i+1!=pos){
            cur=cur.next;
            i++;
        }
        newNode.next=cur.next;
        cur.next=newNode;
    }
    
    //Return node at position pos
    public Node getNodeAtPos(int pos){
        int n = countNodes();
        if (pos<0 || pos>=n) return null;        
        Node cur=head;
        int i=0;
        while (i!=pos){
            cur=cur.next;
            i++;
        }
        return cur;
    }
    
    //Return the maximum value within the list
    public int getMaxValue(){
        int max=head.info;
        Node cur=head;
        while (cur!=null){
            if (cur.info>max)
                max=cur.info;
            cur=cur.next;
        }
        return max;
    }
    //Return the minimum value within the list
    public int getMinValue(){
        int min=head.info;
        Node cur=head;
        while (cur!=null){
            if (cur.info<min)
                min=cur.info;
            cur=cur.next;
        }
        return min;
    }
    
    public void editAtPos(int newValue, int pos){
        int n = countNodes();
        if (pos<0 || pos>=n) return;
        int i=0;
        Node cur=head;
        while (i!=pos){
            i++;
            cur=cur.next;
        }
        cur.info=newValue;
    }
    
    //Remove the element at the begining of the list
    public void removeFirst(){
        if (isEmpty()) return;
        if (head.next==null) {
            head=tail=null; return;
        }
        head=head.next;
    }

    //Remove the element at the last of the list
    public void removeLast(){
        if (isEmpty()) return;
        if (head.next==null) {
            head=tail=null; return;
        }
        Node cur=head;
        while (cur.next!=tail){
            cur=cur.next;
        }
        cur.next=null;
        tail=cur;
    }    

    
    
    public void display(){
        Node cur = head;
        while (cur!=null){
            System.out.print(cur.info+" ");
            cur=cur.next;
        }
        System.out.println("");
    }
    
}
