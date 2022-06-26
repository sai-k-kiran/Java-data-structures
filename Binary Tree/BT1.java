// Basic binary tree

class Node {
    int key;
    Node left, right;

    public Node(int item){
        key = item;
        left = right = null;
    }
}

class BinaryTree{
    Node root;

    BinaryTree(){
        root = null;
    }

    BinaryTree(int key){
        root = new Node(key);
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.root = new Node(1);
        //         1
        //       /   \
        //     null  null 

        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
            //               1
            //            /     \
            //          2        3
            //        /   \     /  \
            //      null null null null


        bt.root.left.left = new Node(4);
            //                 1
            //               /   \
            //            2        3
            //          /   \     /  \
            //         4   null null null
            //       /   \
            //     null   null
    }
}


