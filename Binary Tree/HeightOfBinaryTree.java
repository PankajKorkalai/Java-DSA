// Height = level - 1;
class Node {
    int val;
    Node left;
    Node right;
 
    Node(int var1) {
       this.val = var1;
    }
 }
 
public class HeightOfBinaryTree {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        System.out.println(level(a));
        System.out.println(height(a));

    }

    public static int level(Node root) {
        if(root == null) return 0;
        int level = 1 + Math.max(level(root.left), level(root.right));
        return level;
    }
    public static int height(Node root) {
        if(root == null) return 0;
        int level = Math.max(level(root.left), level(root.right));
        return level;
    }
}
