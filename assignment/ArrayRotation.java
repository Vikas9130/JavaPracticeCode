package assignment;
/*
   Assignment 7 : Program for array rotation
   Given an array of integers arr[] of size N and an integer, 
   the task is to rotate the array elements to the left by d positions.
 */
/*solved on 27-12-2022
  time complexity = O(4n)
  space complexity = S(1);
*/


public class ArrayRotation {
    public static int[] rotateArray(int size, int[] arr, int pos){
        int[] temp = new int[size];
        int count = 0;
        for(int i=pos; i<size; i++){    
                temp[count++] = arr[i]; 
        }
        for(int i=0; i<pos; i++){
            temp[count++] = arr[i];
        }
        for(int i=0; i<size; i++){
            arr[i] = temp[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6, 7, 1, 2};
        int pos = 2;
        int size = arr.length;
        int[] roArray = rotateArray(size, arr, pos);
        for(int i=0; i<size; i++){
            System.out.print(roArray[i]+" ");
        }
    }
    
}
