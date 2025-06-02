// Q.8. Prime Number Counting Tool for Mathematical Analysis with help of sieve of Eratosthenes algorithm.
// Imagine you are developing a program for a mathematical analysis tool used by a research institute. Your program is designed to find and count prime numbers within a given range of natural numbers, providing valuable insights into the distribution of prime numbers and aiding researchers in their studies of number theory.

// Your program takes input data representing the upper limit of the range (n) within which prime numbers are to be identified and counted. The program then efficiently calculates and outputs the total count of prime numbers within the specified range.

// Input Explanation:
// The input consists of a single integer n, representing the upper limit of the range within which prime numbers are to be identified and counted.

// Output Explanation:
// The output consists of a single integer, representing the count of prime numbers within the range from 2 to n, inclusive.


// Sample Input 1: 
// 50
// Sample Output 1:
// 15

// Sample Input 2: 
// 10
// Sample Output 2: 
// 4

package shekhar.st1;

import java.util.Scanner;

public class Erastothenis {
    
    static void findPrimes(int n) {
        int count=0;
        boolean[] arr = new boolean[n + 1];
        for (int i = 2; i * i <= n; i++) {
            if (!arr[i]) {
                for (int j = i * i; j <= n; j += i) {
                    arr[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (!arr[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        findPrimes(n);
    }

}