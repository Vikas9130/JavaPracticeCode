package basic;

public class FactorialUsingRecursion {
    public static int factorialUsingRecursion(int num){
     
        if(num==0)
            return 1;
        else
            return num * factorialUsingRecursion(num-1);
        
    }
    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorialUsingRecursion(num));
    }
}
