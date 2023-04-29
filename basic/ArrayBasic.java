package basic;
public class ArrayBasic {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        int[] b;
        int[] c;
        b=a;
        c = b;
        b[0] = 10;
        b[1] = 20;
        c[0] = 100;
        a = new int[]{1000,2000};
        for(int i:b){
            System.out.println(i);
        }
    }
    
}
