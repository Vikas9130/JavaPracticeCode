package pattern;

public class PattenSetFive {
    public static void main(String[] args) {
        pattern1(9);
        
        }
    
//inverted pyramid
    public static void pattern3(int n){


    }    
//hollow pyramid
    public static void pattern2(int n){
        int count = n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=count-1;j++){
                System.out.print("   ");
            }
            for(int k=1; k<=2*i-1; k++){
                if(k==1||i==n||k==2*i-1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
                
            }
            count--;
            System.out.println();
        }
    }
//pyramid
    public static void pattern1(int n){
        int temp = n;
        for(int i=1; i<=n; i++){
            
            for(int j=1; j<=temp-1; j++){
                System.out.print("   ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print(" * ");
            }
            temp--;
            System.out.println();
        }
    }
    
}
