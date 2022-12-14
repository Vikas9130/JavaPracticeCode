package string;

import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args) {
        String[] str = {"hello","world","!"};
        System.out.println("before convert");
        for(int i=0; i<str.length; i++)
            System.out.print(str[i]+" ");

        //using Arrays toString()method
        // String str1=null;
        // str1 = Arrays.toString(str);
        // System.out.println("\nafter convert");
        // System.out.println(str1);  

        //using StringBuilder append() method
    //     StringBuilder sb= new StringBuilder();
    //   System.out.println("\nafter convert");
    //     for(int i=0; i<str.length;i++){
    //         sb.append((str[i]));
    //     }
    //sb.toString();
    //     for(int i=0; i<sb.length();i++){
    //         System.out.print(sb.charAt(i)+" ");
    //     }

    //using String.Join() method
    String strNew =String.join(" ",str);
    System.out.println("\nafter convert.");
    System.out.println(strNew);
       
        
        

    }
    
}
