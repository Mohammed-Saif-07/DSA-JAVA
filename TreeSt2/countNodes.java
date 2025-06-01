package TreeSt2;
import java.util.*;

// import javax.swing.tree.TreeNode;

public class countNodes {
    public static treeNode<Integer> input(Scanner sc){
        int n;
        // System.out.println("enter");
        n = sc.nextInt();
        treeNode<Integer> root = new treeNode<Integer>(n);
        int childCount = sc.nextInt();
        for(int i = 0;i<childCount;i++){
            treeNode<Integer> child = input(sc);
            root.children.add(child);
        }
        return root;
    }
    public static void print(treeNode<Integer> root){
        String str = root.data+":";
        for(int i = 0;i<root.children.size();i++){
            str += root.children.get(i).data +",";
            
        }
        System.out.println(str);
        for(int i = 0;i<root.children.size();i++){
            print(root.children.get(i));
        }
   
    }
    public static int numNodes(treeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int count = 1;
        for(int i = 0;i<root.children.size();i++ ){
            count += numNodes(root.children.get(i));
        }
        return count;
    }
    public static int max(treeNode<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE; // Return minimum value if the root is null
        }
        
        int max = root.data; // Initialize max with the value of the root node
        for (int i = 0; i < root.children.size(); i++) {
            int childMax = max(root.children.get(i)); // Recursively find the maximum value in the children
            if (childMax > max) {
                max = childMax; // Update max if the childMax is greater
            }
        }
        
        return max;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        treeNode<Integer> root = input(sc);
        print(root);
        System.out.println(numNodes(root));
        System.out.println(max(root));
    }
}
