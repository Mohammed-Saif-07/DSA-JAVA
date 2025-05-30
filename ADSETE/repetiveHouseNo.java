// Repetitive House Numbers
// There are a total of N houses in a street.
// Each street house is assigned random house numbers For every K+1 house,
// each house must have a unique house number allotted to it.
// Two or more houses may have the same house number but they should not have K-1 house in between them.
// Given N and K, your task is to find out if there is any repetitive house number being allotted to the houses.
// Sample Input 1:
// 8
// 12341423
// 3
// Sample Output 1:
// Repetitive
// Sample Input 2:
// 8
// 12351423
// 3
// Sample Output 2:
// Non Repetitive
// Input Explanation:
// Ist Line contains 'N', where N is the number of houses.
// 2nd Line contains N positive integers representing house numbers allotted to house starting from one end of the street to the other end
// 3rd Line cortains "K", where K is the range in which houses should have unique house numbers.
// Output Explanation:
// Repetitive if any of the houses in the range K have the same house number.
// Non Repetitive if none of the houses in the range K have a unique house number.
// Solution: 

import java.util.HashSet;
import java.util.Set;

public class repetiveHouseNo {

    public static String checkHouseNumbers(int N, String houseNumbers, int K) {
        Set<Character> currentWindow = new HashSet<>();
        char[] numbers = houseNumbers.toCharArray();

        for (int i = 0; i <= K && i < N; i++) {
            if(!currentWindow.add(numbers[i])){
                return "Repetitive";
            }
        }
        for (int i = K + 1; i < N; i++) {
            currentWindow.remove(numbers[i - K - 1]);
            if (!currentWindow.add(numbers[i])) {
                return "Repetitive";
            }
        }
        return "Non Repetitive";
    }
    public static void main(String[] args) {
        int N1 = 8;
        String houses1 = "12351423";
        int K1 = 3;
        System.out.println(checkHouseNumbers(N1, houses1, K1));  
    }
}