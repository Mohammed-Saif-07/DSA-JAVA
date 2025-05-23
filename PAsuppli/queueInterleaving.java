// Given a queue of integers of even length, write a program to rearrange the elements by interleaving the first half of the queue with the second half. If length is uneven, return the same queue as given

// Sample Input 1:
// 4
// 1 2 3 4
// Sample Output 1:
// 1 3 2 4

// Sample Input 2:
// 5
// 1 2 3 4 5
// Sample Output 2:
// 1 2 3 4 5

import java.util.*;
public class queueInterleaving
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i] = sc.nextInt();
		}
		int res[] = new int[n];
		if(n%2!=0)
		{
		    for(int i=0;i<n;i++)
		    {
		        System.out.print(arr[i]+" ");
		    }
		}
		else
		{
		    int half = n/2;
		    for(int i=0;i<half;i++)
		    {
		        res[2*i]=arr[i];
		        res[2*i+1]=arr[i+half];
		    }
		    
		   for(int i=0;i<n;i++)
		   {
		       System.out.print(res[i]+" ");
		   }
		}
	}
}