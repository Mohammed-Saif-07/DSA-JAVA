// Consider that you are working on a project that requires 
// you to examine the text in a file. To tally the alphabets, 
// numbers, and special characters in the file, you must 
// create a java application. After asking the user to input the 
// file name, the application should read the file and tally the 
// characters. The software should be able to manage 
// situations where the file is empty or non-existent. The 
// programme should disregard non-ASCII characters and
// only tally ASCII characters if the file includes them. 
// Sample Input 1:
// Kgf@1981
// Sample Output 1:
// 3 
// 4 
// 1 
// Sample Input 2 :
// Hello! Dear?
// Sample Output 2:
// 9 
// 0 
// 2 
// Input Explanation: 
// Take String as input 
// Output Explanation: 
// The program counts the number of alphabets, digits, and special 
// characters in the given string and prints out the count for each 
// category as output.


import java.util.*;
public class countSpecial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int dCount = 0;
        int sCount = 0;
        int aCount = 0;
        
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            if (c >= '0' && c <= '9'){
                dCount++;
            }else if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                aCount++;
            }else{
                sCount++;
        }
    }
    System.out.println(aCount);
    System.out.println(dCount);
    System.out.println(sCount);
    }

}