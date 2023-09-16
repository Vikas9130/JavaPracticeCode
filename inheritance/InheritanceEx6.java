package inheritance;
class Vehi{
     int wheels;
    public Vehi(int wheels){
        this.wheels=wheels;
        System.out.println("my vehicle has"+wheels+" wheels.");
    }
}
class Truck extends Vehi{
     int passengers;
    public Truck(int wheels, int passengers){
        super(wheels);
        this.passengers=passengers;
        System.out.println("my truck has "+wheels+"wheels and carrying "+passengers+" passengers.");
    }
}

public class InheritanceEx6 {
    public static void main(String[] args) {

        Truck t1 = new Truck(6, 2);
        System.out.println("my "+t1.getClass()+"has "+t1.wheels+"wheels and carrying"+t1.passengers+" passengers.");
        
    }
    
}
