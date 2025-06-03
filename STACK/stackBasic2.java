package ADIST2.STACK;

import java.util.*;
public class stackBasic2{
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        Stack <Integer> sh = new Stack<>();
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        
        for(int i = 1;i<=n;i++){
            sh.push(i);
        }
        
        System.out.print(sh);
        
	}
}

