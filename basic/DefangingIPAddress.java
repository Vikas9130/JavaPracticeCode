package basic;

public class DefangingIPAddress {
    public static void main(String[] args) {
        String str = "1.1.1.1";
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            // ch[i] = str.charAt(i);
            if(str.charAt(i) == '.'){
                str.replace('.','[.]');
            }
        }
        // for(int i=0; i<ch.length; i++){
        //     if(ch.charAt(i) == '.'){
        //         ch.replace('.','[.]');
        //     }
        // }
    }
   
    
}
