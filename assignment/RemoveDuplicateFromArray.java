package assignment;

public class RemoveDuplicateFromArray {

    public static int removeDuplicateEle(int size, int[] arr){
        int count = 0;
        int[] temp = new int[size];
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(arr[i] < arr[j]){
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
        for(int i=0; i<size-1; i++){
            if(arr[i] != arr[i+1]){
                temp[count++] = arr[i];
            }
        }
       
        temp[count++] = arr[size-1];
        for(int i=0; i<count; i++){
            arr[i] = temp[i];
        }
       
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,2,2,2};
        int size = arr.length;
        int newV = removeDuplicateEle(size, arr);
       for(int i=0; i<newV; i++){
        System.out.print(arr[i]+" ");
       }
        
    }

   
    
}
