package leetcode;

import java.util.*;
public class firstPal {
    public static boolean isPal(String str){
        int s = 0;
        int e = str.length()-1;
        while(s<e){
            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    public static String first(String[] words){
        for(String x : words){
            if(isPal(x)){
                return x;
            }
        }
        return "no pal";
    }
    public static void main(String[] args) {
        String words[]={"abc","car","racecar","cool","ada"};
        System.out.println(first(words));
    }
}
