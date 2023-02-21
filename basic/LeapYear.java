package basic;

public class LeapYear {
    public static void isLeapYear(int year){
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("leap Year.");
                }else{
                    System.out.println("not leap Year.");
                }

            }else{
                System.out.println("leap Year.");
            }

        }else{
            System.out.println("Not leap Year.");
        }
    }
    public static void main(String[] args) {
        int year = 2016;
        isLeapYear(year);
    }
    
}
