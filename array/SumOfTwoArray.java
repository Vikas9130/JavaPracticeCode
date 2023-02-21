package array;

public class SumOfTwoArray {
    public static int sumOfTwo(int[] arr1, int[] arr2){
        int sum=0;
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<arr1.length; i++){
            sum1 = sum1 + arr1[i];
        }
        for(int j=0; j<arr2.length; j++){
            sum2 = sum2 + arr2[j];
        }
        sum = sum1 + sum2;

        return sum;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        System.out.println(sumOfTwo(arr1, arr2));  
}
