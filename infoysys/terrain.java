package infoysys;

public class terrain {
    public static int minDays(int N, int[] L) {
        // Check if terrain is already strictly decreasing
        boolean strictlyDecreasing = true;
        for (int i = 1; i < N; i++) {
            if (L[i] >= L[i - 1]) {
                strictlyDecreasing = false;
                break;
            }
        }
        if (strictlyDecreasing) return 0; // No digging required

        // Calculate maximum days required
        int maxDays = 0;
        for (int i = 1; i < N; i++) {
            int diff = L[i - 1] - L[i];
            int days = (diff + (2 * i - 1) - 1) / (2 * i - 1);
            maxDays = Math.max(maxDays, days);
        }
        return maxDays;
    }

    public static void main(String[] args) {
        int[] L1 = {3, 3};
        int[] L2 = {5, -3};

        System.out.println("Case#1 Output: " + minDays(2, L1)); // Output: 1
        System.out.println("Case#2 Output: " + minDays(2, L2)); // Output: 0
    }
}
