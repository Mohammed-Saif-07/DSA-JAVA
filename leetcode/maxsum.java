package leetcode;

public class maxsum {
    public static void main(String[] args) {
        int nums[][]={{1,5,7},{2,3,4}};
        int Maxsum = 0;
        for(int i = 0;i<nums.length;i++){
            int sum = 0;
            for(int j = 0;j<nums[0].length;j++){
                sum += nums[i][j];
                // if(sum>sum[i])
            }
            Maxsum = Math.max(Maxsum,sum);
        }
        System.out.println(Maxsum);
    }
    }

