package interviewprograms.voterapplication;

public class Voter {
    private int id;
    private String name;
    private int age;
    
    public Voter(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Voter [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

    

    
    
}
