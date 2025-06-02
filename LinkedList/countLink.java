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
public class countLink
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
            //   Node tail = head;
            //   while(tail.next!=null)
            //   {
            //       tail = tail.next;
            //   }
            //   tail.next = currNode;
            tail.next = currNode;
            tail = currNode; // tail = tail.next;
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
            // System.out.print(temp.data+1+" ");
            temp.data++;
            temp=temp.next;

        }
        // head.data++;

    }
    public static int check(Node head){
        Node temp = head;
        int count = 0;
        while(temp!=null)
       
        {
            // System.out.print(temp.data+1+" ");
           
            count++;
            temp=temp.next;

        }
        // head.data++;
        return count;
    }
	public static void main(String[] args) {
		Node head = takeInput();
        increment(head);
        // System.out.println();
		print(head);
        System.out.println();
        System.out.println(check(head));
	}
}