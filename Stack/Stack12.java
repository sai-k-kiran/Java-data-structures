// Sort a stack using recursion

import java.util.Stack;

public class Stack12 {
    static Stack<Integer> st = new Stack<Integer>();

    public static void sortStack() {
        if (st.size() > 0) {
            int temp = st.peek();
            st.pop();
            sortStack();
            sortInsert(temp);
        }
    }

    public static void sortInsert(int x) {
        if (st.isEmpty() || x > st.peek()) { // NOTE
            st.push(x);
        } else {
            int temp = st.peek();
            st.pop();
            sortInsert(x);
            st.push(temp);
        }
    }

    public static void main(String[] args) {
        st.push(12);
        st.push(2);
        st.push(9);
        st.push(1);

        System.out.println("Before sorting: " + st);

        sortStack();

        System.out.println("After sorting: " + st);

    }
}

// NOTE - this equation gives asc order sorting.
// For desc order, change the arrow