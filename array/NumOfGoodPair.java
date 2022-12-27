package array;

public class NumOfGoodPair {
    public static void findGoodPair(int size, int[] arr){
        int count = 0;
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(arr[i] == arr[j] && i<j){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int size = arr.length;
        findGoodPair(size, arr);
        
    }
    
}
