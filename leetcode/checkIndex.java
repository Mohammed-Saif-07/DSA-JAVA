package leetcode;

public class checkIndex {
    public static void main(String[] args) {
        int arr1[]={4,3,2,3,1};
        int arr2[]={2,2,5,2,3,6};
        for(int i = 0;i<arr1.length;i++){
            for(int j = 0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(i+","+j);
                    break;
                }
            }
        }

    }
}
