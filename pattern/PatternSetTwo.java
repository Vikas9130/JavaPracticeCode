package pattern;

public class PatternSetTwo {
    public static void main(String[] args) {
        pattern2(5);
    }

    public static void pattern2(int n){
        int count = n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n*2; j++){
                if(count==j){
                    for(int k=1; k<=n*2;k++){
                        if(i==1||j==1||i==n||j==n){
                            System.out.print(" * ");
                        }else{
                            System.out.print("   "); 
                        }
                        
                    }
                }else{
                    System.out.print("   ");
                }
            }
            count--;
            System.out.println();
        }
    }

    public static void pattern1(int n){
        int count = n;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n*2; j++){
                if(count==j){
                    for(int k=1; k<=n;k++){
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
    
}
