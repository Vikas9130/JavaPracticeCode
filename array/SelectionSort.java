package array;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-100,10,100,20,30,90,40,50,60,70,80,5,5,-1};
        int size = arr.length;
        int min, temp = 0;
        for(int i=0; i<size; i++){
            min = i;
            for(int j=i+1; j<size; j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int i=0; i<size; i++){
            System.out.print(arr[i] +" ");
        }
    }
    
}
