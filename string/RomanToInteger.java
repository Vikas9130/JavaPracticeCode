package string;

public class RomanToInteger {
    public static void main(String[] args) {
        String str = "MCMXCIV   ";
        int number = 0;
        str = str.replace("IV", "IIII");
        str=str.replace("IX","VIIII");
        str=str.replace("XL","XXXX");
        str=str.replace("XC","LXXXX");
        str=str.replace("CD","CCCC");
        str=str.replace("CM","DCCCC");
        System.out.println(str);
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='I'){
                number += 1;
            }
            if(str.charAt(i)=='V'){
                number += 5;
            }
            if(str.charAt(i)=='X'){
                number += 10;
            }
            if(str.charAt(i)=='L'){
                number += 50;
            }
            if(str.charAt(i)=='C'){
                number += 100;
            }
            if(str.charAt(i)=='M'){
                number += 1000;
            }
            if(str.charAt(i)=='D'){
                number += 500;
            }
        }
        System.out.println(number);
    
    }
    
}
