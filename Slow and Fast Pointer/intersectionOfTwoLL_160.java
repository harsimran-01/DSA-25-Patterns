

public class intersectionOfTwoLL_160 {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node intersection(Node headA,Node headB){
        if(headA == null || headB == null){
            return null;
        }
        Node pointerA = headA;
        Node pointerB = headB;

        while(pointerA != pointerB){

            pointerA = (pointerA == null) ? headB :pointerA.next;
            pointerB = (pointerB == null) ? headA :pointerB.next;
        }

        return pointerA;

    }
}
