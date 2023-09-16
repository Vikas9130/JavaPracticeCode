package inheritance;

interface GrandFather {
     long property = 1L;
     void showProperty();
}
interface Father{
    long property1 = 2L;
    void showProperty();
}
class Child implements GrandFather, Father{
   public void showProperty(){
        System.out.println("total property = "+(property+property1));
    }
 

}


public class InheritanceEx2 {
    public static void main(String[] args) {
        Child c1 = new Child();
    c1.showProperty();
   
    }
    
    
}
