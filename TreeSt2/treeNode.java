package TreeSt2;
import java.util.*;
public class treeNode<T> {
    T data;
    ArrayList <treeNode<T>> children;
    public int val;

    public treeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}
