package inheritance;

class Animal{
    public int publicVar = 1;
    private int privateVar = 2;
    protected int protectedVar = 3;
    int defaultVar = 4;
    public String name;
    public Animal(String name){
        this.name=name;
    }
    public void eat(){
        System.out.println(name+"is eating.");
    }
    public void run(){
        System.out.println(name+"is running.");
    }
}
class Dog extends Animal{
    public void showVar(){
        System.out.println("public: "+publicVar);
        //System.out.println("private: "+privateVar);
        System.out.println("protected: "+protectedVar);
        System.out.println("default: "+defaultVar);

    }
    //private String name;
    public Dog(String name){
        super(name);
        //this.name=name;
    }
    public void bark(){
        System.out.println(name+"is barking.");
    }
    @Override
    public void eat(){
        System.out.println(name+" is eating biscuits.");
    }

}

public class InheritanceEx1 {
    public static void main(String[] args) {
        //upcasting
        System.out.println("upcasting");
        Animal a1 = new Dog("Woofy");
        //overridden methods
        a1.eat();
        a1.run();
        //own method but cant call using Animal reference
        // a1.bark();
        // a1.showVar();
        //downcasting 
        System.out.println("downcasting");
        Dog d1 = (Dog)a1;
        //overridden method
        d1.eat();
        d1.run();
        //own method
        d1.bark();
        d1.showVar();
        

    }
    
}
