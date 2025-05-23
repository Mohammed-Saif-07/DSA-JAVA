import java.util.*;

public class validParenthesis {
    public static String isValid(String str){
        Stack <Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(c=='(' || c == '{' || c == '['){
                stack.push(c);
            }else if(c == ')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }else if(c == ']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }else if(c == '}' && !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            }else {
                return "No";
            }
        }
        return "Yes";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = isValid(str);
        System.out.println(result);
    }
}
