package BINARYTREE;

public class heightOfTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data);
        inOrder(root.left);
        inOrder(root.right);
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static void main(String[] args) {
        Node root=new Node (1);
        root.left =new Node (2);
        root.left.left=new Node(4);
        root.left.right=new Node (5);
        root.right=new Node(3);
        root.right.right=new Node(6);
        root.right.left=new Node(7);
        //inOrder(root);
        System.out.println(height(root));
    }
}
