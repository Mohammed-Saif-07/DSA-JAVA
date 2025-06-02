// Q.9. Find maximum profitable days range for Stock Trading Analysis.
// You are developing an algorithm for a financial analysis tool that helps
// investors identify the optimal buying and selling points for a given stock to maximize their profit.
// The algorithm aims to find the contiguous subarray within the stock price array where the sum of the subarray
// elements is the highest, indicating the most profitable period for trading.

// Your program takes input data representing the daily stock prices of a company over a period of time.
// Each element of the array represents the stock price on a particular day.
// The task is to determine the starting and ending indices of the subarray with the maximum sum,
// which corresponds to the optimal buying and selling points for the stock.


// Input Explanation:
// The input consists of two lines:
// The first line contains an integer n, representing the number of elements in the array of stock prices.
// The second line contains n space-separated integers, representing the stock prices for each day.

// Output Explanation:
// The output consists of two integers separated by a space:
// The first integer represents the starting index of the subarray with the maximum sum.
// The second integer represents the ending index of the subarray with the maximum sum.

// Sample Input 1: 
// 8
// -2 -3 4 -1 -2 1 5 -3
// Sample Output 1:
// 2 6
// Sample Input 2: 
// 6
// -2 1 -3 4 -1 2
// Sample Output 2: 
// 3 5


package shekhar.st1;

import java.util.*;
public class stockTrading {
    static void maxSubArraySum(int a[]){
		int size = a.length;
		int max = Integer.MIN_VALUE, sum = 0;
		int start=0, end=0, temp=0;
		for (int i = 0; i < size; i++) {
			sum += a[i];
			if (max < sum){
				max = sum;
				start=temp;
				end=i;
			}
			if (sum < 0){
				sum = 0;
				temp=i+1;
			}
		}
		System.out.println(start +" "+ end);
	}
	public static void main(String[] args){
	    Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
		maxSubArraySum(a);
		
	}
}