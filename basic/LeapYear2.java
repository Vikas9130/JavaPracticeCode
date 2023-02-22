package basic;

public class LeapYear2 {
    public static void isLeapYear(int year){
        if((year%400==0)||((year%4==0) && (year%100!=0))){
            System.out.println("leap Year.");
        }else{
            System.out.println("not leap Year.");
        }
    }
    public static void main(String[] args) {
        int year = 2016;
        isLeapYear(year);
    }
    
}
