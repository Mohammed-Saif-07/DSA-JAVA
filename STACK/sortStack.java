package ADIST2.STACK;

import java.util.*;

// import practice.swaping.sort;
public class sortStack {
    public static  void Isort(Stack <Integer> stack){
        Stack <Integer> tempStack = new Stack<>();
        while (!stack.isEmpty()) {
            int temp = stack.pop();
        
        while (!tempStack.isEmpty() && tempStack.peek()>temp) {
            stack.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        stack.push(6);
        stack.push(7);
        stack.push(2);
        stack.push(9);
        stack.push(1);
        stack.push(8);
        System.out.print("gven: " + stack + " ");
        Isort(stack);
        System.out.println();
        System.out.print("new: " + stack+" ");
    }
}
