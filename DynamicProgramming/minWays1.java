// Given the time taken by n tasks. Find the minimum time needed to finish the tasks 
//such that skipping of tasks is allowed, but cannot skip two consecutive tasks.

// Input Format

// The first line contains number of tasks
// Next line denotes time taken by each task
// Constraints

// Minimum time needed to finish tasks after skipping..

// Output Format


// Sample Input 0

// 2
// 10 15
// Sample Output 0

// 10

package DynamicProgramming;

import java.util.*;

public class minWays1 {
    private static int minTimeWithConstraint(int[] arr) {
        int incl = arr[0];
        int excl = 0;

        for (int i = 1; i < arr.length; i++) {
            int incl_new = arr[i] + Math.min(excl, incl);
            int excl_new = incl;
            incl = incl_new;
            excl = excl_new;
        }

        
        return Math.min(incl, excl);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minTimeWithConstraint(arr));
    }
}