package DynamicProgramming;

import java.util.Scanner;

public class MaxFrequency {
    static char maxFrequencyChar(String s) {
        int[] frequency = new int[26]; // Assuming only lowercase alphabets

        // Count the frequency of each character in the string
        for (char c : s.toCharArray()) {
            frequency[c - 'a']++;
        }

        char maxChar = s.charAt(0);
        int maxCount = frequency[maxChar - 'a'];

        // Find the character with maximum frequency
        for (int i = 1; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (frequency[currentChar - 'a'] > maxCount) {
                maxChar = currentChar;
                maxCount = frequency[currentChar - 'a'];
            }
        }

        return maxChar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        char result = maxFrequencyChar(input);

        System.out.println(result);

        scanner.close();
    }
}
