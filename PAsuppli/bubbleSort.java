import java.util.Scanner;

public class bubbleSort{
    public static void check(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            for(int j = 0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String array[] = sc.nextLine().split("\\s+");
        int n = array.length;
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = Integer.parseInt(array[i]);
        }
       for(int ele : arr){
        System.err.print(ele+" ");
       }
       System.err.println();
    //    check(arr);
       for(int x : arr){
        System.err.print(x+" ");
       }
    }
}