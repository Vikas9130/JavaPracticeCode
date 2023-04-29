package secondstring;

public class TruncateSentence {
    public static void main(String[] args) {
        String s = "What is the solution to this problem";
        int k = 4;
        String[] str = new String[k];
        int idx = 0;
        for(int j=0; j<str.length; j++){
            String s1 = "";
            int cnt = 0;
           
            for(int i=idx; i<s.length(); i++){
                
                if(s.charAt(i)!=' '){
                    s1+=s.charAt(i);
                    idx++;   
                }
                if(s.charAt(i)==' '){
                    s1+=' ';
                    idx++;
                    cnt++;
                    break;
                }
                if(cnt==k){
                    break;
                    s1.trim();
                }
            }
            str[j] = s1;
        }
        String result = "";
        for(String i:str){
            result+=i;
        }
        System.out.println(result+"\"");
        

    }
    
}
