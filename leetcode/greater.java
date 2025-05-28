package leetcode;

public class greater{
    public static int[] ok(int nums[]){
        int ans[] = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            int count = 0;
            for(int j = 0; j<nums.length;j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {8,1,2,2,3};
        int arr2[] = ok(arr);
        for(int i = 0;i<arr2.length;i++){
            System.out.print(arr2[i] + " ");
        }
    }
}