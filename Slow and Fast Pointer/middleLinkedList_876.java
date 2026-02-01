// package Slow and Fast Pointer;

public class middleLinkedList_876 {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public static Node middleNode(Node head){
        if(head == null){
            return null;
        }

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
    public static void main(String[] args) {
        addFirst(10);
        addFirst(20);
        addFirst(30);
        addFirst(40);
        addFirst(50);

        System.out.println(middleNode(head).data);
    }
}
