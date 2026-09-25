
public class Main {

    public static String dec2bin(int n){
        MyStack st= new MyStack();
        int du;
        while (n!=0){
            du = n%2;
            st.push(du);
            n/=2;   //n = n/2
        }
        String S="";
        while (!st.isEmpty()){
            S+=st.top();    //read data at top
            st.pop();       //remove data at top
        }
        return S;
    }
    
    public static String reverseString(String str){
        MyStack st = new MyStack();
        str=str.trim();
        for (int i = 0; i < str.length(); i++) {
            st.push(str.charAt(i));
        }
        String S="";
        while (!st.isEmpty()){
            S+=st.top();
            st.pop();
        }
        return S;
    }
            
    public static void main(String[] args) {
        MyStack myStk = new MyStack();
        myStk.push(5);
        myStk.push(7);
        myStk.push(2);
        myStk.push(9);
        myStk.push(4);
        myStk.display();
        System.out.println("The element at top: "+myStk.top());
        myStk.pop();
        System.out.println("The element at top: "+myStk.top());
        myStk.pop();
        myStk.pop();
        myStk.pop();
        myStk.pop();
        myStk.pop();
        System.out.println("The element at top: "+myStk.top());
        System.out.println(dec2bin(28));
        System.out.println(reverseString("FPTU"));
    }
}
