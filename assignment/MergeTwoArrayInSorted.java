package assignment;
/*
  Assignment 6 : Merge two sorted arrays
  Given two sorted arrays, the task is to merge them in a sorted manner.
 */
/*
  solved on 27-12-2022
  time complexity = O(2n+n2)
  space complexity = S(1)
 */

public class MergeTwoArrayInSorted {

    public static int[] mergeTwoArray(int sizeOfArr1, int sizeOfArr2, int[] arr1, int[] arr2){
        int[] arr3 = new int[sizeOfArr1+sizeOfArr2];
        int count = 0;
        for(int i=0; i<sizeOfArr1; i++){
            arr3[count++] = arr1[i];
        }
        for(int i=0; i<sizeOfArr2; i++){
            arr3[count++] = arr2[i];
        }
        for(int i=0; i<count; i++){
            for(int j=0; j<count; j++){
                if(arr3[i] < arr3[j]){
                    int temp = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = temp;
                }
            }
        }
        return arr3;

    }
    public static void main(String[] args) {
        int[] arr1 = { 5, 8, 9};
        int[] arr2 = { 4, 7, 8};
        int sizeOfArr1 = arr1.length;
        int sizeOfArr2 = arr2.length;

        int[] arr = mergeTwoArray(sizeOfArr1, sizeOfArr2, arr1, arr2);
        for(int i: arr){
            System.out.print(i+" ");
        }


    }
    
}
