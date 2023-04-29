package secondstring;

public class SplitStringinBalancedStrings {
    public static void main(String[] args) {
        String s = "RLRRRLLRLL";
        char[] arr = s.toCharArray();
        int t =0;
        int y=0;
        int temp = 0;
        for(int i=0; i<arr.length; i++){
            if(s.charAt(i)=='R'){
                t++;
            }else{
                y++;
            }
            if(t==y){
                temp++;
            }
        }
        System.out.println(t);
        System.out.println(y);
        System.out.println(temp);
        
    
    }
    
}
