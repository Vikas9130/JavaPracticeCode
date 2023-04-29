package leetcode;

public class CountAsterisks {
    public static void main(String[] args) {
        String s = "*yo|uar|e**|b|e***au|tifu|l";
        boolean inBetween = false;
        int count = 0;
        for(char i:s.toCharArray()){
            if(i=='*'&&!inBetween){
                count++;
                System.out.println(count);
            }
            if(i=='|'){
                inBetween = !inBetween;
                System.out.println(inBetween);
            }
        }
    }
    
}
