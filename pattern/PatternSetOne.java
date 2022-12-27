package pattern;



public class PatternSetOne {
    public static void main(String[] args) {
        pattern1(9);
    }

    public static void pattern5(int n){
        int count = n;
        for(int i=1; i<=n; i++){      
            for(int j=1; j<=n*2; j++){
                if(count==j){
                    for(int cat = count; cat <=count+n;cat++){
                        System.out.print(" * ");
                    }                    
                }else{
                    System.out.print("   ");
                } 
            }
            count--;
            System.out.println();
        }
    }

    public static void pattern4(int n){
        int count = n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1||i==n||j==1||j==n||i==j||count==j){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            count--;
            System.out.println();
        }
    }

    public static void pattern3(int n){
        int count = n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n;j++){
                if(i==1||j==1||i==n||j==n||count==j){
                        System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }   
            }
            count--;
            System.out.println();
        }
    }

    public static void pattern2(int n){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                        if(i==1||i==n||j==1||j==n||i==j){
                            System.out.print(" * ");
                        }else{
                            System.out.print("   ");
                        }
                }
                System.out.println();
            }
    }

    public static void pattern1(int n){
        for(int i=1; i <=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1||j==1||i==n||j==n){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }


    
}
