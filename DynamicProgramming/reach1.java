package DynamicProgramming;

public class reach1{
    public static int StepI(int n){
        if(n == 1){
            return 1;
        }
        int arr[] = new int[n+1];
        arr[0] = 1;
        for(int i = 2; i <= n;i++){
            int op1 = Integer.MAX_VALUE;
            int op2 = Integer.MAX_VALUE;
            int op3 = Integer.MAX_VALUE;

            op1= arr[i-1];
            if(i%2==0){
                op2 = arr[i/2];
            }
               if(i%3==0){
                op2 = arr[i/3];
            }
            arr[i] = Math.min(op1,Math.min(op2, op3))+1;
        }
        return arr[n];
    }
    public static void main(String[] args) {
		int n = 5;
		System.out.println(StepI(n));
	}

}