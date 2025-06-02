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
public class inputLink
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
    
	public static void main(String[] args) {
		Node head = takeInput();
        
		print(head);
        
        
	}
}