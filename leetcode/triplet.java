package leetcode;

public class triplet {
    public static int check(int[] arr, int diff){
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i +1;j<arr.length;j++){
                for(int k = j + 1;k<arr.length;k++){
                    if(arr[j]-arr[i] == diff && arr[k]-arr[j]== diff){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,4,6,7,10};         // 10-7=3,7-4=3
        int diff = 3;
       System.out.println(check(arr, diff));
    }
}
