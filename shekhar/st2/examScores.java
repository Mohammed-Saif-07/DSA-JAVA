package shekhar.st2;

// Q.1. Binary Search Tree Node Counting for Exam Scores
// Suppose you are given a scenario where you need to count the number of students who scored between a certain range in an exam. Each student is represented by a node in a binary search tree. The student's score is stored as the data in each node. Write a program in Java to implement this scenario using the provided code template.

// Input Explanation:
// The first line contains an integer n, denoting the number of students.
// The second line contains n space-separated integers representing the scores of each student.
// The third line contains two integers l and h, denoting the lower and upper bounds of the score range.

// Output Explanation:
// Output a single integer representing the count of students whose scores fall within the specified range [l, h].

// Code Constraints:
// 1 ≤ n ≤ 105 
// Each student's score is an integer in the range 0 to 109 
// l ≤ h 
// 0 ≤ l, h ≤ 109 

// Sample Testcase 1
// Input:
// 7
// 10 5 15 2 7 12 20
// 5 10
// Output:
// 3

// Sample Testcase 2: 
// Input:
// 5
// 7 3 10 1 5
// 2 8
// Output: 
// 3

// Hidden Test case 1 - (Easy) Weightage 10%
// Input:
// 4
// 20 10 30 5
// 15 25
// Output:
// 1

// Hidden Test case 2 - (Easy) Weightage 10%
// Input:
// 6
// 50 30 70 20 40 60
// 35 65
// Output:
// 3

// Hidden Test case 3 - (Medium) Weightage 15%
// Input:
// 3
// 10 5 15
// 1 20
// Output:
// 3

// Hidden Test case 4 - (Medium) Weightage 15%
// Input:
// 5
// 15 10 20 5 12
// 8 18
// Output:
// 3

// Hidden Test case 5 - (Hard) Weightage 25%
// Input:
// 7
// 25 15 35 10 20 30 40
// 5 35
// Output:
// 6

// Hidden Test case 6 - (Hard) Weightage 25%
// Input:
// 6
// 8 4 12 2 6 10
// 3 9
// Output:
// 3

// #Solution:

import java.util.Scanner;

class Main {
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }
    Node root;

    Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }

        return node;
    }

    int getCount(Node node, int low, int high) {
        if (node == null)
            return 0;

        if (node.data >= low && node.data <= high)
            return 1 + this.getCount(node.left, low, high) +
                    this.getCount(node.right, low, high);

        else if (node.data < low)
            return this.getCount(node.right, low, high);

        else
            return this.getCount(node.left, low, high);
    }

    public static void main(String[] args) {
        Main tree = new Main();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            tree.root = tree.insert(tree.root, data);
        }

        int l = scanner.nextInt();
        int h = scanner.nextInt();

        System.out.println(tree.getCount(tree.root, l, h));
    }
}
public class examScores {
    
}
