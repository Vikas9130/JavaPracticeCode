package collection.set;

import java.util.HashSet;

public class HashSetEx1 {
    public static void main(String[] args) {
      HashSet<String> fruits = new HashSet<>();
      fruits.add("banana");
      fruits.add("apple");
      fruits.add("pineapple");
      fruits.add("watermelon");
      fruits.add("mango");
      //print hello world without semicolon
      if(System.out.printf("hello world!")==null){}
      System.out.println();
      System.out.println(fruits.size());
      fruits.remove("mango");
      System.out.println(fruits.size());
      System.out.println(fruits.contains("mango"));
      for(String elements:fruits){
        System.out.println(elements);
      }

        
    }
    
}
