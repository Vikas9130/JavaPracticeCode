package array;

/**
 * TargetElement
 */
public class TargetElement {

    public static void main(String[] args) {
        int[] arr ={6,8,4,-5,7,9};
        int target=15;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (target-arr[i] == arr[j]) {
                    System.out.println(i+"  "+j);
                }
            }
        }
    }
}