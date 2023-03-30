package string;

public class MaxWord {
    public static void main(String[] args) {
        String[] str = {"t qnul iuld","uqvw nn idox"};
        //String[] str = {"alice and bob love leetcode","i think so too","this is great thanks very much"};
       
        int secCount = 1;
        for(int i=0; i<str.length;i++){
             int count = 1;
            if(count<=secCount){
                String sting = str[i];
                for(int j=0; j<sting.length();j++){
                    if(sting.charAt(j)=='\s'){
                        count++;
                    }
                }
                secCount = count;  
                count = 1;
            }   
        }      
        System.out.println(secCount);
        
       
    }
    
}
