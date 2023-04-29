package leetcode;

public class ReplaceAllDigitsCharacters {
    public static void main(String[] args) {
        String s = "a1c1e1";
        StringBuilder sb = new StringBuilder();
        for(char i:s.toCharArray()){
            //97
            if(i>=97&&i<=126){
                sb.append(i);
            }else{
                sb.append(i);
                System.out.println((int)i);
            }
        }
        System.out.println(sb.toString());
    }
    
}
