package inheritance;

class Parent{
    private int privateVar = 1;
    
    static void staticMethod(){
        System.out.println("Parent static method.");
    }
    void instanceMethod(){
        System.out.println("Parent instance method.");
    }
    public int getPrivateVar() {
        return privateVar;
    }
    public void setPrivateVar(int privateVar) {
        this.privateVar = privateVar;
    }
}
class Kid extends Parent{
Parent p = new Parent();
 int v = p.getPrivateVar();
    static void staticMethod(){
        
        System.out.println("Kid static method.");
    }
    void instanceMethod(){
        super.instanceMethod();
        System.out.println(v);
       // System.out.println(super.getPrivateVar);
        System.out.println("Kid instance method.");
    }
}

public class InheritanceEx7 {
    public static void main(String[] args) {
        Kid p = new Kid();
        Parent.staticMethod();
        Kid.staticMethod();
        p.instanceMethod();
        p.staticMethod();
        
    }
    
}
