package BINARYTREE;
import java.util.*;

public class buildBinaryTree {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            node newnode=new node(nodes[idx]);

            newnode.left=buildTree(nodes);
            newnode.right=buildTree(nodes);
            return newnode;
        }
        public static void preOrder(node root){
            if(root==null){
                return;
            }
            System.out.print(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void inOrder(node root){
            if(root==null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data);
            inOrder(root.right);
        }
        public static int height(node root) {
            if (root == null) {
                return 0;
            }
            int lh=height(root.left);
            int rh=height(root.right);
            int res=Math.max(lh,rh)+1;
            return res;
        }
        public static int countNode (node root){
            if(root==null){
                return 0;
            }
            int lc=countNode(root.left);
            int rc=countNode(root.right);
            int res=lc+rc+1;
            return res;
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        node root= tree.buildTree(nodes);
        System.out.println(root.data);
        tree.preOrder(root);
        tree.inOrder(root);
        //  levelOrder(root);
        System.out.println("height of tree");
        System.out.println(tree.height(root));//tree.height(root);
        System.out.println("count of node");
        tree.countNode(root);
    }
}
