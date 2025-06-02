package shekhar.st2;

// 5. Left View of a Binary Search Tree
// You are provided with a Java program that constructs a binary search tree
// based on user input and identifies and prints the left view of the tree. The
// program defines a Node class representing individual nodes in the tree and
// includes a LeftView method that prints the values of nodes visible from the
// right side of the tree.
// Input Explanation:
// Input consists of two lines, Line 1: Total Number of Nodes for BST as N, Line 2: N space separated Nodes to be inserted in BST, Output Explanation:
// Space separated Nodes which can be viewed from left side. Sample Input 1:
// 9
// 8 3 10 1 6 4 7 13 14
// Sample Output 1:
// 8 3 1 4
// Sample Input 2:
// 7
// 10 5 15 3 7 12 18
// Sample Output 2:
// 10 5 3
// #Solution:

import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class leftViewBST {
    static int LH;

    static void leftView(Node root, int RH) {
        if (root == null)
            return;
        if (LH < RH) {
            System.out.print(root.data + " ");
            LH = RH;
        }
        leftView(root.left, RH + 1);
        leftView(root.right, RH + 1);
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
        Scanner sc = new Scanner(System.in);
        Node root = null;
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            root = insert(root, sc.nextInt());
        }
        leftView(root, 1);
        sc.close();
    }
}
