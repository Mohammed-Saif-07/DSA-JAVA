package shekhar.st2;

// You are given a Java program that constructs a binary search tree based on
// user input and identifies and prints the leaf nodes of the tree. The program
// defines a Node class representing individual nodes in the tree and includes a
// LeafNodes method that prints the values of leaf nodes.
// Input Explanation:
// Input consists of two lines, Line 1: Total Number of Nodes for BST as N, Line 2: N space separated Nodes to be inserted in BST, Output Explanation:
// Space separated Leaf Nodes from BST. Sample Input 1:
// 9
// 8 3 10 1 6 4 7 13 14
// Sample Output 1:
// 1 4 7 14
// Sample Input 2:
// 7
// 10 5 15 3 7 12 18
// Sample Output 2:
// 3 7 12 18
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

public class checkLeafNodes {
    static void leafNodes(Node root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null)
            System.out.print(root.data + " ");
        if (root.left != null)
            leafNodes(root.left);
        if (root.right != null)
            leafNodes(root.right);
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
        leafNodes(root);
        sc.close();
    }
}
