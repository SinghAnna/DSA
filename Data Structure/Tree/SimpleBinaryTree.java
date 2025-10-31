class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }


}

class BinaryTree{
    Node root;

    public BinaryTree(){
        root = null;
    }

    // Traversal methods
    public void inorder(Node node){

        if (node == null) return;
           
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
       
    }

    public void preorder(Node node){
        if (node == null) return;

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);

     }

     public void postorder(Node node){
        if (node == null) return;

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
     }

}

public class SimpleBinaryTree {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        

        // manually creating tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder traversal:");
        tree.inorder(tree.root);

        System.out.println("\nPreorder traversal:");
        tree.preorder(tree.root);

        System.out.println("\nPostorder traversal:");
        tree.postorder(tree.root);
    }
}