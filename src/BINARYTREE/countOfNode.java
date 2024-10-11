package BINARYTREE;

public class countOfNode {
    static class Node {
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int countNode(Node root){
        if(root==null){
            return 0;
        }
        int lh=countNode(root.left);
        int rh=countNode (root.right);
        int res=lh+rh+1;
        return res;
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println("number of nodes in tree");
        System.out.println(countNode(root)); //countNode(root);

    }

}
