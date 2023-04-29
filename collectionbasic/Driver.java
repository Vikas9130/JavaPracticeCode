package collectionbasic;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        Employee e1 = new Employee(101, "vikas pawar");
        list.add(e1);
        Employee e2 = new Employee(102, "vijay pawar");
        list.add(e2);
        for(Employee i:list){
            System.out.println(i);
        }
    }
    
}
