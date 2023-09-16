package inheritance;
class Animal1{
    String species1;
    Animal1(String species1){
        this.species1=species1;
        System.out.println("Im in a Animal class.");
    }
}
class Dog1 extends Animal1{
    String sound;
   //String s = super.species1;
    Dog1(String sound, String species1){
        super(species1);
        this.sound=sound;
        System.out.println("Im in a Dog class.");
    }
    void show(){
        System.out.println(species1+" makes a "+sound);
        System.out.println(super.species1);
    }
}

public class InheritanceEx4 {
    public static void main(String[] args) {
       Dog1 d = new Dog1("phoe","bull");
       d.show();
        
    }
    
}
