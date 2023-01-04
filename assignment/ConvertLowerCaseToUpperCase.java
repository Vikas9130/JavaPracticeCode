package assignment;
/*
 * Wap to calculate convert lower case string to upper case without using inbuild function
 */
/*
 * solved on 04-01-2023 but some test cases not passed
 * time complexity = O(n2)
 * space complexity = S(1)
 */
public class ConvertLowerCaseToUpperCase {
    public static String toUpperCase(String str){
        String temp = "";
        String upLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String loLetter = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<str.length(); i++){
            for(int j=0; j<upLetter.length(); j++){
                if(str.charAt(i)==upLetter.charAt(j) || str.charAt(i)==loLetter.charAt(j)){                
                        temp = temp + upLetter.charAt(j);
                }
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        String str = "Vikas Maruti Pawar";
        String temp = toUpperCase(str);
        System.out.println(temp);
        
    }
    
}
