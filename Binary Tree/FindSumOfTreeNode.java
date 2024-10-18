public class FindSumOfTreeNode {
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

        System.out.println(sum(a));
    }
    public static int sum(Node root){
        if(root == null) return 0;
        // if(root == null) return 1;     for product of binary tree
        return  root.val + sum(root.left) + sum(root.right);
        // return  root.val * sum(root.left) * sum(root.right);
        
    }
}
