package basic;

import java.util.Scanner;

public class MakingNumberFromDigits {

    public static int[] acceptDigit(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how larger number you want to make:");
        int large = sc.nextInt();
        System.out.println("Enter digits :");
        int i=0;
        int digit[] = new int[large];
        while(i<large){
            digit[i] = sc.nextInt();
            i++;
        }
        return digit;
    }
    public static int makeNumber(int[] digit ){
        int num = 0;
        int i=0;
        while(i<digit.length){
            num = (num*10)+digit[i];
            i++;
        }
      
        
        return num;
    }
    public static void main(String[] args) {
        int digit[] = acceptDigit();
        int number = makeNumber(digit);
        System.out.println("Made number is : "+ number);
        
    }
    
}
