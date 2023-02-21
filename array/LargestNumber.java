package array;

public class LargestNumber {
    public static int largestNumber(int[] arr){
        int large = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(large<arr[i]){
                large = arr[i];
            }
        }
        return large;
    }
    public static void main(String[] args) {
        int[] arr = {0,-1,-2,-3};
        System.out.println(largestNumber(arr));

    }
    
}
