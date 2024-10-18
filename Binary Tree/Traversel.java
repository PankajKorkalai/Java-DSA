import java.util.*;
class Node {
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}

// There are 6 methods to traversel

// 1.PreOrder
// 2.InOrder
// 3.PostOrder
// 4.Reverse PreOrder
// 5.Reverse InOrder
// 6.Reverse PostOrder


// reverse means interchange the position of left and right
// means pahale right aayega aur baad me left




public class Traversel {

    public static class Pair{
        Node node;
        int level;
        Pair(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }

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

        System.out.print("PreOrder : ");
        preorder(a);
        System.out.println();
        System.out.print("InOrder : ");
        inorder(a);
        System.out.println();
        System.out.print("PostOrder : ");
        postorder(a);
        System.out.println();
        System.out.print("Level Order Traversal (using only Queue) : ");
        levelOrderTraversal1(a);
        System.out.println();
        System.out.print("Level Order Traversal (using only queue and pair class) : ");
        System.out.println();
        levelOrderTraversal2(a);

    }
    public static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);

    }
    public static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");

    }
    public static void levelOrderTraversal1(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root != null) q.add(root);
        while(q.size() > 0){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left != null) q.add(front.left);
            if(front.right != null) q.add(front.right);
        }
    }
    public static void levelOrderTraversal2(Node root){
        int prevlevel = 0;
        Queue<Pair> q = new LinkedList<>();
        if(root != null)  q.add(new Pair(root,0));
        while(q.size() > 0){
            Pair front = q.remove();
            Node temp = front.node;
            int lvl = front.level;
            if(lvl != prevlevel){
                System.out.println();
                prevlevel++;
            }
            System.out.print(temp.val+" ");
            if(temp.left != null) q.add(new Pair(temp.left, lvl+1));
            if(temp.right != null) q.add(new Pair(temp.right, lvl+1));
        }
    }


    
    
}
