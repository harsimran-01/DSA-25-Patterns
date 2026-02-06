public class reorderList_143 {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }
    public static Node middle(Node head){
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
    public static void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void reOrder(Node head){
        //finding middle
        Node midNode = middle(head);

        //reversing the second half

        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        //merging the second half to the first half

        while(right.next != null){
            Node leftNext = left.next;
            Node rightNext = right.next;

            left.next = right;
            right.next = leftNext;

            left = leftNext;
            right = rightNext;
        }
    }
    public static void main(String args[]){
        addFirst(10);
        addFirst(20);
        addFirst(30);
        addFirst(40);

        printLL(head);

        System.out.println("reOrdering the List");
        reOrder(head);
        printLL(head);

    }
}
