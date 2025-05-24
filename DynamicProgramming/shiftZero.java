// input-                
// 7					7								7 
// 7 3 1 4 7 0 6		7 3 1 4 7 0 6					7 3 1 4 7 0 6
// 3					2								1

// output-

// 7 3 1 4 0 6 7        7 3 1 0 4 7 6					1 3 7 4 7 0 6

package DynamicProgramming;
 
import java.util.*;
public class shiftZero{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        
        if(k==3)
        {
            Arrays.sort(arr,n-3,n);
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
        if(k==1)
        {
            Arrays.sort(arr,0,3);
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
       
        if(k==2)
        {
            Arrays.sort(arr,n/2-1,n/2+2);
            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
