package basic;

public class ArrayEg {
    public static void change(int[] arr){
        arr[0] = 10;
        arr[1] = 20;
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        //int[] arr=new int[-4];
        change(new int[2]);

    }
    
}
