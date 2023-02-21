package basic;

public class EvenOddNumber {
    public static void checkEvenOdd(int num){
        if(num%2 == 0){
            System.out.println(num + " : is even.");
        }else{
            System.out.println(num +  " : is odd.");
        }
    }
    public static void main(String[] args) {
        int num = 91;
        checkEvenOdd(num);
    }
    
}
