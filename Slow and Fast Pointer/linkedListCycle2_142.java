// package Slow and Fast Pointer;

public class linkedListCycle2_142 {
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

    public static Node startNode(Node head){
        if(head == null){
            return null;
        }

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast){
                //cycle detected
                slow = head;

                while(fast!=slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        addFirst(10);
        addFirst(20);
        addFirst(30);

        head.next.next = head.next;
        System.out.println(startNode(head).data);
    }
}
