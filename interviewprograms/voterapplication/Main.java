package interviewprograms.voterapplication;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

class Voter {
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

    public String toString() {
        return "Voter [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Voter other = (Voter) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.id;
        return hash;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Voter> voters = new ArrayList<>();

        // add some voters to the collection
        voters.add(new Voter(1, "Alice", 25));
        voters.add(new Voter(2, "Bob", 30));
        voters.add(new Voter(3, "Charlie", 40));

        // case1: add new voter and duplicate voter should not be added.
        Voter voterToAdd = new Voter(1, "Dave", 28);
        if (!voters.contains(voterToAdd)) {
            voters.add(voterToAdd);
            System.out.println("Voter added: " + voterToAdd);
        } else {
            System.out.println("Duplicate voter not added: " + voterToAdd);
        }

        // case2: view all voter
        System.out.println("All voters:");
        for (Voter voter : voters) {
            System.out.println(voter);
        }

        // case3: voter count is whose age between 22 to 37.
        long count = voters.stream().filter(voter -> voter.getAge() >= 22 && voter.getAge() <= 37).count();
        System.out.println("Number of voters between 22 and 37 years old: " + count);

        // case4: find voter details whose name contain at least 4 characters and end with sh and start with r
        ArrayList<Voter> votersByName = new ArrayList<>();
        for (Voter voter : voters) {
            if (voter.getName().length() >= 4 && voter.getName().endsWith("sh") && voter.getName().startsWith("R")) {
                votersByName.add(voter);
            }
        }
        System.out.println("Voters with name at least 4 characters long, starting with R, and ending with sh:");
        for (Voter voter : votersByName) {
            System.out.println(voter);
        }

        // case5: arrange all voter in descending order age wise
        ArrayList<Voter> votersByAgeDescending = voters.stream()
                .sorted(Comparator.comparingInt(Voter::getAge).reversed())
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Voters arranged in descending order of age:");
        for (Voter voter : votersByAgeDescending) {
            System.out.println(voter);
        }
    }
}
