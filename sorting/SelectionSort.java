package sorting;

public class SelectionSort {

    public static void selectionSort(int arr[], int size){
        int min = 0, temp = 0;
        for(int i=0; i<size; i++){
            min = i;
            for(int j=i+1; j<size; j++){
                if(arr[j]<arr[min]){
                    min = arr[j];
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for(int i=0; i<size; i++){
            System.out.println(arr[i]+ " ");
         }
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int size = arr.length;
        selectionSort(arr, size);
      
        
    }
    
}
