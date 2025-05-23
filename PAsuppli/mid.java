// Marks of student
// Parthak assisted his trainer with storng marks scored by the students, roll number wise in a linkedlist. Student's roll number starts with 1 upto N where N is the total number of students. Find the marks of student whose roll number comes in between
// If N is even, marks of middle two students is displayed and if N is odd, marks of only the middle one is displayed.
// Sample Input 1:
// 1013151211
// Sample Output 1:
// 15
// Sample Input 2:
// 79118
// Sample Output 2:
// 911

import java.util.*;
public class mid
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		 int s = n/2;
		 if(n%2==0){
		     System.out.println(arr[s-1]+" "+arr[s]);
		 }else{
		     System.out.println(arr[s]);
		 }
		}	
}