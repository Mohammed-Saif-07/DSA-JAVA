//WRONG

// package DynamicProgramming;

// import java.util.Scanner;
// import java.util.Arrays;

// public class KthLargest{
//     public static int kth(int arr[],int k){
//         Arrays.sort(arr);
//         return arr[k-1];
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i = 0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int k = sc.nextInt();
//         int result = kth(arr, k);
//         System.out.println(result);
//     }
// }