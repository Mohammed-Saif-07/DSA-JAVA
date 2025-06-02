package shekhar.st2;

// You are working in a robotics lab where a new prototype robot has been developed. The robot is designed to move along a straight path, but it has limitations in its movement capabilities. The robot can only take steps of one, two, or three units at a time. Your task is to develop a program to help analyze the robot's movement possibilities.

// Input Explanation:
// The input consists of a single integer dist, representing the distance the robot needs to cover.

// Output Explanation:
// The output consists of a single integer, representing the count of possible ways for the robot to cover the given distance using its movement constraints.

// Code Constraints:
// 0 ≤ N ≤ 10 

// Sample Testcase 1
// Input:
// 0
// Output:
// 1

// Sample Testcase 2: 
// Input:
// 3
// Output: 
// 4

// Hidden Test case 1 - (Easy) Weightage 10%
// Input:
// 2
// Output:
// 2

// Hidden Test case 2 - (Easy) Weightage 10%
// Input:
// 1
// Output:
// 1

// Hidden Test case 3 - (Medium) Weightage 15%
// Input:
// 3
// Output:
// 4

// Hidden Test case 4 - (Medium) Weightage 15%
// Input:
// 4
// Output:
// 7

// Hidden Test case 5 - (Hard) Weightage 25%
// Input:
// 5
// Output:
// 13

// Hidden Test case 6 - (Hard) Weightage 25%
// Input:
// 7
// Output:
// 44

// #Solution:
import java.util.Scanner;
class roboticLab {
    static int printCountDP(int dist) {
        int[] count = new int[dist + 1];
        count[0] = 1;
        if (dist >= 1)
            count[1] = 1;
        if (dist >= 2)
            count[2] = 2;

        for (int i = 3; i <= dist; i++)
            count[i] = count[i - 1] + count[i - 2] + count[i - 3];

        return count[dist];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        System.out.println(printCountDP(dist));
        scanner.close();
    }
}

