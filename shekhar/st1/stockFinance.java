
// Q.6. Stock Investment Analysis for Finance Company.
// You're developing a data analysis tool for a finance company. Your task is to create a program that calculates the total value of stock investments within specific time intervals based on user input.

// Your program takes input data representing the stock prices over time and a set of intervals during which the total value of investments needs to be calculated. Each interval consists of two values representing the start and end indices of the time period for which the total value should be calculated.

// The goal is to analyze the stock prices within each interval and calculate the total investment value for each interval based on the given stock prices.

// Input Explanation:
// The input consists of several lines.
// The first line contains an integer n, representing the number of elements in the array of stock prices.
// The second line contains n space-separated integers, representing the stock prices over time.
// The third line contains an integer m, representing the number of intervals.
// The next m lines each contain two space-separated integers, representing the start and end indices of the time period for each interval.

// Output Explanation:
// The output line contains m space-separated integers, representing the total investment value for each interval.

// Sample Input 1: 
// 6
// 1 2 3 4 5 6
// 4
// 1 6
// 2 4
// 4 5
// 1 5
// Sample Output 1:
// 21 9 9 15

// Sample Input 2: 
// 5
// 10 20 30 40 50
// 2
// 1 3
// 2 5
// Sample Output 2: 
// 60 140

package shekhar.st1;


import java.util.Scanner;

public class stockFinance {
    public static int calculateSum(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i - 1];
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
        int m = scanner.nextInt();
        int[][] arr1 = new int[m][2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 2; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            int sum = calculateSum(arr, arr1[i][0], arr1[i][1]);
            System.out.print(sum + " ");
        }
    }
}
