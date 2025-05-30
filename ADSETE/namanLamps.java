// Street Lamps
// Naman is an electrician in the local electricity department. 
// He was given the task to replace the fused street lamps with the new one. He was provided with K new street lamps, where K could be greater, equal or less than the street lamps which do not work. One particular street has N number of street lamps. Starting from one end of the street to another end, Naman started noting down the working condition of each street lamp. He wrote 0 if it doesn't work and I if it is in good working condition. Now your task is to find out the maximum number of continuous street lamps (in good working conditions) can be there if at most K fused lamps can be replaced by the new ones.
// Sample Input 1:
// 9
// 110100101
// 3
// Sample Output 1:
// 7
// Sample Input 2:
// 9
// 110100101
// 8
// Sample Output 2:
// 9
// Input Explanation:
// 1st Line contains 'N', where N is the number of street lamps.
// 2nd Line contains N 0's or 1's, where 0 represents a fused lamp and I represents a good working lamp.
// 3rd Line contains "K", where K is the number of new lamps provided to Naman
// Output Explanation:
// Maximum number of continuous good working condition street lamps after replacing atmost K. fused lamps were replaced by new ones.
// Solution:

public class namanLamps {
    public static int maxContinuousLamps(int N, String lamps, int K) {
        int start = 0;
        int maxLen = 0;
        int zeroCount = 0;

        for (int end = 0; end < N; end++) {
            if(lamps.charAt(end) == '0'){
                zeroCount++;
            }
            while(zeroCount > K){
                if(lamps.charAt(start) == '0'){
                    zeroCount--;
                }
                start++;
            }
            maxLen = Math.max(maxLen, end - start + 1); //1-0+1
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int N1 = 9;
        String lamps1 = "110100101";
        int K1 = 3;
        System.out.println(maxContinuousLamps(N1, lamps1, K1)); 
        
    }
}