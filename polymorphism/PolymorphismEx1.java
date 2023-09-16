package polymorphism;

class SuperAnimal{
   public void makeSound(){
    System.out.println("some generic sound.");
   }
}
class SubDog extends SuperAnimal{
    public void makeSound(){
        System.out.println("makes pho pho.");
    }
}
class SubCat extends SuperAnimal{
    public void makeSound(){
        System.out.println("makes meow meow.");
    }
}

public class PolymorphismEx1 {
    public static void main(String[] args) {
        // SuperAnimal animal;
        // animal = new SubDog();
        // animal.makeSound();
        // animal = new SubCat();
        // animal.makeSound();

        SuperAnimal[] animal = new SuperAnimal[3];
        animal[0] = new SuperAnimal();
        animal[1] = new SubDog();
        animal[2] = new SubCat();

        for(SuperAnimal a:animal){
            a.makeSound();
        }
        
    }
    
}
