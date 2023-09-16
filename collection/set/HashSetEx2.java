package collection.set;

import java.util.HashSet;

class Person{
    private int id;
    private String name;
    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Override hashCode and equals methods
    @Override
    public int hashCode() {
        // Use a unique combination of fields for the hash code
        int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
      @Override
    public boolean equals(Object obj) {
        // Check if the objects are the same instance
        if (this == obj)
            return true;
        // Check if the object is null
        if (obj == null)
            return false;
        // Check if the classes are the same
        if (getClass() != obj.getClass())
            return false;
        // Cast the object to a Person
        Person other = (Person) obj;
        // Check if id and name are equal
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Person> persons = new HashSet<Person>();
        persons.add(new Person(1, "vikas pawar"));
        persons.add(new Person(2, "vijay pawar"));
        System.out.println(persons.size());
        persons.add(new Person(3, "vikas pawar"));
        System.out.println(persons.size());
        for(Person person:persons){
            System.out.println(person.getName());
        }
    }
    
}
