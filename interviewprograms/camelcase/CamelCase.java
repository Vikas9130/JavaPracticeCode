package interviewprograms.camelcase;

public class CamelCase {
    private String str = "";
    void acceptString(String str){
        this.str = str;
    }
    
    void convertToCamelCase(){
        StringBuilder sb = new StringBuilder();
        String[] strArr = str.split(" ");
        for(int i=0; i<strArr.length; i++){
            String temp = strArr[i];
            //first character get and convert to upper case
            char ch = Character.toUpperCase(temp.charAt(0));
            sb.append(ch);
            //remaining string
            String upperCase = temp.substring(1);
            sb.append(upperCase);  
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        CamelCase cc = new CamelCase();
        String str = "Here comes the garden";
        cc.acceptString(str);
        cc.convertToCamelCase();
    }    
}
