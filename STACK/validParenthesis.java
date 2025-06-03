package ADIST2.STACK;

import java.util.*;
public class validParenthesis{
    
    public static boolean isValid(String str){
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            
            if(ch=='(' || ch=='{' || ch=='['){
                stk.push(ch);
                continue;
            }
            if(stk.isEmpty()){
                return false;
                
            }
            char check;
            switch(ch)
            {
                case')':
                    check=stk.pop();
                    if(check=='{' || check=='['){
                        return false;
                        
                    }
                    break;
                case'{':
                    check=stk.pop();
                    if(check=='[' || check=='('){
                        return false;
                    }
                    break;
                case'[':
                    check=stk.pop();
                    if(check=='{' || check=='('){
                        return false;
                    }
                     break;
            }   
        }
        return stk.isEmpty();
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		if(isValid(str)){
		    System.out.println("Balanced");
		}
		else{
		    System.out.println("not balanced");
		}
	
		
		
		
	}
}