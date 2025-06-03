package ADIST2.STACK;

import java.util.*;

public class reverseS{
    public static String reverse(String str){
        Stack <Character> stack = new Stack<>();
        for(int i = 0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        StringBuilder check = new StringBuilder();
        while(!stack.isEmpty()){
            check.append(stack.pop());
        }
        return check.toString();
    }
    public static void main(String[] args) {
        Stack <Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);;
        String str = sc.nextLine();
        String check = reverse(str);
        System.out.print(check);
    }
}