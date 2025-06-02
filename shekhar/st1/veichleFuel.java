// Q.4. Rearranging Vehicles Based on Fuel Efficiency for Logistics Optimization.
// Imagine you're developing a data processing tool for a logistics company that 
// manages a fleet of delivery vehicles. As part of optimizing the delivery process,
// you're tasked with developing a program to rearrange the order of vehicles based on their fuel efficiency.

// Your program takes input data representing the fuel efficiency of each vehicle in the fleet.
// The goal is to arrange the vehicles such that those with lower fuel efficiency (represented by zero fuel consumption)
// are moved to the end of the fleet, while maintaining the original order of vehicles with non-zero fuel efficiency.

// After processing the input data, your program provides the rearranged order of vehicles,
// helping the logistics team prioritize vehicles with higher fuel efficiency for delivery routes, ultimately improving overall fleet performance and fuel utilization.

// Input Explanation:
// The input consists of two lines.
// The first line contains an integer 'n' representing the number of vehicles in the fleet.
// The second line contains 'n' space-separated integers representing the fuel efficiency of each vehicle.

// Output Explanation:
// The output consists of a single line.
// The line contains 'n' space-separated integers representing the rearranged order of vehicles after moving those with zero fuel efficiency to the end of the fleet, while maintaining the original order of vehicles with non-zero fuel efficiency.

// Sample Input 1: 
// 6
// 20 0 15 0 30 10
// Sample Output 1:
// 20 15 30 10 0 0

// Sample Input 2: 
// 5
// 10 20 0 30 0

package shekhar.st1;

import java.util.Scanner;
public class veichleFuel {
    static void moveZero(int arr[], int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        moveZero(arr, n);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
 
}
