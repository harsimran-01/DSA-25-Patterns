public class dltNthNode_19 {
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
    public static Node dltNode(Node head,int n){
        if(head == null){
            return null;
        }

        int size = 0;
        Node curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }

        if(n==size){
            return head.next;
        }

        int nodeToDlt = size-n; //size-n+1 (from prev)
        Node prev = head;
        int i = 1;
        while(i<nodeToDlt){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return head;

    }
    public static void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        addFirst(10);
        addFirst(20);
        addFirst(30);
        addFirst(40);
        addFirst(45);
        printLL(head);

        System.out.println(dltNode(head, 2).data);
        printLL(head);

    }
}
