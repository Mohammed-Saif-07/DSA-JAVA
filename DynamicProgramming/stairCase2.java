

//isme m ham le rahe ki itne tariko se hi ja sakta hai
// Maximum steps in one move = m
// stpes = n

package DynamicProgramming;

public class stairCase2
{
    public static int steps(int n, int m)
    {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return 0;
        }
        int way =0;
        for(int i=1;i<=m;i++)
        {
            way+=steps(n-i,m);
        }
        return way;
    }
	public static void main(String[] args) {
		int n = 5;
		int m= 2;
		System.out.println(steps(n,m));
	}
}