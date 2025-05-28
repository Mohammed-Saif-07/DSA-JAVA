package infoysys;

import java.util.*;

public class smallest {
    public static int[] smallestLexicographicalArray(int N, int[] A, int K) {
        // Find the smallest lexicographical array possible after swapping
        int[] result = Arrays.copyOf(A, N);
        int minIndex = -1;
        int minVal = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            for (int j = Math.max(0, i - K); j < i; j++) {
                if (A[j] < A[i] && A[j] < minVal) {
                    minIndex = j;
                    minVal = A[j];
                }
            }
        }

        // Swap if a smaller value is found within distance K
        if (minIndex != -1) {
            int temp = result[minIndex];
            result[minIndex] = result[minIndex + 1];
            result[minIndex + 1] = temp;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] A = {2, 2, 2};
        int N = 3;
        int K = 1;

        int[] result = smallestLexicographicalArray(N, A, K);
        System.out.println("Case#1 Output:");
        for (int num : result) {
            System.out.println(num);
        }
    }
}

