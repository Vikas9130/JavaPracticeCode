package basic;

public class BreakStatement {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            System.out.println("value of i: " +i);
            for(int j=0; j<5; j++){
                System.out.println("value of j: " +j);
                if(j==3){
                    break;
                }
            }
            // if(i==3){
            //     break;
            // }
           
        }
    }
    
}
