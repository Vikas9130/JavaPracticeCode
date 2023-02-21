public class Variables {
    int a = 10;

    public void show(){
        System.out.println("value of a in normal method : "+ a);
    }
    public static void display(){
        Variables v1 = new Variables();
        System.out.println("Value of a in static method : " + v1.a);

    }
    public static void main(String[] args) {
        Variables v = new Variables();
        v.a = 100;
        System.out.println("value updated : "+v.a);
        v.show();
        display();
    }
    
}
