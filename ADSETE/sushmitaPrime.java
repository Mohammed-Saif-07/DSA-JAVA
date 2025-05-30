// Sushmita is a very strict instructor, and she keeps a record of her 
// student names and exam results. She was interested in how 
// many students received exam results in prime numbers. To tally 
// the number of prime scores in the collection of exam results, you 
// can assist her in writing the java program.

import java.util.Arrays;
public class sushmitaPrime {
    public static boolean checkPrime(int n ){
        if(n <=1){
            return false;
        }
        for(int i = 2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {3, 12, 21, 11};
        Arrays.toString(arr);
        for(int x : arr){
            if(checkPrime(x)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }

    }
}
