public class SortingArray {

    public static void sortArray(int[] arr, int num){
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0; i<arr.length-1;i++){
            System.out.print(arr[i] + " ");
            if(arr[i]==num){
                System.out.print(" .."+ i + ".. ");
            }else if(arr[i]>num){
                System.out.print(" .."+ (i+1) + ".. ");
            }else if(arr[i]<num&&arr[i+1]>num){
                System.out.print(" .."+ (i+1) + ".. ");
            }
           
        
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        
        int num = 7;
        sortArray(arr, num);
    }
    
}
