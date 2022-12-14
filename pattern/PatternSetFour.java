package pattern;

public class PatternSetFour {
    public static void main(String[] args) {
        pattern4(9);
    }

    public static void pattern4(int n){
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                if(i==1||j==n||i==j)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i;j++){
                System.out.print("   ");
            }
            for(int k=n; k>=i;k--){
                if(k==i||k==n||i==1)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void pattern1(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("   ");
            }
            for(int k=n; k>=i;k--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    
}
