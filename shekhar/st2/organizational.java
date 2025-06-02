package shekhar.st2;

// Determining the Height of an Organizational Hierarchy
// You are provided with a C++ program that constructs a binary search tree representing the organizational hierarchy of a company based on user input. The program defines a Node class representing individual employees in the hierarchy and includes a Height method that calculates and returns the height of the organizational tree.

// Input Explanation:
// Input consists of two lines,
// Line 1: Total Number of Nodes for BST as N,
// Line 2: N space separated Nodes to be inserted in BST,

// Output Explanation:
// Output consists of Integer value which will represent Height of BST.

// Code Constraints:
// 0 ≤ N ≤ 10 
// The integer values representing node data should be within the valid range supported by the system.

// Sample Testcase 1
// Input:
// 10
// 10 5 15 3 7 12 18 20 2 9
// Output:
// 4

// Sample Testcase 2: 
// Input:
// 6
// 5 3 8 2 7 9
// Output: 
// 3

// Hidden Test case 1 - (Easy) Weightage 10%
// Input:
// 9
// 5 3 8 2 7 9 11 13 56
// Output:
// 6

// Hidden Test case 2 - (Easy) Weightage 10%
// Input:
// 7
// 20 10 30 5 15 25 35
// Output:
// 3

// Hidden Test case 3 - (Medium) Weightage 15%
// Input:
// 8
// 50 25 75 10 40 60 90 1
// Output:
// 4

// Hidden Test case 4 - (Medium) Weightage 15%
// Input:
// 1
// 42
// Output:
// 1

// Hidden Test case 5 - (Hard) Weightage 25%
// Input:
// 10
// 10 5 15 3 7 12 18 20 2 9
// Output:
// 4

// Hidden Test case 6 - (Hard) Weightage 25%
// Input:
// 6
// 5 3 8 2 7 9
// Output: 
// 3

// #Solution:
import java.util.Scanner;

class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
public class organizational {
    static int height(Node root) {
        if (root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
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
        System.out.println(height(root));
        scanner.close();
    }
}
 

