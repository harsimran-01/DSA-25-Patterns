// package Slow and Fast Pointer;

public class linkedListCycle141 {
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
    public static boolean cycleDetect(Node head){
        if(head == null){
            return false;
        }

        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        linkedListCycle141 ll = new linkedListCycle141();
        addFirst(10);
        addFirst(20);
        addFirst(30);

        //cycle 
        // head.next.next.next = head.next;
        System.out.println(cycleDetect(head));
    }
}
