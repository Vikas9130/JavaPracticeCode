package array;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6};
        int count=0;
        int[] arr2=new int[arr.length-1];
        int removeIndex=0;
        for (int i = 0; i < arr.length; i++) {
            if (i==removeIndex) {
                continue;
            }else{
                arr2[count++]=arr[i];
            }
        }
        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
