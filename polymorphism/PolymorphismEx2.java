package polymorphism;
interface IShape{
    void draw();
}
class CCircle implements IShape{
    public void draw(){
        System.out.println("drawing circle.");
    }
}
class CSquare implements IShape{
    public void draw(){
        System.out.println("drawing square.");
    }
}

public class PolymorphismEx2 {
    public static void main(String[] args) {
        IShape[] shape = new IShape[2];
        shape[0] = new CCircle();
        shape[1] = new CSquare();
        for(IShape s:shape){
            s.draw();
        }
    }
    
}
