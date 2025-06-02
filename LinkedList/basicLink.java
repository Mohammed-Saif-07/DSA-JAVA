package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class basicLink {
    public static Node list() {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        // Print initial nodes to confirm the list creation
        System.out.println(n1.data);
        System.out.println(n2.data);
        System.out.println(n3.data);
        System.out.println(n4.data);
        System.out.println(n5.data);
        
        return n1;
    }

    public static void print(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Node head = list();
        print(head);
    }
}
