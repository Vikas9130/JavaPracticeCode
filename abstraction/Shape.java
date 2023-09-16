package abstraction;

public abstract class Shape {
    private String color;
    private double area;
    public Shape(String color){
        this.color = color;
        this.area = 0.0;
    }
    public abstract double calculateArea();
    public String getColor() {
        return color;
    }
    public double getArea() {
        return area;
    }
    
}
