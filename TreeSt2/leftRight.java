package TreeSt2;

public class leftRight {
    public static void printTree(binaryTreeNode<Integer> root)
	{
		if(root==null){
			return;
		}
		System.out.print(root.data + ":");
		if(root.left!=null){
			System.out.print("L"+root.left.data+", ");
		}
		if(root.right!=null){
			System.out.print("R"+ root.right.data);
		}
		System.out.println();
		printTree(root.left);
		printTree(root.right);
	}
    public static void main(String[] args) {
        binaryTreeNode<Integer> root = new binaryTreeNode<Integer>(1);
        binaryTreeNode<Integer> rootLeft = new binaryTreeNode<Integer>(2);
        binaryTreeNode<Integer> rootRight = new binaryTreeNode<Integer>(3);

        root.left = rootLeft;
        root.right = rootRight;

        binaryTreeNode<Integer> twoRight = new binaryTreeNode<>(4);
        binaryTreeNode<Integer> threeLeft = new binaryTreeNode<>(5);

        rootLeft.right = twoRight;
		rootRight.left = threeLeft;
        
        printTree(root);
    }
}
