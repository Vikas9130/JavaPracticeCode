package assignment;
/*
 * 2. How to reverse words in a sentence without using a library method?
Write a function, which takes a String word and returns sentence on which words
are reversed in order like if the input is "Java is best programming language",
the output should be "language programming best is Java".
 */
/*
 * not solved on 04-01-2023
 */
public class ReverseWordInSentence {
    public static String reverseWords(String str){
        String temp = "";
        for(int i=0; i<str.length(); i++){
            temp = temp + str.charAt(i);
        }
        return temp;
    }
    public static void main(String[] args) {
        String str = "This is my sentence.";
        String temp = "";
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            
            if(str.charAt(i)!=' '){
                temp = temp + str.charAt(i);
            }else{
                temp = temp + " ";
                String count = "";
                for(int j=0; j<temp.length(); j++){
                    count = count + temp.charAt(j);
                }
                rev = rev + reverseWords(count);
                //temp = null;
                
            }
        }
        System.out.println(rev);
         
    }

    
}
