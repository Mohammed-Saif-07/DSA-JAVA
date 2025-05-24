// Given 3 numbers (1, 3, 5), the task is to tell the total number of ways we can form a 
//number N using the sum of the given three numbers. (allowing repetitions and different arrangements).
// The total number of ways to form 6 is: 8

// 1+1+1+1+1+1

// 1+1+1+3

// 1+1+3+1
// 1+3+1+1

// 3+1+1+1

// 3+3

// 1+5

// 5+1

package DynamicProgramming;

public class minWays2 {
    public static void main(String[] args) {
        int n = 6;
        int[] arrays = new int[n + 1];
        arrays[0] = 1;

        for (int i = 1; i <= n; i++) {
            if (i - 1 >= 0) {
                arrays[i] += arrays[i - 1];
            }
            if (i - 3 >= 0) {
                arrays[i] += arrays[i - 3];
            }
            if (i - 5 >= 0) {
                arrays[i] += arrays[i - 5];
            }
        }

        System.out.println(arrays[n]);
    }
}
