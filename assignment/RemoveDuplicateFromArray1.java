package assignment;

public class RemoveDuplicateFromArray1 {

    public static void removeDuplicate(int size, int[] arr){
        int[] secArr = new int[size];
        int count = 0;
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }  
            }
        }
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();

        for(int i=0; i<size-1; i++){
            if(arr[i] != arr[i+1]){
                secArr[count++] = arr[i];
            }
            
        }
        System.out.println(count);
        secArr[count++] = arr[size-1];
        for(int i=0; i<count; i++){
            arr[i] = secArr[i];
        }
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {-1,-2,-5,0,-6,-1,6,5,4,8};
        int size = arr.length;
        removeDuplicate(size, arr);
    }
    
}
