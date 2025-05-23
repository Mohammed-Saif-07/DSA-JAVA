// Given a queue of integers and an integer k,
//write a program to reverse the order of first k elements of the queue, leaving the other elements in the same relative order. 

// Sample Input 1:
// 5
// 1 2 3 4 5
// 3
// Sample Output 1:
// 3 2 1 4 5

// Sample Input 2:
// 5
// 1 2 3 5 8
// 2
// Sample Output 2:
// 2 1 3 5 8

import java.util.*;

public class midReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } 
        int k = sc.nextInt();
        for(int i = k - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        for(int i = k; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}