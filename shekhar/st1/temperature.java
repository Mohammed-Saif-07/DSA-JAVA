// Q.1. Analyzing Temperature Data for Consecutive Time Intervals.
// Imagine you're designing a program to analyze temperature data collected by sensors placed at different locations over several days. Each day's data is stored as an array where each element represents the temperature reading at a specific time interval. Your goal is to calculate the sum of the minimum and maximum temperatures recorded during consecutive time intervals of width 'w' for each day.

// Input Explanation:
// The first line contains an integer 'n' representing the number of elements in the temperature data array for each day.
// The second line contains 'n' space-separated integers representing the temperature readings for a single day.
// The third line contains an integer 'w' representing the width of consecutive time intervals.

// Output Explanation:
// Print a single integer representing the sum of the minimum and maximum temperatures recorded during consecutive time intervals of width 'w' for each day.

// Sample Input 1: 
// 8
// 25 30 15 20 35 40 10 5
// 3
// Sample Output 1:
// 295

// Sample Input 2: 
// 6
// 10 20 30 40 50 60 // 210 + 
// 2
// Sample Output 2: 
// 350


package shekhar.st1;

import java.util.Scanner;

public class temperature {

    public static int calculateSum(int[] arr, int n, int w) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int len = 0;
            for (int j = i; j < n; j++) {
                len++;
                if (len == w) {
                    int min = Integer.MAX_VALUE;
                    int max = Integer.MIN_VALUE;
                    for (int k = i; k <= j; k++) {
                        if (min > arr[k])
                            min = arr[k];
                        if (max < arr[k])
                            max = arr[k];
                    }
                    sum += min + max;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int w = scanner.nextInt();
        int sum = calculateSum(arr, n, w);
        System.out.println(sum);
    }
}
