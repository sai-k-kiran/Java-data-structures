// Java code to delete middle of a stack without using additional data structure.

import java.util.Stack;

public class Stack15 {
    static void deleteMid(Stack<Integer> s, int len, int curr) {
        if (s.empty() || curr == len) {
            return;
        }
        int x = s.pop();

        deleteMid(s, len, curr + 1);

        if (curr != len / 2) {
            s.push(x);
        }
    }

    public static void main(String args[]) {
        Stack<Integer> st = new Stack<Integer>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);

        deleteMid(st, st.size(), 0);

        while (!st.empty()) {
            int p = st.pop();
            System.out.print(p + " ");
        }
    }
}
