package leetcode;

public class LengthLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        String[] str = s.split(" ");
        String temp = str[str.length-1];
        int count = 0;
        for(int i=0; i<temp.length(); i++){
            count++;
        }
        System.out.println(count);
    }
    
}
