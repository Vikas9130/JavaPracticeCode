package interviewprograms.voterapplication;

import java.util.ArrayList;

public class VoterDriver {
    public static void main(String[] args) {
        ArrayList<Voter> list = new ArrayList<>();

        list.add(new Voter(1, "vikas pawar", 26));
        list.add(new Voter(2, "vijay pawar", 24));
        list.add(new Voter(3, "maruti pawar", 53));

        
        // case1: add new voter and duplicate voter should not be added.
        Voter newVoter = new Voter(1, "vikas pawar", 26);
        if(!list.contains(newVoter)){
            list.add(newVoter);
            System.out.println("voter added: "+newVoter);
        }else{
            System.out.println("new voter can not be added: "+newVoter);
        }

        // case2: view all voter
        for(Voter v:list){
            System.out.println(v);
        }
        
        

        
    }
    
}
