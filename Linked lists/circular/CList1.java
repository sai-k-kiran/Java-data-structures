// Traverse a circular linked list

class CList1 {
    class Node { // 1
        int data;
        Node next;
    };

    static Node push(Node head_ref, int data) {
        CList1 sai = new CList1(); // 2
        CList1.Node ptr1 = sai.new Node(); // 3
        Node temp = head_ref;
        ptr1.data = data; // We didn't create constructor for Node so this line is imp
        ptr1.next = head_ref; // Inserting node at the front of LL

        if (head_ref != null) {
            while (temp.next != head_ref)
                temp = temp.next; // here temp will point to the last node
            temp.next = ptr1; // last node -> new node
        } else
            ptr1.next = ptr1;

        head_ref = ptr1; // make new node as head after inserting
        return head_ref;
    }

    static void printList(Node head) {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.data + " -> "); // 11 -> 2 -> 56 -> 12 ->
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println(head.data); // 11
    }

    public static void main(String args[]) {
        Node head = null;

        head = push(head, 12);
        head = push(head, 56);
        head = push(head, 2);
        head = push(head, 11);

        printList(head);
    }
}

// 1 - Node is an cinner class of CList1 outer class. Node isn't static.

// 2 - To create an object of inner class which isn't static, we need to first
// create an
// object of the outer class.

// In push() method, we first created outer class object CList1 sai = new
// CList1()

// 3 - The outer class object(or instance) is used to create the inner class
// instance.
// Syntax -> Outerclass.Innerclass = outer_instance_name.new Innerclass()
// Outerclass = Clist1, Innerclass = Node, outer_instance_name = sai
// So CLis1.Node = sai.new Node(no parameter)

// If Node class was static then, we don't have to use the outer class to create
// inner
// class instance.
// Line 2 will be removed and line 3 will become Node ptr1 = new Node()

// NOTE -> You may be wondering why we are taking Node class as static in
// circular LL
// While we didn't took Node class as static in any example singly LL.
// That's because we didn't create any instance of Node class in singly LL
// examples
// but we are creating Node class instance in circular LL examples static Node
// push(Node...)