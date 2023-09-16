package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListE1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Vikas");
        list.add("Fedrick");
        list.add("Golu");

        for(String student:list){
            System.out.println(student);
        }
        System.out.println("for loop");
        for(int i=0; i<list.size(); i++){
            String student = list.get(i);
            System.out.println(student);
        }
        System.out.println("list iterator");
        ListIterator<String> itr = list.listIterator(list.size());
        while(itr.hasPrevious()){
            String str1 = itr.previous();
            System.out.println(str1);
        }
        System.out.println("forEach() method");
        list.forEach(a->{System.out.println(a);});
        System.out.println("forEachRemaining");
        
java.util.Iterator<String> it = list.iterator();
while(it.hasNext()){
String str = it.next();
    System.out.println(str);
}
System.out.println("for each remaining method");
it.forEachRemaining(a->{System.out.println(a);});

    }
    
}
