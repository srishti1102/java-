package BINARYTREE;
import java.util.*;
public class buildBinaryTreeo {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int index=-1;
        public static Node BuiltTree(int nodes[]){
            index++;
            if(nodes[index]==-1){
                return  null;
            }
            Node newNode=new Node(nodes[index]);
            newNode.left=BuiltTree(nodes);
            newNode.right=BuiltTree(nodes);
            return newNode;
        }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.BuiltTree(nodes);
        System.out.println(root.data);
    }
}
