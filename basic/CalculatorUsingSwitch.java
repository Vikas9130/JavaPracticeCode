package basic;

public class CalculatorUsingSwitch {
    public static void calculator(int a, int b, char symbol){
       float result = 0;

        switch(symbol){
            case '+':
                    result = a + b;
                    System.out.println("addition is : " + result);
                    break;
            case '-':
                    result = a-b;
                    System.out.println("substraction is : "+result);
                    break;
            case '/':
                    result = a/b;
                    System.out.println("division is : "+result);
                    break;
            case '*':
                    result = a*b;
                    System.out.println("multiplication is : "+result);
                    break;
            default :
                    System.out.println("Provide valid symbol.");
        }

    }
    public static void main(String[] args) {
        int a=10, b=20;
        char symbol = '*';
        calculator(a, b, symbol);
    }
    
}
