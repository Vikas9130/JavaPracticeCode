package array;

public class AscendingArray {
    public static void main(String[] args) {
        int[] arr = {5,3,6,4,1};
        //int[] temp = new int[arr.length];
        int temp = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]<arr[j]){
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
            }    
        }
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    
}
