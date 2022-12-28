package assignment;
/*
  Assignment 2 : Sort an array of 0s, 1s and 2s
  Given an array of size N containing only 0s, 1s, and 2s;
  sort the array in ascending order.
 */
/*
 * solved on 28-12-2022
 * time complexity = O(n2)
 * space complexity = S(1)
 */
public class SortInAscendingOrder {
    public static int[] sortInAscending(int size, int[] arr){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int arr[] = {0, 1, 0};
        int size = arr.length;
        int[] temp = sortInAscending(size, arr);
        for(int i: temp){
            System.out.print(i+" ");
        }
        
    }
    
}
