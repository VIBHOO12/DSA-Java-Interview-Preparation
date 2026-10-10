class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class LinkedListPatterns{

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
        
        
    }

}