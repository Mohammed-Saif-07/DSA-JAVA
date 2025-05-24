// Given a string of characters, find the length of the longest proper prefix which is also a proper suffix.

// NOTE: Prefix and suffix can be overlapping but they should not be equal to the entire string.

// Example 1:

// Input: s = "abab"
// Output: 2
// Explanation: "ab" is the longest proper 
// prefix and suffix. 

package DynamicProgramming;

class prefixxSuffix{
    public static int LPS(String str,int size,int lps[]){
        int prefix = 0;
        int suffix = 1;
        lps[0] = 0;
        while(suffix<size){
            if(str.charAt(suffix)==str.charAt(prefix)){
                prefix++;
                lps[suffix] = prefix;
                suffix++;
            }
            else{
                if(prefix != 0){
                    prefix = lps[prefix-1];
                }else{
                    lps[suffix] = prefix;
                    suffix++;
                }
            }
        }
        //
        return(lps[size-1]);
    }
    public static void main(String[] args) {
        String str = "abab";
        int size = str.length();
        int lps[] = new int[size];
        System.out.println(LPS(str,size,lps ));
    }
}
