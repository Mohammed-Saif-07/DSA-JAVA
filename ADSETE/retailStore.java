// Imagine you are working for a retail store and you have a list of prices for all the products in the store. Your manager wants you to find out if there are any two products whose prices add up to a specific target amount. Write a Java program to solve this problem using the two-pointer approach.
// Sample Input 1:
// 2
// 5 6
// 23416
// 5 8
// 23497
// Sample Output 1:
// YES
// NO
// Sample Input 2:
// 1
// 5 4
// 12345
// Sample Output 2:
// YES
// Input Explanation:
// 1st Line contains 't', where t is the number of test cases. For each test case two lines follow.
// First line contains 'N' and 'A', where N is the total number of products and A is the target amount.
// Second line contains space separated prices of each product.
// Output Explanation: t lines of YES or NO.
// YES if any two products' prices sum up to the target amount.
// NO if no two product prices sum up to the target amount.

import java.util.Scanner;

public class retailStore{
    public static boolean check(int arr[],int k){
        for(int i = 0;i<arr.length;i++){
            for(int j = i + 1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            boolean call = check(arr, k);
            if(call){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}