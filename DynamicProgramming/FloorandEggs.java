package DynamicProgramming;

import java.util.*;

public class FloorandEggs {

    static int minAttempts(int N, int K) {
        // dp[i][j] represents the minimum attempts needed with i eggs and j floors.
        int[][] dp = new int[K + 1][N + 1];

        // Base cases: If there are no floors or only one floor.
        for (int i = 1; i <= K; i++) {
            dp[i][0] = 0; // No attempts needed for 0 floors.
            dp[i][1] = 1; // One attempt needed for 1 floor.
        }

        // Base case: If there is only one egg.
        for (int j = 1; j <= N; j++) {
            dp[1][j] = j; // One attempt needed for each floor with one egg.
        }

        // Filling the rest of the dp table using a bottom-up approach.
        for (int i = 2; i <= K; i++) {
            for (int j = 2; j <= N; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int x = 1; x <= j; x++) {
                    int brokenEgg = 1 + Math.max(dp[i - 1][x - 1], dp[i][j - x]);
                    dp[i][j] = Math.min(dp[i][j], brokenEgg);
                }
            }
        }

        return dp[K][N];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Number of floors
        int K = scanner.nextInt(); // Number of eggs

        int result = minAttempts(N, K);
        System.out.println(result);

        scanner.close();
    }
}
