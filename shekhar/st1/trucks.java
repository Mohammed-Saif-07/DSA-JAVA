// Q.2. Analyzing Distinct Locations Visited by Delivery Trucks in Time Windows.
// Imagine you are analyzing data collected by a fleet of delivery trucks in a logistics company. Each truck records its location at regular intervals, and you're interested in analyzing the number of distinct locations visited by each truck within a specific time window.
// Write a Java program that takes input data representing the locations visited by a single truck over time. Program should calculate and print the numbers of distinct locations visited by the truck within each time window of a given size.

// Input Explanation:
// The input consists of three lines.
// The first line contains an integer 'n' representing the number of elements in the array 'arr'.
// The second line contains 'n' space-separated integers representing the elements of the array 'arr'.
// The third line contains an integer 'w' representing the window size.

// Output Explanation:
// The output consists of a single line.
// Each integer represents the number of distinct elements within each window of size 'w' while traversing the array 'arr' from left to right.

// Sample Input 1: 
// 7
// 1 2 1 3 4 2 3
// 4
// Sample Output 1:
// 3 4 4 3

// Sample Input 2: 
// 10
// 1 2 3 1 2 3 4 1 2 1
// 3
// Sample Output 2: 
// 3 3 3 3 3 3 3 2


package shekhar.st1;

import java.util.*;
public class trucks{
	static void dist(int arr[], int n, int w){
    	HashMap <Integer, Integer> hm = new HashMap<>();
	
	for (int i=0 ; i<w ; i++)
    		hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
    	System.out.print(hm.size() + " ");

    	for (int i=w; i<n ; i++){
		if (hm.get(arr[i-w])==1)
    			hm.remove(arr[i-w]);
		else
    			hm.put(arr[i-w], hm.get(arr[i-w])-1);

	    	hm.put(arr[i], hm.getOrDefault(arr[i],0)+1);
    		System.out.print(hm.size()+" ");
		}
    }
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int w = scanner.nextInt();
	    dist(arr,n,w);	
    }
}