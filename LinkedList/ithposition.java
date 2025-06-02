package LinkedList;

import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next=null;
    }
}
public class ithposition
{
    public static Node takeInput()
    {
        Scanner sc = new Scanner(System.in);
        int data =sc.nextInt();
        
        Node head = null, tail = null;
        while(data!=-1)
        {
           Node currNode = new Node(data);
           if(head == null)
           {
               head = currNode;
               tail= currNode;
           }
           else{
               tail.next = currNode;
               tail = currNode;
           }
           data = sc.nextInt();
        }
        return head;
    }
    public static void print(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void increment(Node head){
        Node temp = head;
        while(temp!=null)
        {
            temp.data++;
            temp=temp.next;
        }
    }
    public static int check(Node head){
        Node temp = head;
        int count = 0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static void printIthElement(Node head, int i) {
        Node temp = head;
        int count = 0;
        while (temp != null && count < i) {
            temp = temp.next;
            count++;
        }
        if (temp != null) {
            System.out.println("Element at index " + i + ": " + temp.data);
        } else {
            System.out.println("Index out of bounds");
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node head = takeInput();
        increment(head);
        print(head);
        System.out.println();
        System.out.println("Count: " + check(head));
        System.out.println("Enter the index to print the element:");
        int index = sc.nextInt();
        printIthElement(head, index);
	}
}
