package TreeSt2;
import java.util.*;


public class minNode {
    public static treeNode<Integer> input(Scanner sc){
        int n;
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
    public static int min(treeNode<Integer> root) {
        if (root == null) {
            return Integer.MAX_VALUE; // Return maximum value if the root is null
        }
        
        int min = root.data; // Initialize min with the value of the root node
        for (int i = 0; i < root.children.size(); i++) {
            int childMin = min(root.children.get(i)); // Recursively find the minimum value in the children
            if (childMin < min) {
                min = childMin; // Update min if the childMin is smaller
            }
        }
        
        return min;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        treeNode<Integer> root = input(sc);
        print(root);
        System.out.println(min(root));
    }
}
