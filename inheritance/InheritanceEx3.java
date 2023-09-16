package inheritance;
class A{
    public A(){
        System.out.println("Im in A.");
    }
}
class B extends A {
    public B(){
        super();
        System.out.println("Im in B.");
    }
}
class C extends B {
    public C(){
        System.out.println("Im in C.");
    }
}
class D extends C{
    public D(){
        
        System.out.println("Im in D.");
    }
}

public class InheritanceEx3 {
    public static void main(String[] args) {
         D d = new D();
    }
   
    
}
