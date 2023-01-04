package assignment;
/*
 * Wap to copy one string to another string without inbuilt function
 */
/*
 * solved on 04-01-2023
 * time complexity = O(n)
 * space complexity = S(1)
 */
public class CopyOneStringToAnother {
    public static String copyString(String str1, String str2){
        for(int i=0; i<str2.length(); i++){
            str1 = str1 + str2.charAt(i);
        }
        return str1;
    }
    public static void main(String[] args) {
        String str1 = "Vikas ";
        String str2 = "Pawar";
        String copy = copyString(str1, str2);
        System.out.println(copy);
    }

    
}
