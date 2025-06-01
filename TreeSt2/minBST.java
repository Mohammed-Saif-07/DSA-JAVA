package TreeSt2;


import java.util.*;
class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;
	
	public BinaryTreeNode(T data) //1
	{
		this.data = data;
	}
}

 public class minBST {

	public static int minNode(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return -1;
		}
		BinaryTreeNode<Integer> curr = root;
		while(curr.left!=null)
		{
			curr=curr.left;
		}
		return curr.data;
	}

     public static boolean check(BinaryTreeNode<Integer> root, int data){
         if(root ==null){
             return false;
         }
         if(root.data == data){
             return true;
         }
         if(data<root.data){
             return check(root.left,data);
         }
         return check(root.right,data);
     }
     
     
	public static BinaryTreeNode<Integer> takeInput(boolean isRoot, int pData, boolean isLeft)
	{
		if(isRoot)
		{
			System.out.println("Enter the root Data: ");
		}
		else
		{
			if(isLeft)
			{
				System.out.println("Enter the left child of :"+ pData);
			}
			else
			{
				System.out.println("Enter the right child of :"+ pData);
			}
		}
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		
		if(rootData == -1)
		{
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		BinaryTreeNode<Integer> leftChild = takeInput(false, rootData,true);
		BinaryTreeNode<Integer> rightChild = takeInput(false,rootData,false);
		
		root.left = leftChild;
		root.right = rightChild;
		return root;
		
	}
	//------------------------------------------------print tree--------------------------------------------------------------//
	public static void printTree(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data + ":");
		if(root.left!=null)
		{
			System.out.print("L"+root.left.data+", ");
		}
		if(root.right!=null)
		{
			System.out.print("R"+ root.right.data);
		}
		System.out.println();
		printTree(root.left);
		printTree(root.right);
	}
	//-----------------------------------------------------count no of nodes-----------------------------------------------------//
	public static int countNodes(BinaryTreeNode<Integer> root)
	{
	    if(root==null)
	    {
	        return 0;
	    }
	    int left=countNodes(root.left);
	    int right=countNodes(root.right);
	    return 1+left+right;
	}
	//-----------------------------------------------------------sum of nodes---------------------------------------------------//
	public static int sumOfNodes(BinaryTreeNode<Integer> root){
	    if(root==null){
	        return 0;
	    }
	    int leftSum = sumOfNodes(root.left);
	    int rightSum = sumOfNodes(root.right);
	    
	    return leftSum+rightSum+root.data;
	}
	//----------------------------------------------------------inorder transversal----------------------------------------------//
	public static void inOrder(BinaryTreeNode<Integer> root){
	    if(root==null){
	        return ;
	    }
	    inOrder(root.left);
	    System.out.println(root.data);
	    inOrder(root.right);
	}
	//-----------------------------------------------------------preorder transversal--------------------------------------------//
		public static void preOrder(BinaryTreeNode<Integer> root){
	    if(root==null){
	        return ;
	    }
	    
	    System.out.println(root.data);
	    preOrder(root.left);
	    preOrder(root.right);
	}
	//-------------------------------------------------------postorder transversal----------------------------------------------//
		public static void postOrder(BinaryTreeNode<Integer> root){
	    if(root==null){
	        return ;
	    }
	    postOrder(root.left);
	    postOrder(root.right);
	    System.out.println(root.data);
	}
	//-------------------------------------------------------max node---------------------------------------------------------//
	public static int maxNode(BinaryTreeNode<Integer> root){
	    if(root==null){
	        return -1;
	    }
	     int left = maxNode(root.left);
	     int right = maxNode(root.right);
	     
	     return(Math.max(root.data , Math.max(left , right)));
	    }
	 //----------------------------------------------------------height-----------------------------------------------------//
    	public static int height(BinaryTreeNode<Integer> root){
	    if(root==null){
	        return 0;
	    }
	     
	     
	     return(Math.max(height(root.left),height(root.right)))+1;
    	}
    	//--------------------------------------------------------leaf node---------------------------------------------------//
    	public static int leafNode(BinaryTreeNode<Integer>root){
	    if(root==null){
	        return 0;
	    }
	    if(root.left==null&& root.right==null){
	        return 1;
	    }
	    int left = leafNode(root.left);
	    int right = leafNode(root.right);
	    
	    return left +  right;
    	}
    //---------------------------------------------------nodes greater than x--------------------------------------------------//
    	public static int greaterNodes(BinaryTreeNode<Integer>root,int x){
    	    if (root==null){
    	        return 0;
    	    } 
    	    int count=0;
    	    if (x < root.data){
    	        count++;
    	    } 
    	    int left = greaterNodes(root.left,x);
    	    int right = greaterNodes(root.right,x);
    	    return count + left +right;
    	}
    //-------------------------------------------------------print-------------------------------------------------------//
    	public static void print(BinaryTreeNode<Integer> root )
    	{
		if(root ==null)
		{
			return;
		}
		System.out.println(root.data);
		print(root.left);
		print(root.right);
//		if(root.left!=null)
//		{
//			print(root.left);
//		}
//		if(root.right!=null)
//		{
//			print(root.right);
//		}
	}

	public static void main(String[] args) {
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
//		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
//		root.left = rootLeft;
//		root.right = rootRight;
//		
//		
//		BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<>(4);
//		BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<>(5);
//		
//		rootLeft.right = twoRight;
//		rootRight.left = threeLeft;
		
		BinaryTreeNode<Integer> root = takeInput(true,0,true);
		//printTree(root);
// 		System.out.println("preOrder");
// 		preOrder(root);
// 		System.out.println("postOrder");
// 		postOrder(root);
// 		System.out.println("inOrder");
// 		inOrder(root);
// 	Scanner sc = new Scanner(System.in);
// 		int x = sc.nextInt();
		
// 		System.out.println(greaterNodes(root , x));
		// System.out.println(check(root , 7));
		System.out.println(minNode(root));
	}

}