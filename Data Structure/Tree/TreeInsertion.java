class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}

class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void insert(int key) {
        Node newNode = new Node(key);

        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent = null;

        while (true) {
            parent = current;

            if (key < current.data) {
                current = current.left;

                if (current == null) {
                    parent.left = newNode;
                    return;
                }

            } else if (key > current.data) {
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    return; // Add return here to avoid infinite loop
                }

            } else {
                throw new IllegalArgumentException("Duplicate keys not allowed: " + key);
            }
        }
    }

}

public class TreeInsertion {
    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        bst.inorder(bst.root);
    }
}
