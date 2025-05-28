package leetcode;

public class truncate {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 17;
        // if (str.length() <= length) {
        //     System.out.println(str);
        // } else {
        //     System.out.println(str.substring(0, length));
        // }
        int count = 0;
        int index = 0;
        for(index = 0; index < s.length(); index++){
            if(s.charAt(index) == ' ')
                count++;   
            if(count==k)
                break;   
        }
        System.out.println(s.substring(0,index));
    }
    }

