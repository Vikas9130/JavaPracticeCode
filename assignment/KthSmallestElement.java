package assignment;
/*
 Assignment1 : Find the Kth smallest element?
 Given an array arr[] and an integer K where K is smaller than size of array,
 the task is to find the Kth smallest element in the given array. 
 It is given that all array elements are distinct.
 */
/*
 * solved on 28-12-2022
 * time complexity = O(n2)
 * space complexity = S(1)
 */

public class KthSmallestElement {

    public static int kthSmallestEle(int size, int[] arr, int k){
        //sort the array
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        if(k>0){
            return k = arr[k-1];
        }else{
            return -1;
        }


    }
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 20, 15};
        int size = arr.length;
        int k = 4;
        int find = kthSmallestEle(size, arr, k);
        System.out.println(find);
        
    }
    
}
