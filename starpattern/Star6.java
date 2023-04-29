package starpattern;

public class Star6 {
    public static void main(String[] args) {
        for(int i=1; i<5; i++){
            for(int j=3; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }

            
            System.out.println();
        }
        for(int i=2; i<5; i++){
            for(int j=1; j<5; j++){
                if(j>=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    
}
