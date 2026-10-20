class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class LinkedListPatterns{



      static Node createList(int... values) {
        Node dummy = new Node(0);
        Node tail = dummy;

        for (int value : values) {
            tail.next = new Node(value);
            tail = tail.next;
        }

        return dummy.next;
    }
      public static void printList(Node head){
        Node current = head;

        while (current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        } 

        System.out.println("null");
      

    }

    public static Node reverseList(Node head){
        Node prev = null;
        Node current = head;

        while(current != null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;

    }

    public static Node middleList(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static boolean hasCycle(Node head) {
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

public static Node removeDuplicates(Node head) {
    Node current = head;

    while (current != null && current.next != null) {
        if (current.data == current.next.data) {
            current.next = current.next.next;
        } else {
            current = current.next;
        }
    }

    return head;
}

 public static Node removeElements(Node head, int val) {

        Node dummy = new Node(0);
        dummy.next = head;

        Node current = dummy;

        while (current.next != null) {

            if (current.next.data == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return dummy.next;
    }

 // 5. Remove Nth Node From End
    static Node removeNthFromEnd(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;

        Node slow = dummy;
        Node fast = dummy;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);


        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        Node head = first;
        System.out.print("1: Original List: ");
        printList(head);


        System.out.print("2:Reverse List: ");
        Node reverse = reverseList(head);
        printList(reverse);

        Node list2 = createList(10, 20, 30, 40, 50);
        Node middle = middleList(list2);
        System.out.println("Middle: " + middle.data);

        Node list3 = createList(1, 1, 2, 3, 3);
        removeDuplicates(list3);
        System.out.print("Without duplicates: ");
        printList(list3);

        Node list4 = createList(1, 2, 3, 4, 5);
        Node updated = removeNthFromEnd(list4, 2);
        System.out.print("After removing 2nd from end: ");
        printList(updated);
        
        Node list5 = createList(1, 2, 3);
        list5.next.next.next = list5.next; // Creates a cycle
        System.out.println("Cycle detected: " + hasCycle(list5));


        // Linked list: 1 -> 2 -> 6 -> 3 -> 6
        
        Node head1 = createList(1, 2, 3, 6, 4, 5, 6);
        int val = 6;

        head1 = removeElements(head1, val);

        // Print the updated linked list
        Node temp = head1;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
        
        
    }

   

}