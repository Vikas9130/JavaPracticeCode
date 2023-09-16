package abstraction;

abstract class Animal {
    private String name;
    public Animal(String name){
        this.name=name;
    }
    public abstract void speak(String name);
    public void eat(){
        System.out.println(name+"is eating.");
    }
    public String getName(){
        return this.name;
    }    
}
