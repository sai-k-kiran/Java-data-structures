// Reverse a stack using recursion

import java.util.Stack;

public class Stack11 {
    static Stack<Character> st = new Stack<Character>();

    static public void insert(char d) {
        if (st.isEmpty()) {
            st.push(d);
        } else {
            char a = st.peek();
            st.pop();
            insert(d);
            st.push(a);
        }
    }

    static public void reverse() {
        if (st.size() > 0) {
            char x = st.peek();
            st.pop();
            reverse();
            insert(x);
        }
    }

    public static void main(String[] args) {

        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');

        System.out.println("Original Stack");

        System.out.println(st);

        reverse();

        System.out.println("Reversed Stack");

        System.out.println(st);
    }
}

/*
 * We could have just used two stacks and by popping from one and pushing into
 * another,
 * we could have done stack reversal. But the extra stack costs memory
 */