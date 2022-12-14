package string;



public class StaticClass {
    public static StaticClass var = null;
    private StaticClass(){

    }
    public static StaticClass metho()
{
    StaticClass v = null;
    return v;
}
    public static int a =10;
    public static void main(String[] args) {
    //  public static final Anya a;
     StaticClass s= new StaticClass();
     if (var == null)
        var = new StaticClass();
     //StaticClass s2 = StaticClass.getInstance();
        System.out.println(s.hashCode());
        System.out.println(var.hashCode());
    }
    private static StaticClass getInstance() {
        if (var == null)
        var = new StaticClass();
        return var;
    }
    
    
}

    

