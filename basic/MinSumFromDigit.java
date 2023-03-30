package basic;

import java.util.HashSet;
import java.util.Random;

public class MinSumFromDigit {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        int num = 2932;
        int temp = num;
        int rem;
        while(temp>0){
            rem = temp%10;
            hs.add(rem);
            temp = temp/10;    
        }
        // for(int i:tree){
        //     System.out.println(i);
        // }
       // convert HashSet to an array
       Integer[] arrayNumbers = hs.toArray(new Integer[hs.size()]);
  
       // generate a random number
       Random rndm = new Random();
       int n1 = 0;
       int n2 = 0;
       for(int a=0; a<1;a++){
        int rndmNumber = rndm.nextInt(hs.size());
        int rndmNumber1 = rndm.nextInt(hs.size());
        n1=arrayNumbers[rndmNumber]*10+arrayNumbers[rndmNumber1];
        for(int b=0; b<1;b++){
            int rndmNumbera = rndm.nextInt(hs.size());
            int rndmNumberb = rndm.nextInt(hs.size());           
            n2=arrayNumbers[rndmNumbera]*10+arrayNumbers[rndmNumberb];            
        }
       }
       System.out.println(n2);
       System.out.println(n1);
   

 
    }
    
}
