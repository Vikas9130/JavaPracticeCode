package inheritance;
class Ani{
    private String name;
    public void setName(String name){
        this.name = name;
    }
    public void speak(){
        System.out.println("animal is speaking..");
    }
    public void speak(String name){
        System.out.println(name+"is speaking.");
    }
}

class Cat extends Ani{
    @Override
    public void speak(){
        System.out.println("Cat is meowing.");
    }
}

public class InheritanceEx5 {
    public static void main(String[] args) {
        Ani c1 = new Cat();
        c1.speak();
        c1.speak("Lilly");
    }
    
    
}
