package assignment;
/*
 * Wap to compare two string with each other without using built in function
 */
/*
 * solved on 04-01-2023
 * time complexity = O(n2)
 * space complexity = S(1)
 */

public class CompareTwoString {
    public static boolean isCompare(String str1, String str2){
        boolean isTrue = false;
        for(int i=0; i<str1.length(); i++){
                try{
                    if(str1.charAt(i)==str2.charAt(i)){
                        isTrue = true;
                    }
                }catch(Exception e){
                    System.out.println("String can not compare beacuse : " +e);
                    isTrue = false;
                }
                
        }
        return isTrue;
    }
    // public static boolean isCompare(String str1, String str2){
    //     boolean isTrue = false;
    //     if(str1 == str2){
    //         isTrue = true;
    //     }
    //     return isTrue;
    // }
    public static void main(String[] args) {
        String str1 = "Vikas1";
        String str2 = new String("vikas");
        boolean isTrue = isCompare(str1, str2);
        System.out.println(isTrue);
    }
    
}
