package abstraction;

public class Driver {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle("red", 5);
        shapes[1] = new Rectangle("blue", 15, 23);
        System.out.println(shapes[0].calculateArea());
        System.out.println(shapes[0].getColor());
        System.out.println();
        System.out.println(shapes[1].calculateArea());
        System.out.println(shapes[1].getColor());
        System.out.println();
for(Shape shape:shapes){
    System.out.println(shape.getClass()+" : "+shape.calculateArea());
    System.out.println(shape.getClass()+" : "+ shape.getColor());
}


    //     Circle c1 = new Circle("red",10);
    //     //c1.setRadius(10);
    //     System.out.println(c1.calculateArea());
    //     System.out.println(c1.getColor());
    //     System.out.println();
    //     Rectangle r1 = new Rectangle("blue",2,4);
    //    //r1.setHeight(2);
    //     //r1.setWidth(5);
    //     System.out.println(r1.calculateArea());
    //     System.out.println(r1.getColor());
    }
    
}
