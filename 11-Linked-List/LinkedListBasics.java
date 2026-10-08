class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedListBasics {

    public static void printList(Node head){
        Node current = head;

        while (current != null){
            System.out.print(current.data + "-->");
            current = current.next;
        } 

        System.out.println("null");
      

    }

    public static Node insertAtBegning(Node head, int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static Node insertAtEnd(Node head, int data){
        Node newNode = new Node(data);
        if(head == null){
            return newNode;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
           
        }
        current.next = newNode;
        return head;
    }

    public static boolean search(Node head, int target){
        Node current = head;

        while(current != null){

            if(current.data == target){
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public static Node deleteFirst(Node head){
        if(head == null){
            return null;
        }
        return head.next;
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
        System.out.println("1: Original List");
        printList(head);

        head = insertAtBegning(head, 5);
        System.out.println("2: After insert at begining");
        printList(head);

        head = insertAtEnd(head, 50);
        System.out.println("3: after insert at the end");
        printList(head);

        System.out.print("4: search element: " + search(head, 30) + " ");
        System.out.println("5: search element: " + search(head, 30) + " ");

        head = deleteFirst(head);
        System.out.println("6: After deleting first node");
        printList(head);
       
        

    }
    
}
