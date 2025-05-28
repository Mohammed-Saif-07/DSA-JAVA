package leetcode;

public class freq {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int ans[]=new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            int count = 0;
            if(nums[i+1]>nums[i]){
                count++;
            }
            for(int j = 0;j<nums.length;j++){
                System.out.print(ans[j]+count + " ");
            }
        }
       
    }
}
