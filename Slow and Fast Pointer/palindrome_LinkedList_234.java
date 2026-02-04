public class palindrome_LinkedList_234 {
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
            head = tail= newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static Node midNode(Node head){
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

    public static boolean isPalindrome(Node head){
        if(head == null || head.next == null){
            return true;
        }

        //midNode
        Node mid = midNode(head);

        //reverse

        Node prev = null;
        Node curr = mid;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;

        //checking value
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        addFirst(10);
        addFirst(20);
        addFirst(30);
        addFirst(30);
        addFirst(220);
        addFirst(20);
        addFirst(10);
        addFirst(10);
        addFirst(110);

        System.out.println(isPalindrome(head));
    }
}
