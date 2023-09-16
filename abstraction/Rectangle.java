package abstraction;

public class Rectangle extends Shape {
    private double width;
    private double length;
    public Rectangle(String color, double width, double length){
        super(color);
        this.length=length;
        this.width=width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double length) {
        this.length = length;
    }
    @Override
    public double calculateArea() {
   return width*length;
    }    
    
}
