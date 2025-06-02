package shekhar.st2;

// You are tasked with implementing a function to print the nodes of a specific level in a binary search tree. The tree nodes contain integer values, and the levels are 0-indexed.

// Input Explanation:
// Input consists of three lines,
// Line 1: Total Number of Nodes for BST as N,
// Line 2: N space separated Nodes to be inserted in BST,
// Line 3: Level which you want to print as K.

// Output Explanation:
// Space separated Nodes from Kth level. If no nodes available on Kth level print “-1”.

// Code Constraints:
// 0 ≤ N ≤ 105
// The integer values representing node data should be within the valid range supported by the system.
// 0 ≤ K
// The level to print (Kth level) should be a non-negative integer.

// Sample Testcase 1
// Input:
// 5
// 4 3 5 1 6
// 2
// Output:
// 1 6

// Sample Testcase 2: 
// Input:
// 7
// 10 5 15 3 7 12 18
// 2
// Output: 
// 3 7 12 18

// Hidden Test case 1 - (Easy) Weightage 10%
// Input:
// 6
// 5 3 8 2 7 9
// 1
// Output:
// 3 8

// Hidden Test case 2 - (Easy) Weightage 10%
// Input:
// 7
// 20 10 30 5 15 25 35
// 0
// Output:
// 20

// Hidden Test case 3 - (Medium) Weightage 15%
// Input:
// 7
// 50 25 75 10 40 60 90
// 3
// Output:
// -1

// Hidden Test case 4 - (Medium) Weightage 15%
// Input:
// 7
// 8 4 12 2 6 10 14
// 2
// Output:
// 2 6 10 14

// Hidden Test case 5 - (Hard) Weightage 25%
// Input:
// 5
// 4 3 5 1 6
// 2
// Output:
// 1 6

// Hidden Test case 6 - (Hard) Weightage 25%
// Input:
// 7
// 10 5 15 3 7 12 18
// 4
// Output: 
// -1


// #Solution:
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class specificLevelNodePrint {
    static boolean flag = false;

    static void printLevel(Node root, int level) {
        if (root == null)
            return;

        if (level == 1) {
            flag = true;
            System.out.print(root.data + " ");
            return;
        }

        else if (level > 1) {
            printLevel(root.left, level - 1);
            printLevel(root.right, level - 1);
        }
    }

    static Node insert(Node root, int data) {
        if (root == null)
            return new Node(data);

        if (data < root.data)
            root.left = insert(root.left, data);
        else if (data > root.data)
            root.right = insert(root.right, data);

        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int data = scanner.nextInt();
            root = insert(root, data);
        }

        int K = scanner.nextInt();
        printLevel(root, K + 1);
        if (!flag)
            System.out.print("-1");

        scanner.close();
    }
}

