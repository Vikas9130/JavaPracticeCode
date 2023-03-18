package array;

public class MinMaxNumFromArray {
    public static void main(String[] args) {
        int[] arr = {-11,5,4,3,-22,6};
        int min = arr[0];
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    if( arr[i]<=min){
                        min = arr[i];
                    }
                }
                if(arr[i]>arr[j]){
                    if(arr[i]>max){
                        max = arr[i];
                    }
                }
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
    
}
