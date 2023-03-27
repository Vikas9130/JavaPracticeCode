package basic;

public class Wealthy {
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        int sumOfI=0;
        int sumOfJ = 0;
        int sumOfK = 0;
        int size = accounts.length;
        for(int i=0; i<size;i++){
            sumOfI = sumOfI + accounts[i];
            for(int j=0; j<size; j++){
                sumOfJ = sumOfJ + accounts[j];
                for(int k=0; k<size; k++){
                    sumOfK = sumOfK  +accounts[k];
                }
            }

        }
        if(sumOfI>=sumOfJ && sumOfI>=sumOfK){
            return sumOfI;
        }else if(sumOfJ>=sumOfI && sumOfJ>=sumOfK){
            return sumOfJ;
        }else{
            return sumOfK;
        }
    }
    
}
