package string;

import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "This is a String  .";
        String temp = "";

        
        // Scanner sc = new Scanner(str);
        // while(sc.hasNext()){
        //     temp += sc.next();   
        // }
        System.out.println(str.replaceAll("\\s", ""));
    }
    
}
