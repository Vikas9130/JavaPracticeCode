package leetcode;

/**
 * Leetcode1769
 */
public class Leetcode1769 {

    public static void main(String[] args) {
        int[] arr = {0,0,1,0,1,1};
        String boxes = "001011";
        int[] arr1 = new int[boxes.length()];
        int z=0;
        for(char c:boxes.toCharArray()){
            arr1[z]=c-'0';
            z++;
        }

        int[] num = new int[arr1.length];
        for(int i=0; i<arr1.length; i++){
            int temp = 0;
            for(int j=0; j<arr1.length; j++){
                if(i!=j){
                    if(arr1[j]>0){
                        int temp2 = Math.abs(i-j);
                        temp+=temp2;
                    }
                }
            }
            num[i] = temp;
        }
        for(int k:num){
            System.out.print(k+" ");
        }
    }
}