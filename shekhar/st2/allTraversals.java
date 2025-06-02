package shekhar.st2;

// Suppose you are tasked with implementing a program that manages a directory structure where each node represents a folder containing a numerical ID. The program allows users to insert new folders into the structure and perform various traversals on the tree. You decide to use a binary search tree to efficiently manage the folders.

// A user wants to organize folders in the directory structure, after inserting these folders using the provided program, the user wants to know the contents of the directory structure in different orders. (Inorder, Preorder, Postorder, Levelorder)

// Input Explanation:
// Input consists of two lines,
// Line 1: Total Number of Nodes for BST as N,
// Line 2: N space separated Nodes to be inserted in BST.

// Output Explanation:
// Output consists of four lines,
// Line 1: Space separated Inorder Traversal for BST with user input.
// Line 2: Space separated Preorder Traversal for BST with user input.
// Line 3: Space separated Postorder Traversal for BST with user input.
// Line 4: Space separated Levelorder Traversal for BST with user input.

// Code Constraints:
// 0 ≤ N ≤ 10 
// The integer values representing node data should be within the valid range supported by the system.

// Sample Testcase 1
// Input:
// 7
// 1 2 3 4 5 6 7
// Output:
// 1 2 3 4 5 6 7 
// 1 2 3 4 5 6 7 
// 7 6 5 4 3 2 1 
// 1 2 3 4 5 6 7

// Sample Testcase 2: 
// Input:
// 5
// 4 2 5 1 3
// Output: 
// 1 2 3 4 5 
// 4 2 1 3 5 
// 1 3 2 5 4 
// 4 2 5 1 3

// Hidden Test case 1 - (Easy) Weightage 10%
// Input:
// 7
// 10 5 15 3 7 12 18
// Output:
// 3 5 7 10 12 15 18 
// 10 5 3 7 15 12 18 
// 3 7 5 12 18 15 10 
// 10 5 15 3 7 12 18

// Hidden Test case 2 - (Easy) Weightage 10%
// Input:
// 6
// 5 3 8 2 7 9
// Output:
// 2 3 5 7 8 9 
// 5 3 2 8 7 9 
// 2 3 7 9 8 5 
// 5 3 8 2 7 9

// Hidden Test case 3 - (Medium) Weightage 15%
// Input:
// 7 
// 20 10 30 5 15 25 35
// Output:
// 5 10 15 20 25 30 35 
// 20 10 5 15 30 25 35 
// 5 15 10 25 35 30 20 
// 20 10 30 5 15 25 35

// Hidden Test case 4 - (Medium) Weightage 15%
// Input:
// 8
// 8 4 12 2 6 10 14 1
// Output:
// 1 2 4 6 8 10 12 14 
// 8 4 2 1 6 12 10 14 
// 1 2 6 4 10 14 12 8 
// 8 4 12 2 6 10 14 1

// Hidden Test case 5 - (Hard) Weightage 25%
// Input:
// 7
// 1 2 3 4 5 6 7
// Output:
// 1 2 3 4 5 6 7 
// 1 2 3 4 5 6 7 
// 7 6 5 4 3 2 1 
// 1 2 3 4 5 6 7

// Hidden Test case 6 - (Hard) Weightage 25%
// Input:
// 5
// 4 2 5 1 3
// Output: 
// 1 2 3 4 5 
// 4 2 1 3 5 
// 1 3 2 5 4 
// 4 2 5 1 3

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

public class allTraversals {
    static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    static void levelOrder(Node root) {
        if (root == null)
            return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            System.out.print(temp.data + " ");

            if (temp.left != null)
                queue.add(temp.left);
            if (temp.right != null)
                queue.add(temp.right);
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
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelOrder(root);
        scanner.close();
    }
}

