
public class ZigZagConversion {

    public static void main(String[] args) {
        String str ="PAYPALISHIRING";
        int row=3;
        for (int i = 1; i <=row; i++) {
        int count=0;
            for (int j = 0; j <str.length() ; ) {
                if (i ==1 || i/2!=0) {
                    System.out.print(str.charAt(j)+" ");
                    j+=4;                  
                }else{
                    System.out.print(str.charAt(j)+" ");
                    j+=2;
                }
            }
            System.out.println();
            
        }
    }
}