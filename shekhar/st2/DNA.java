package shekhar.st2;

// You are developing a program to help analyze DNA sequences. Each DNA sequence consists of a string composed of characters 'A' to 'Z'. Your task is to find the length of the shortest supersequence for two given DNA sequences.

// Input Explanation:
// The input consists of two lines, each containing a DNA sequence represented as a string.
// Each DNA sequence consists of characters 'A' to 'Z'.

// Output Explanation:
// The output consists of a single integer, representing the length of the shortest supersequence for the given DNA sequences.

// Code Constraints:
// The length of each DNA sequence is at most 103.
// The DNA sequences contain only characters 'A' to 'Z'.
// The time complexity of the solution should be efficient enough to handle sequences of length up to 103 within a reasonable time frame.

// Sample Testcase 1
// Input:
// AGGTAB
// GXTXAYB
// Output:
// 9

// Sample Testcase 2: 
// Input:
// ABC
// AC
// Output: 
// 3

// Hidden Test case 1 - (Easy) Weightage 10%
// Input:
// AB
// CD
// Output:
// 4

// Hidden Test case 2 - (Easy) Weightage 10%
// Input:
// X
// Y
// Output:
// 2

// Hidden Test case 3 - (Medium) Weightage 15%
// Input:
// ABCDEF
// ABCDEF
// Output:
// 6

// Hidden Test case 4 - (Medium) Weightage 15%
// Input:
// AAA
// BBB
// Output:
// 6

// Hidden Test case 5 - (Hard) Weightage 25%
// Input:
// AAB
// ABB
// Output:
// 4

// Hidden Test case 6 - (Hard) Weightage 25%
// Input:
// ABC
// CBA
// Output:
// 6

// #Solution:
import java.util.Scanner;
class DNA {
    static int superSeq(String X, String Y, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0)
                    dp[i][j] = j;
                else if (j == 0)
                    dp[i][j] = i;
                else if (X.charAt(i - 1) == Y.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = 1
                            + Math.min(dp[i - 1][j],
                            dp[i][j - 1]);
            }
        }
        return dp[m][n];
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String X = scanner.nextLine();
        String Y = scanner.nextLine();

        System.out.println(superSeq(X, Y, X.length(), Y.length()));
        scanner.close();
    }
}
