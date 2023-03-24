package basic;

public class ArmStronNumber {
    public static void main(String[] args) {
     int num = 153;
     int temp = num;
     int count = 0;
     int rem;
     int arm = 1;
     while(temp>0){
        temp = temp/10;
        count++;
     } 
     temp = num;
     while(temp>0){
        rem = temp%10;
        arm += Math.pow(rem, count);
        temp = temp/10;
     } 
     if(num==arm){
        System.out.println("Armstong number");
     } else{
        System.out.println("number is not armstrong");
     }
    }
    
}
