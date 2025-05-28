package leetcode;

public class shuffle {
    public static void main(String[] args) {
        String str = "codeleet";
        int arr[]={4,5,6,7,0,2,1,3};
        char[] Chars = new char[str.length()];
        for(int i = 0;i<str.length();i++){
            Chars[arr[i]] = str.charAt(i);
        }
        System.out.println(Chars);
    }
}
