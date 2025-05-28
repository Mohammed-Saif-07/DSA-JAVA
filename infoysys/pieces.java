package infoysys;

public class pieces {
    public static int maxPieces(String S) {
        // Initialize an array to store the frequency of characters
        int[] frequency = new int[26]; // Assuming only lowercase English letters

        // Count the frequency of each character
        for (char c : S.toCharArray()) {
            frequency[c - 'a']++;
        }

        // Find the maximum frequency
        int maxFrequency = 0;
        for (int i = 0; i < 26; i++) {
            maxFrequency = Math.max(maxFrequency, frequency[i]);
        }

        return maxFrequency;
    }

    public static void main(String[] args) {
        String input = "zzzzz";
        System.out.println("Case#1 Output: " + maxPieces(input)); // Output: 5
    }
}
