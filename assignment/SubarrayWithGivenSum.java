package assignment;
/*
 Assignment3 :  Subarray with given sum
Given an unsorted array A of size N that contains only non-negative integers, 
find a continuous sub-array which adds to a given number S. 
In case of multiple subarrays, return the subarray which comes 
first on moving from right to left.
 */
/*
 * not solved on 28-12-2022
 * some test cases have not been passed
 */

public class SubarrayWithGivenSum {

    public static int[] findSubarray(int size, int[] arr, int s){
        int sum = 0;
        int count = 0;
        int[] temp = new int[size];
        for(int i=0; i<size; i++){
            if(arr[i]>=0){
                for(int j=size-1; j>=i; j--){
                    
                        sum = sum + arr[j];
                        temp[j] = j;
                    
                   
                    if(s == sum){
                        break;
                    }
                }
            }
            if(s == sum){
                break;
            }
            sum = 0;
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] arr =   {1,2,3,4,5,6,7,8,9,10};
        int size = arr.length;
        int s = 15;
        int[] temp = findSubarray(size, arr, s);
        
        for(int i : temp){
            if(i>0){
                System.out.print(i+" ");
            }
            
        }
        
        
    }
    
}
