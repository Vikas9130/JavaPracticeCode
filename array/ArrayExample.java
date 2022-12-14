package array;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = {1,2,7,10};
        //int size = arr.length-1;
        int temp = 0;
        //int j =0;
        int min = arr[arr.length-1];
        //int[] t = new int[min];
        for(int i=1; i<min; i++){
            // ++temp; 
            // if(temp==arr[j]){
            //     System.out.print("");
            //     j++; 
            // }else{
            //     System.out.print(temp+" ");
            //     if(j!=size){
            //         j++;
            //     }
              if (i == arr[temp]) {
                temp++;
                continue;
              } else {
                System.out.print(i+" ");
              }      
                 
            }
        }
    
    
    }

