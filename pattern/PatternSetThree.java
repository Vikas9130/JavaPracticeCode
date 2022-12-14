package pattern;

public class PatternSetThree {
    public static void main(String[] args) {
        pattern8(9);
    }

    public static void pattern8(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                if(i==j||j==1||i==n){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern7(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("   ");
            }
            for(int k=i; k<=n; k++){
                System.out.print(" * ");
            }
           
            System.out.println();
        }

    }

    public static void pattern5(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i==j||j==1||i==n)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

    public static void pattern3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("   ");
            }
            for(int k=1; k<=n; k++){
                if(i==1||i==n||k==1||k==n)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }

    }

    public static void pattern2(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print("   ");
            }
            for(int k=1; k<=n; k++){
                System.out.print(" * "); 
            }
            System.out.println();
        }
    }

    public static void pattern1(int n){
        for(int i=1; i<=n; i++){
            for(int j=n; j>i;j--){
                System.out.print("   ");
            }
            for(int k=1; k<=n; k++){
                if(i==n||i==1||k==1||k==n)
                    System.out.print(" * ");
                else
                System.out.print("   ");
                    
            }
            System.out.println();
        }
    }
    
}
