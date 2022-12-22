package array;

public class SecondLargestFromArray {
    public static boolean isEqual(int[] arr){
        boolean isTrue = false;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    isTrue = true;
                }else{
                    isTrue = false;
                }
            }
        }
        if(isTrue){
            return true;
        }else{
            return false;
        }
    
    }
    public static void main(String[] args) {
        int[] arr = {-1000,-20000,-3000000,-400000};
       
    int large = Integer.MIN_VALUE;
    int secLarge = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
        
        if(large<arr[i]){
            large = arr[i];
           
        }
    }
    System.out.println("lar  :"+large);
  
    for(int i=0; i<arr.length; i++){
       //if(large>arr[i]&&arr[i]<large){
            if(large>arr[i]&&secLarge<arr[i]){
            secLarge = arr[i];
        }
       
    }
if(isEqual(arr)){
    System.out.println("there is no second largest number");
}else{
    System.out.println("second largest"+secLarge);
}
   
    }

    
}
