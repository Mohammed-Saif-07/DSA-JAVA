package leetcode;

public class sumMinusdigit {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digSum = 0;
        for(int x : nums){
            sum += x;
            while(x > 0){
                int dig = x % 10;
                digSum += dig;
                x /= 10;
            }
        }
        return sum - digSum;
    }
    public static void main(String[] args) {
        int nums[]={1,15,6,3};
        System.out.println();
    }
}
