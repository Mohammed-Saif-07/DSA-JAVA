package leetcode;
import java.util.*;
public class plusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // sc.nextLine();
        String str1[] = {"++X","++X","X++".toLowerCase()};
        // for(int i = 0;i<n;i++){
        //     str1[i]=sc.nextLine();
        // }
        int count = 0;
    //     for(int i = 0;i<str1.length;i++){
    //         String str = str1[i];
        
    //     if(str.contains("x++")){
    //         count++;
    //     }
    //     if(str.contains("++x")){
    //         count++;
    //     }
    //     if(str.contains("x--")){
    //         count--;
    //     }
    //     if(str.contains("--x")){
    //         count--;
    //     }
    // }
    //     System.out.println(count);
    for(String x : str1){
        if(x.charAt(1)=='+'){
            count++;
        }else{
            count--;
        }
    }
    System.out.println(count);
    }
}
