package DynamicProgramming;

public class lessCoin {
 public static int minCoins(int coins[], int M, int V) {
 int table[] = new int[V + 1];
 table[0] = 0;
 for (int i = 1; i <= V; i++)
 table[i] = Integer.MAX_VALUE;
 for (int i = 1; i <= V; i++) {
 for (int j = 0; j < M; j++)
 if (coins[j] <= i) {
 int sub_res = table[i - coins[j]];
 if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i])
 table[i] = sub_res + 1;
 }
 }
 return table[V];
 }
 public static void main(String args[]) {
 int coins[] = {1, 2, 5, 10};
 int M = coins.length;
 int V = 12;
 System.out.println(minCoins(coins, M, V));
 }
}