// Write a Program to get the runs scored by the batsmen in the last five innings. If he played less than 5 matches then the score of the match he did not play is to be displayed by minus sign (-).
// Store the scores of the batsmen in a queue.
// Sample Input 1:
// 3
// 13 50 10
// Sample Output 1:
// - - 13 50 10
// Sample Input 2:
// 10
// 100 5 10 29 82 15 20 50 91 24
// Sample Output 2:
// 15 20 50 91 24

import java.util.*;
public class innings
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
      for(int i = 0;i<5;i++){
          if(i<5-n){
              System.out.print("-"+" ");
          }else{
              System.out.print( arr[n-5 +i] +" ");
          }
      }
	}
}