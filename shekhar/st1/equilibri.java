// Q.7. Identifying Equilibrium Index in Financial Investment Portfolio.
// Imagine you are developing a program for a financial analysis tool that helps investors identify equilibrium points in their investment portfolio. An equilibrium point is a position in the portfolio where the sum of investments to the left of the point equals the sum of investments to the right, thus maintaining a balance in the portfolio.

// Your program takes input data representing the values of investments in various financial instruments over time. The task is to determine the index of the equilibrium point in the portfolio array, if any, where the sum of investments to the left equals the sum of investments to the right.

// For example, given an array representing the values of investments [ -7, 1, 5, 2, -4, 3, 0 ], the equilibrium index is 3, as the sum of investments to the left of index 3 (i.e., -7 + 1 + 5) equals the sum of investments to the right of index 3 (i.e., -4 + 3 + 0).

// Input Explanation:
// The input consists of two lines.
// The first line contains an integer n, representing the number of elements in the investment portfolio array.
// The second line contains n space-separated integers, representing the values of investments in the portfolio array.

// Output Explanation:
// The output consists of a single integer.
// If there exists an equilibrium index in the portfolio array, the output should be the index value (0-based indexing).
// If there is no equilibrium index in the portfolio array, the output should be -1.


// Sample Input 1: 
// 7
// -7 1 5 2 -4 3 0
// Sample Output 1:
// 3


package shekhar.st1;

import java.util.Scanner;

public class equilibri {
    public static int findIndex(int arr[]){
        int n =arr.length;
        int totalSum = 0;
        int leftSum = 0;
        for(int i = 0;i<n;i++){
            totalSum+=arr[i];
        }
        for(int i = 0;i<n;i++){
            totalSum -= arr[i];
            if(leftSum == totalSum){
                return i;
            } 
            leftSum += arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int index = findIndex(arr);
       if(index != -1){
        System.out.println(index);
       }else{
        System.out.println(-1);
       }
    }
}