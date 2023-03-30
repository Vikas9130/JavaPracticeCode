import java.util.Arrays;

public class HighAlti {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int diff = 0;
        int alti = 0;

        int[] arr = new int[gain.length+1];
        arr[0] = 0;

        
        for(int i=0; i<gain.length; i++){
            diff = arr[i] + gain[i];
            arr[i+1] = diff;
        }
       
        for(int i:arr){
            System.out.print(i+" ");
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                alti = 0;
            }else{
                alti = arr[i];
            }
        }
        System.out.println(alti);
    }
    
}
