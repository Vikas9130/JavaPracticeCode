package polymorphism;

import javax.print.attribute.standard.MediaSize.NA;

class Nana{
    String name;
    public Nana(String name){
        this.name=name;
    }
    public void proprities(){
System.out.println(name+" have higest priorities.");
    }
    public void showName(){
        System.out.println(this.name);
    }
}
class Vikas extends Nana{
    public Vikas(String name){
        super(name);
    }
    public void proprities(){
        System.out.println(super.name+"have second highest priorites");
    }

}
class Vijay extends Nana{
    public Vijay(String name){
        super(name);
    }
    public void proprities(){
        System.out.println(super.name+"have third high priotities.");
    }
}

public class PolymorphismEx3 {
    public static void main(String[] args) {
        Nana nana = new Nana("father");
        Nana n = new Vikas("First born son.");
        Nana n1 = new Vijay("second born son.");
        nana.showName();
        nana.proprities();
        n.showName();
        n1.showName();
        n.proprities();
        n1.proprities();
        
    }
    
}
