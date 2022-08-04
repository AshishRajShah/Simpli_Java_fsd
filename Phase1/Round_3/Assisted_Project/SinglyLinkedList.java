package Assisted_Project;

public class SinglyLinkedList {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;

    // addFirst....
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    //addLast....
    public void addLast(String data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;

    }

    //deleteFirst....
    public void deleteFirst() {

        if (head == null) {
            System.out.println("No elements found...");
            return;
        }
        head = head.next;

    }
   
    //deleteLast....
    public void deleteLast() {

        if (head == null) {
            System.out.println("No elements found...");
            return;
        }

        if(head.next == null)
        {
            head = null;
        }

        Node prevNode = head;
        Node nextNode = head.next;

        while(nextNode.next!= null)
        {
            prevNode = prevNode.next;
            nextNode = nextNode.next;
        }

        prevNode.next = null;

    }

    //deletefromKey....
    public void deletefromKey(String key)
    {
        Node CurrentNode = head;
        if(CurrentNode == null)
        {
            System.out.println("key not found..");
        }
        if(CurrentNode != null && CurrentNode.data == key)
        {
            
        }
        
        
    }

    //display...
    public void display() {

        if (head == null) {
            System.out.println("List is empty....");

        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }

        // System.out.println("Null");
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addFirst("8");
        sll.addFirst("3");
        sll.addFirst("6");
        sll.addLast("9");
        sll.deleteFirst();
        sll.deleteLast();
        

        sll.display();

    }

}
