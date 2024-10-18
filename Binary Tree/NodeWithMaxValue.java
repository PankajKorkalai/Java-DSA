public class NodeWithMaxValue {
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

        System.out.println(max(a));
    }
    public static int max(Node root) {
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left), max(root.right)));
        
    }
}
