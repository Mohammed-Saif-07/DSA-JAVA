package infoysys;

import java.util.Arrays;

public class Gym {
    public static int minExercisesToGetTired(int E, int N, int[] A) {
        Arrays.sort(A);

        int total_exercises = 0;
        for (int i = 0; i < N; i++) {
            if (E <= 0) break; // If energy is zero or negative, break

            // Perform exercise twice if energy allows
            if (E - 2 * A[i] >= 0) {
                total_exercises += 2;
                E -= 2 * A[i];
            } else if (E - A[i] >= 0) { // If only once possible
                total_exercises++;
                E -= A[i];
            } else {
                break; // Cannot perform more exercises
            }
        }

        if (E > 0) return -1; // If energy remains, not tired
        else return total_exercises;
    }

    public static void main(String[] args) {
        int E = 6;
        int N = 2;
        int[] A = {1, 2};

        int result = minExercisesToGetTired(E, N, A);
        System.out.println(result);
    }
}
