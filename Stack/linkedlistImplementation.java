import java.util.Stack;


public class linkedlistImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class LLStack{
        Node head = null;
        int size = 0;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }


        void displayrec(Node h){
            if(h == null) return;
            displayrec(h.next);
            System.out.print(h.val+ " ");
        }
        void display(){
            displayrec(head);
            System.out.println();
        }

        void displayRev(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+ " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int size(){
            return size;
        }

        int pop(){
            if(head == null){
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = head.val;
            head = head.next;
            return top;
        }

        int peek(){
            if(head == null){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.val;
        }
        boolean isEmpty(){
            if(head == null){
                return true;
            }
            else return false;
        }


    }



    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.display(); // 1 2 3
        System.out.println(st.size());  // 3
        st.pop();
        st.display();  // 1 2
        System.out.println(st.isEmpty()); // false
        st.pop();
        st.pop();
        st.display(); 
    }
}
