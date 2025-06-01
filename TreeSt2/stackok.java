package TreeSt2;
import java.util.*;
public class stackok {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>(); // created a Stack named = stack
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size: ");
        int n = sc.nextInt(); // took size 
        System.out.print("enter elements : ");
        for(int i = 1;i<=n;i++){ // stack no form 1
            int ele = sc.nextInt(); // input lia elements ka
            stack.push(ele); // hamare stack me elements dalte gaye niche se 
        }
        System.out.print("elemnets : ");
        while(!stack.isEmpty()){ // loop = jab tk stack khali nhi hota tb tk
            System.out.print(stack.pop()+" "); 
            // ham ek ek krke hamara element pop krte gaye aur use print karate gaye
        }
    }
} //yes

//1 2 3 4 5
//wait  yes done 2 min bhaiya
//mic  

//  5       <- input          5 pop -> 5 printed
//  4                         4
//  3                         3      // LIFO 
//  2                         2    //hogaya bhiaya
//  1        <-push           1