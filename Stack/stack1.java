// Copy stack into another in same order

import java.util.*;

public class stack1 {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
    
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);

        System.out.println("St1 stack :");
        System.out.println(st1);

        
        while (!st1.isEmpty()) {
            temp.push(st1.pop());
        }

        System.out.println("temp stack :");
        System.out.println(temp);

        while (!temp.isEmpty()) {
            st2.push(temp.pop());
        }

        System.out.println("st2 stack :");
        System.out.println(st2);

    }
}
