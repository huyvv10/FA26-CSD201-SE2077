public class SinglyLinkedListObj {
    private Node head, tail;

    public SinglyLinkedListObj() {
        head=tail=null;
    }   
    
    public boolean isEmpty(){
        return head==null;
    }
    
    //If the first character of product name equal to "x"
    //or the color = 4 then do nothing.
    public void addFirst(Product x){
        if (x.getName().charAt(0)=='x' ||
                x.getName().charAt(0)=='X' || 
                x.getColor()==4) return;
        Node newNode = new Node(x);
        if (isEmpty()){
            head=tail=newNode;
        } else {
            newNode.next=head;
            head=newNode;
        }
    }
    
    //Do nothing if the product name contains a character 'w' or 'W'
    //or price < 10
    public void addLast(Product x){
        if (x.getName().contains("w") || 
            x.getName().contains("W") ||
            x.getPrice()<10) return;
        Node newNode = new Node(x);
        if (isEmpty()){
            head=tail=newNode;
        } else {
            tail.next=newNode;
            tail=newNode;
        }        
    }
    
    
    public void display(){
        Node cur=head;
        while (cur!=null){
            System.out.print(cur.info.toString());
            cur=cur.next;
        }
        System.out.println("");
    }
}
