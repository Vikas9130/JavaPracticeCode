package string;
public class CheckStringContentIngnoringCase{
    public static void main(String[] args) {
        String str1 = "Vikas";
        String str2 = new String("vikas");
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("equals");
        }else{
            System.out.println("not equal");
        }
    }

}