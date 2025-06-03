package ADIST2.STACK;

import java.util.*;
public class stackBasic4{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
Stack <Integer> stack = new Stack<>();
for(int i = 1;i<=n;i++){
    int ele = sc.nextInt();
    stack.push(ele);
}
Stack <Integer> temp = new Stack<>(); 
while(!stack.isEmpty()){
    temp.push(stack.pop());
}
while(!temp.isEmpty()){
    System.out.print(temp.pop()+" ");
}
	}
}
