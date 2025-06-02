package shekhar.st2;

// You are working at a manufacturing company that produces steel rods of various lengths. Each steel rod can be cut into smaller pieces to maximize profit. The company has provided you with a list of prices for different rod lengths. Your task is to develop a program to determine the maximum obtainable value by cutting the rods into smaller pieces and selling them at the given prices.

// Input Explanation:
// The input consists of two lines.
// The first line contains an integer n, representing the number of different rod lengths.
// The second line contains n space-separated integers, representing the prices of the rods for each corresponding length.

// Output Explanation:
// The output consists of a single integer, representing the maximum obtainable value by cutting the rods into smaller pieces and selling them at the given prices.

// Code Constraints:
// The number of different rod lengths n is a non-negative integer.
// The prices of the rods are non-negative integers.
// The length of the rod prices array is equal to the number of rod lengths n.
// The maximum length of the rod prices array is 103.

// Sample Testcase 1
// Input:
// 8
// 1 5 8 9 10 17 17 20
// Output:
// 22

// Sample Testcase 2: 
// Input:
// 8
// 3 5 8 9 10 17 17 20
// Output: 
// 24

// Hidden Test case 1 - (Easy) Weightage 10%
// Input:
// 4
// 2 5 7 8
// Output:
// 10

// Hidden Test case 2 - (Easy) Weightage 10%
// Input:
// 1
// 10
// Output:
// 10

// Hidden Test case 3 - (Medium) Weightage 15%
// Input:
// 3
// 1 2 3
// Output:
// 3

// Hidden Test case 4 - (Medium) Weightage 15%
// Input:
// 5
// 5 5 5 5 5
// Output:
// 25

// Hidden Test case 5 - (Hard) Weightage 25%
// Input:
// 6
// 1 2 3 4 5 6
// Output:
// 6

// Hidden Test case 6 - (Hard) Weightage 25%
// Input:
// 4
// 4 3 2 1
// Output:
// 16

// #Solution:
import java.util.Scanner;
class steelRods {
    static int cutRod(int price[], int n) {
        int val[] = new int[n + 1];
        val[0] = 0;

        for (int i = 1; i <= n; i++) {
            int max_val = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++)
                max_val = Math.max(max_val,
                        price[j] + val[i - j - 1]);
            val[i] = max_val;
        }
        return val[n];
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(cutRod(arr, size));
        scanner.close();
    }
}
