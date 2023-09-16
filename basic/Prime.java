package basic;

public class Prime {
    public static void main(String[] args) {
        int num = 16;
        int root = (int)Math.sqrt(num);
        System.out.println(root);
        boolean check = false;
        for(int i=2; i<num; i++){
            if(num%i==0){
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println("the given number is prime number");
        }else{
            System.out.println("not prime");
        }
    }
    
}
