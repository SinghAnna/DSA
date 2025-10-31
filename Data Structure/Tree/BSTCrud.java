class BST {
    class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    Node root;

    void insert(int val) {
        root = insertRec(root, val);
    }

    Node insertRec(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.data) root.left = insertRec(root.left, val);
        else if (val > root.data) root.right = insertRec(root.right, val);
        return root;
    }

    boolean search(int val) {
        Node curr = root;
        while (curr != null) {
            if (val == curr.data) return true;
            curr = (val < curr.data) ? curr.left : curr.right;
        }
        return false;
    }

    Node delete(Node root, int val) {
        if (root == null) return null;
        if (val < root.data) root.left = delete(root.left, val);
        else if (val > root.data) root.right = delete(root.right, val);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    int minValue(Node node) {
        int min = node.data;
        while (node.left != null) {
            min = node.left.data;
            node = node.left;
        }
        return min;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
}

public class BSTCrud {
    public static void main(String[] args) {
        BST tree = new BST();
        int[] values = {50, 30, 70, 20, 40, 60, 80};
        for (int v : values) tree.insert(v);

        System.out.print("Inorder: ");
        tree.inorder(tree.root);

        System.out.println("\nSearch 40: " + tree.search(40));
        tree.root = tree.delete(tree.root, 70);
        System.out.print("After deleting 70: ");
        tree.inorder(tree.root);
    }
}
