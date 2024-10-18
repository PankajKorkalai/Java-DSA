public class printNthLevel {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;


        printnthlevel(a, 0, 2);
    }
    public static void printnthlevel(Node root, int count, int level){
        if(root == null) return;
        if(level == count){
            System.out.print(root.val+" ");
        }
        printnthlevel(root.left, count+1, level);
        printnthlevel(root.right, count+ 1, level);

    }
}
