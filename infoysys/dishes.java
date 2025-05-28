package infoysys;

import java.util.Arrays;

public class dishes {
    public static int maxDishes(int N, int[] Arr) {
        // Sort the array in non-decreasing order
        Arrays.sort(Arr);

        int maxDishes = 0;
        int count = 0;

        // Iterate through the sorted array
        for (int i = 0; i < N; i++) {
            // Count unique dishes
            if (i == 0 || Arr[i] != Arr[i - 1]) {
                count = 1;
            } else {
                count++;
            }

            // Calculate maximum dishes for each unique dish
            int maxDishesForThisDish = count;
            int numOrders = 1;
            while (maxDishesForThisDish > 0) {
                maxDishes = Math.max(maxDishes, maxDishesForThisDish);
                numOrders *= 2;
                maxDishesForThisDish = Math.min(N, count * numOrders);
            }
        }

        return maxDishes;
    }

    public static void main(String[] args) {
        int[] Arr = {1, 2, 4, 2, 3};
        int N = 5;

        System.out.println("Case#1 Output: " + maxDishes(N, Arr)); // Output: 5
    }
}
