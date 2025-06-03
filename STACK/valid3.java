//no

package ADIST2.STACK;

import java.util.*;

public class valid3 {
    //no
        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            
            for (char c : s.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
            
            return stack.isEmpty(); 
        }
        
    //no
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // boolean flag = valid3.isValid(str);

        if (isValid(str)) {
            System.out.println("valid.");
        } else {
            System.out.println("not valid.");
        }
    }
}
