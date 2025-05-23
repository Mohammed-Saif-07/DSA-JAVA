// The first input is str (string): The original input string that needs to be modified.
// The second input is chars (int): An array of integers representing the indices where stars should be inserted.
// Output Format
// The output consists of (string) that is the modified string with stars inserted at the specified indices.
// Sample Input 1:
// HelloWorld
// 147
// Sample Output 1:
// Sample Input 2:
// TestString
// 25
// Sample Output 2:
// Te*stS*tring

import java.util.*;
public class addAestrik{
    public static String check(String str, int arr[]){
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int arrIndex = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (arrIndex < arr.length && i == arr[arrIndex]) {
                sb.append('*');
                arrIndex++;
            }
            sb.append(str.charAt(i));
        }
        if (arrIndex < arr.length && arr[arrIndex] == str.length()) {
            sb.append('*');
        }
        return sb.toString();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
         String indicesInput = sc.nextLine();
        String[] indicesStr = indicesInput.split("");
        
        // Convert to array of integers
        int[] indices = new int[indicesStr.length];
        for (int i = 0; i < indicesStr.length; i++) {
            indices[i] = Integer.parseInt(indicesStr[i]);
        }
        String result = check(str, indices);
        System.out.println(result);
    }
}