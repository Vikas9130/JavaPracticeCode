public class InerchangeArray {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,4,3,2,1};
        int n= 4;
        int[] result = new int[2 * n];
        for (int i = 0; i < n; ++i) {
            result[2 * i] = nums[i];    //even index
            result[2 * i + 1] = nums[n + i];    //odd index
        }
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
    
}
