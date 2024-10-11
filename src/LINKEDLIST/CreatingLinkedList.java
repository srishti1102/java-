package LINKEDLIST;

public class CreatingLinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;



    //add element
    public void addFirst(int data){
        Node l1=new Node(data);
        if(head==null){
            head=tail=l1;
            return;
        }
        l1.next=head;
        head=l1;
    }



    // add element at last

    public void addLast(int data){
        Node l1=new Node(data);
        if(head==null){
            head=tail=l1;
            return;
        }
        tail.next=l1;
        tail=l1;
    }




    //add element at the middle positon in the linkedList
    public void addMiddle(int data,int index){
        Node l1=new Node(data);
        int idx=0;
        Node temp=head;
        if(head==null){
            head=tail=l1;
            return;
        }
        while(idx<index-1){
            temp=temp.next;
            idx++;
        }
        l1.next=temp.next;
        temp.next=l1;
    }



    // remove element from the first position
    public Node deleteFirst(){
        if(head==null){
            System.out.println("ll is empty");
        }
        Node temp=head.next;
        head=temp;
        return head;
    }



    //size of Linked List
    public int size(){
        Node temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        return size;
    }



    // remove elememnt from the last position
    public int removeLast(int size){
        if(size==0){
            System.out.println("ll is empty");
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }



    //linear search in linked list
    public int search(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }



    // reverce a linked lis
    public Node reverce(){
        Node prev=null;
        Node temp=head;
        Node curr=head;
        while(temp!=null){
            temp=temp.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }



    //delete nth element from end
    public void deleteNthElementFromEnd(int size,int index){
        if(index==size){
            head=head.next;
            return;
        }
        int i=1;
        int indexToFind=size-index;
        Node prev=head;
        while(i<indexToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }



    //find middle
    public Node middle(Node head){
        Node slow=head;
        Node Fast=head;
        while(Fast!=null && Fast.next!=null){
            slow=slow.next;
            Fast=Fast.next.next;
        }
        return slow;
    }




    // check linked list is palindrome or not
    public void palindrome(){


    }


    //print element
    public void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }



    public static void main(String[] args) {
        CreatingLinkedList ll=new CreatingLinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(5,2);
       ll.print(head);
       //Node newNode = ll.deleteFirst();
      // ll.print(newNode);
      // int size=ll.size();
        //System.out.println("size of LinkedList" +ll.size());
        //System.out.println("remove last element of Linked List");
       // ll.removeLast(size);
       // ll.print(newNode);
        //System.out.println("leanear search in linked list");
       // int idx=ll.search(3);
       // System.out.println(idx);
        //Node newHead= ll.reverce();
       // ll.print(newHead);
        ll.deleteNthElementFromEnd(ll.size(),3);
        ll.print(head);
        Node middleNode=ll.middle(head);
    }
}
