package LINKEDLIST;

public class palindrome {
    // Node
    static  class  Node {
        int data;
        Node next;

        public  Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static palindrome.Node head;
    public static palindrome.Node tail;


    // add at first position
    public void addFirst(int data) {
        Node l1 = new Node(data);
        if (head == null) {
            head = l1;
            return;
        }
        l1.next = head;
        head = l1;
    }


    //detect a loop in Linked List
    public static boolean detectLoop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
            return false;
        }

        //print
        public void print(Node head){
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }

    public static void main(String[] args) {
        palindrome ll=new palindrome();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        System.out.println(ll.detectLoop());
    }
    }