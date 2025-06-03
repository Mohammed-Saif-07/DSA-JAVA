package ADIST2.STACK;


import java.util.*;
public class stackBasic1{
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("Saif");
		stack.push("Nandini");
		stack.push("Vaibhav");
		
		System.out.println("Starting stack : "+ stack);
		
		String top = stack.peek();
		System.out.println("Top ele : "+ top);

		
		// String pop = stack.pop();
		// System.out.println("Poped ele : "+ pop);
		
		// System.out.println("Stack after pop : "+ stack);
		
		// int pos = stack.search("Saif");
		// System.out.println("Pos of Saif : "+ pos);
		
	}
}