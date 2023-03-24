package basic;

public class IntToBinaryString {
    public static void main(String[] args) {
        int num = 00000000000000000000000000001011;
        int count = 0;
        while (num != 0) {
            count += num & 1;
            System.out.print(num+" ");
            num >>>= 1;
            System.out.print(num+" ");
        }
      
       
    }
    
}
