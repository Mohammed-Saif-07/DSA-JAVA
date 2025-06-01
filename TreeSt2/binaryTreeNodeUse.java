package TreeSt2;

public class binaryTreeNodeUse {
    public static void print(binaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        print(root.left);
        print(root.right);
    }
    public static void main(String[] args) {
        binaryTreeNode<Integer> root = new binaryTreeNode<Integer>(1);
        binaryTreeNode<Integer> rootLeft = new binaryTreeNode<Integer>(2);
        binaryTreeNode<Integer> rootRight = new binaryTreeNode<Integer>(3);

        root.left = rootLeft;
        root.right = rootRight;

        // binaryTreeNode<Integer> twoRight = new binaryTreeNode<>(4);
        // binaryTreeNode<Integer> threeLeft = new binaryTreeNode<>(5);

        // System.out.println(twoRight.data);
        print(root);
    }
}
