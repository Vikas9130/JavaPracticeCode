package array;

public class ContainsDuplicate {
    public static boolean duplicateEle(int n, int[] arr){
        boolean bool = false;
        for(int i=0; i<n-1; i++){
            for(int j=1; j<n; j++){
                if(i != j){
                    if(arr[i]==arr[j]){
                        bool = true;
                    }
                }  
            }       
        }    
        return bool;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;
        boolean bool = duplicateEle(n, arr);
        System.out.println(bool);

    }
    
}
