package shekhar.st2;

// You are a software engineer working on a plagiarism detection system for an educational platform. The system needs to compare code submissions from multiple students for similarity. Your task is to implement a Java program that takes two code submissions as input and calculates the length of the longest common subsequence (LCS) between them.

// Write a Java program named Main that implements the lcs method to find the length of the LCS between two code submissions. The program should prompt the user to input two code submissions (strings representing the code). Then, it should output the length of the LCS between the two submissions.

// Ensure your program handles the following:
// It should take two code submissions as input.
// The input code submissions can contain any characters.
// The program should calculate the length of the LCS using dynamic programming.
// Output the length of the LCS between the two code submissions.

// Input Explanation:
// The input consists of two lines, each containing a code submission represented as a string.

// Output Explanation:
// The output consists of a single integer representing the length of the longest common subsequence (LCS) between the two code submissions.

// Code Constraints:
// The length of each code submission string is at most 1000 characters.
// The characters in the code submissions can be alphanumeric, punctuation, whitespace, or any other printable ASCII characters.

// Sample Testcase 1
// Input:
// abcdef
// acbcf
// Output:
// 4

// Sample Testcase 2: 
// Input:
// ABC
// DEF
// Output: 
// 0

// Hidden Test case 1 - (Easy) Weightage 10%
// Input:
// ABCDGH
// AEDFHR
// Output:
// 3

// Hidden Test case 2 - (Easy) Weightage 10%
// Input:
// AGGTAB
// GXTXAYB
// Output:
// 4

// Hidden Test case 3 - (Medium) Weightage 15%
// Input:
// 12345
// 54321
// Output:
// 1

// Hidden Test case 4 - (Medium) Weightage 15%
// Input:
// abcdef
// ghijkl
// Output:
// 0

// Hidden Test case 5 - (Hard) Weightage 25%
// Input:
// abcde
// abcde
// Output:
// 5

// Hidden Test case 6 - (Hard) Weightage 25%
// Input:
// (){}[]
// []{}()
// Output:
// 2

// #Solution:



public class lcs {
    public static int lcsDP(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int dp[][] = new int[m+1][n+1];

        // Loop through the substrings in reverse order
        for (int i = m-1; i >= 0; i--) {
            for (int j = n-1; j >= 0; j--) {
                int ans;
                // If characters at current positions match
                if (str1.charAt(i) == str2.charAt(j)) {
                    // Increment LCS length and consider next characters
                    ans = 1 + dp[i+1][j+1];
                } else {
                    // If characters don't match, choose the maximum LCS
                    int ans1 = dp[i][j+1];    // Ignore current character in str1
                    int ans2 = dp[i+1][j];    // Ignore current character in str2
                    ans = Math.max(ans1, ans2);
                }
                // Store the result in dp array
                dp[i][j] = ans;
            }
        }
        // Length of LCS for the entire strings is stored in dp[0][0]
        return dp[0][0];
    }

    public static void main(String[] args) {
        String str1 = "(){}[]";
        String str2 = "[]{}()";

        System.out.println("Length of LCS: " + lcsDP(str1, str2));
    }
}


