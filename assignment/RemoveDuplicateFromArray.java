package assignment;

public class RemoveDuplicateFromArray {

    public static void removeDuplicateEle(int size, int[] arr){

        //int[] temp = new int[size];
        int count = 0;
        int[] temp=new int[count];
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(arr[i] > arr[j]){
                    int swap = arr[i];
                    arr[j] = arr[i];
                    arr[j] = swap;
                }
                if(arr[i] != arr[j]){
                 temp = new int[count];
                  temp[count] = arr[i];
                  count++;
                }   
            }
        }
        for(int i=0; i<count; i++){
            arr[i] = temp[i];
            System.out.print(arr[i]+" ");
        }
        

       
    }
    public static void main(String[] args) {
        int[] arr= {5,4,2,7,9,1};
        int size = arr.length;
        removeDuplicateEle(size, arr);

        
    }
    
}
