package ADIST2.STACK;

import java.util.*;
public class stackBasic3{
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
Stack <Integer> stack = new Stack<>();
for(int i = 1;i<=n;i++){
    int ele = sc.nextInt();
    stack.push(ele);
}
while(!stack.isEmpty()){
    System.out.print(stack.pop()+" ");
}
	}
}

    