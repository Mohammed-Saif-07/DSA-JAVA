package shekhar.st2;

// You are a software engineer working on a project that involves analyzing grid-like structures. You are tasked with finding the longest path within a given grid while adhering to specific constraints.
// You are given a square matrix of size n×n, where each cell contains a non-negative integer. Your goal is to find the longest path within this matrix satisfying the following conditions:
// You can only move from one cell to another if the value of the destination cell is exactly one more than the value of the source cell.
// You are allowed to move in any of the four cardinal directions: up, down, left, or right.
// The path should be continuous, meaning there should be no gaps between consecutive cells in the path.
// Your task is to write a Java program that takes the input as the grid structure and returns the length of the longest path satisfying the given constraints.

// Input Explanation:
// The first line of input contains an integer n, representing the size of the square matrix.
// The next n lines contain n space-separated integers each, representing the elements of the matrix.

// Output Explanation:
// Output a single integer, representing the length of the longest path in the matrix with the given constraints.

// Code Constraints:
// 1 ≤ n ≤ 100
// The elements of the matrix are non-negative integers.
// The maximum value of any element in the matrix is 109.

// Sample Testcase 1
// Input:
// 3
// 1 2 9 5 3 8 4 6 7
// Output:
// 4

// Sample Testcase 2: 
// Input:
// 3
// 1 2 3
// 4 5 6
// 7 8 9
// Output: 
// 3

// Hidden Test case 1 - (Easy) Weightage 10%
// Input:
// 4
// 1 3 4 5
// 2 2 2 6
// 8 7 9 7
// 7 8 9 8
// Output:
// 8

// Hidden Test case 2 - (Easy) Weightage 10%
// Input:
// 2
// 1 2
// 2 3
// Output:
// 3

// Hidden Test case 3 - (Medium) Weightage 15%
// Input:
// 5
// 1 2 3 4 5
// 16 17 18 19 6
// 15 24 25 20 7
// 14 23 22 21 8
// 13 12 11 10 9
// Output:
// 25

// Hidden Test case 4 - (Medium) Weightage 15%
// Input:
// 1
// 5
// Output:
// 1

// Hidden Test case 5 - (Hard) Weightage 25%
// Input:
// 3
// 1 2 3
// 6 5 4
// 7 8 9
// Output:
// 9

// Hidden Test case 6 - (Hard) Weightage 25%
// Input:
// 2
// 2 3
// 1 4
// Output:
// 4

// #Solution:
import java.util.Scanner;
class softwareEnginner {
    public static int n;
    static int findLongestFromACell(int i, int j, int mat[][], int dp[][]) {
        if (i < 0 || i >= n || j < 0 || j >= n)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        int x = Integer.MIN_VALUE, y = Integer.MIN_VALUE, z = Integer.MIN_VALUE, w = Integer.MIN_VALUE;

        if (j < n - 1 && ((mat[i][j] + 1) == mat[i][j + 1]))
            x = dp[i][j] = 1 + findLongestFromACell(i, j + 1, mat, dp);

        if (j > 0 && (mat[i][j] + 1 == mat[i][j - 1]))
            y = dp[i][j] = 1 + findLongestFromACell(i, j - 1, mat, dp);

        if (i > 0 && (mat[i][j] + 1 == mat[i - 1][j]))
            z = dp[i][j] = 1 + findLongestFromACell(i - 1, j, mat, dp);

        if (i < n - 1 && (mat[i][j] + 1 == mat[i + 1][j]))
            w = dp[i][j] = 1 + findLongestFromACell(i + 1, j, mat, dp);

        return dp[i][j] = Math.max(x, Math.max(y, Math.max(z, Math.max(w, 1))));
    }

    static int finLongestOverAll(int mat[][]) {
        int result = 1;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                dp[i][j] = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dp[i][j] == -1)
                    findLongestFromACell(i, j, mat, dp);
                result = Math.max(result, dp[i][j]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.println(finLongestOverAll(mat));
        scanner.close();
    }
}
