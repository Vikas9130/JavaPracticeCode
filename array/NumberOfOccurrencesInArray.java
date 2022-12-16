package array;

public class NumberOfOccurrencesInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,3,4,1,2,3,4,1,1};
        int size = arr.length;
        int count = 1;
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i]==arr[j]&&arr[i]!=-1){
                    count++;
                    arr[j] = -1;
                }
            }
            if(count>=1 &&arr[i]!=-1){
                System.out.println("The element : "+arr[i]+" is come :"+count);
                count=1;
            }

        }
           
            
        
    }
    
}
