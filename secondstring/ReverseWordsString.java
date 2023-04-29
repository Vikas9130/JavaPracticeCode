package secondstring;

public class ReverseWordsString {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        for(String word:arr){
            StringBuilder temp = new StringBuilder();
            temp.append(word);
            temp.reverse();
            sb.append(temp+" ");
        } 
        // return sb.toString().trim();
        String st = sb.toString().trim();
        System.out.println(st+"\"");
        
    }
    
}
