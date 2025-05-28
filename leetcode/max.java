package leetcode;

import java.util.*;

public class max {
    public static int mostWordsFound(String[] sentences) {
        // int x = sentences.length;
        // String str = ""+x;
        int max = 1;
        int maxWords = 0;
        for(String str : sentences){
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)==' '){
                max++;
            }
        }
        maxWords = Math.max(maxWords,max);
        max = 1;
        }
        return maxWords;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // int ok = mostWordsFound(sentences);` 
        System.out.println(mostWordsFound(args));
    }
}
