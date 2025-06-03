package ADIST2.STACK;

import java.util.*;
public class valid2
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Stack<Character> stk = new Stack<>();
		boolean emptyy = true;
		
		for(char ch : str.toCharArray())
		{
		    if(ch=='(' || ch=='{' || ch=='[')
		    {
		        stk.push(ch);
		    }
		    else if(ch==')' || ch=='}'|| ch==']')
		    {
		        if(stk.isEmpty())
		        {
		            emptyy = false;
		            break;
		        }
		        char top = stk.pop();
		        if((ch==')' && top!='(') ||
		        (ch=='}' && top!='{') ||
		        (ch==']' && top!='[')
		        )
		        {
		            emptyy = false;
		            break;
		        }
		    }
		}
		if(!stk.isEmpty())
		{
		    emptyy = false;
		}
		System.out.println(str +" is Balanced "+ emptyy);
	}
}