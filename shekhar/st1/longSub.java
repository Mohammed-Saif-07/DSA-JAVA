// Q.3. Identifying Longest Substring without Repeating Characters for Language Learning Platform
// Imagine you're developing a text processing tool for a language learning platform. Your task is to create a program that analyzes input text to find the longest substring without repeating characters, helping language learners identify continuous sequences of unique characters within sentences.

// Input Explanation:
// The input consists of a single line containing a string of characters.

// Output Explanation:
// The output consists of a single integer representing the length of the longest substring without repeating characters in the input string.

// Sample Input 1: 
// ABCDEFABCIHJKLABCD
// Sample Output 1:
// 11

// Sample Input 2: 
// 1234567890
// Sample Output 2: 
// 10


// #Solution:

package shekhar.st1;
import java.util.Arrays;
import java.util.Scanner; // do wiht your code {placement->longestSub}
public class longSub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        longestString(str);
    }

    static void longestString(String str) {
        int n = str.length(), res = 0;

        int[] arr = new int[256];
        Arrays.fill(arr, -1);

        int i = 0;
        for (int j = 0; j < n; j++) {
            i = Math.max(i, arr[str.charAt(j)] + 1);
            res = Math.max(res, j - i + 1);
            arr[str.charAt(j)] = j;
        }
        System.out.println(res);
    }
}