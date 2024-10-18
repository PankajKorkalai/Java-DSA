class Node {
    int val;
    Node left;
    Node right;
 
    Node(int var1) {
       this.val = var1;
    }
 }
 
public class SizeOfBinaryTree {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;

        // System.out.println(a.left.val);
        System.out.println(sizeOfBinaryTree(a));

    }
    public static int sizeOfBinaryTree(Node root){
        if(root == null) return 0;
        int count = 1 + sizeOfBinaryTree(root.left) + sizeOfBinaryTree(root.right);

        return count;
    }
}
