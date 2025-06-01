package TreeSt2;
import java.util.*;

public class sumNode {
    public static treeNode<Integer> input(Scanner sc){
        int n = sc.nextInt();
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
    public static int sumNodes(treeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int sum = root.data; // Add current node's value to sum
        for (treeNode<Integer> child : root.children) {
            sum += sumNodes(child); // Recursively sum nodes in each child subtree
        }
        return sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        treeNode<Integer> root = input(sc);
        print(root);
        System.out.println(sumNodes(root));
        
    }
}
