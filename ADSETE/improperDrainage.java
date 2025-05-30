// Improper Drainage
// Sahil is a civil engineer and is given a task to find out if the drainage system built 
// by another engineer is upto the mark or not. Drainage system is made by using N pipes welded side by side. Drainage system will only work if K pipes joined side by side have an average strength of M or more. Your task is to find out if the given drainage system will work or not.
// Sample Input 1:
// 2
// 535
// 648-27
// 3510
// 648-27-1150 117
// Sample Output 1:
// NO
// YES
// Sample Input 2:
// 1
// 129
// 120202202
// Sample Output 2:
// YES
// Input Explanation:
// Ist Line contains "t", where t is the number of test cases. For each test case, two lines follow.
// First line contains "M', 'K' and 'N', where M is the average strength it needs for K pipes for proper drainage and N is the total number of pipes joined one after another.
// Second line contains N integers showing strength of each pipe joined side by side.
// Output Explanation:
// 't' lines of NO or YES.
// NO-if the average strength of any possible K pipes joined side by side is not greater than or equal to M.
// YES - if the average strength of all possible K pipes joined side by side is greater than or equal to M.
// For example in Sample Input 1.
// for 1st test case, there are a total of 5 pipes. So there are only below 3 possibilities of 3 pipes arrangement which should have a total average strength of 5 or more.
// 1st possibility, pipes with strength 6,4 and 8 which has average strength of 6 (greater than 5)
// 2nd possibility, pipes with strength 4, 8 and -2 which has average strength of 3.33(less than 5)
// 3rd possibility, pipes with strength 8, -2 and 7 which has average strength of 4.33(less than 5) Therefore output for 1st test case is NO
// Solution:
import java.util.Scanner;

public class improperDrainage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 

        while (t-- > 0) {
            int M = scanner.nextInt();  
            int K = scanner.nextInt();  
            int N = scanner.nextInt();  

            int[] strengths = new int[N];
            for (int i = 0; i < N; i++) {
                strengths[i] = scanner.nextInt();  
            }

            System.out.println(isSystemFunctional(M, K, strengths));
        }
        scanner.close();
    }

    private static String isSystemFunctional(int M, int K, int[] strengths) {
        long sum = 0;
        for (int i = 0; i < K; i++) {
            sum += strengths[i];
        }
        // Check the average of the first window
        if (sum / K < M) {
            return "NO";
        }
        for(int i = K; i < strengths.length;i++) {
            sum += strengths[i];    
            sum -= strengths[i - K];     
            if (sum / K < M){
                return "NO";
            }
        }
        return "YES";
    }
}