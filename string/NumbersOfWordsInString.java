package string;

public class NumbersOfWordsInString {
    public static void main(String[] args) {
        String str ="Initializ,";
        int count = 0;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)==' '||str.charAt(i)=='.'||str.charAt(i)=='\n')
                count++; 
                     
        }
    //     int last = str.length()-1;
    //     if(str.charAt(last)!=' '||str.charAt(last)!='.')
    //         count++;
        System.out.println(count);  
    }
    
}
