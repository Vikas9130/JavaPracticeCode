package array;

public class MergeTwoArray {
    public static void mergeArray(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length+arr2.length];
        int temp = 0;
        for(int i=0; i<arr1.length; i++){
            arr[temp] = arr1[i];
            temp++;
        }
        for(int i=0; i<arr2.length; i++){
            arr[temp] = arr2[i];
            temp++;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6,7};
        mergeArray(arr1, arr2);
    }
    
}
