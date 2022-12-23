package interviewprograms;

import interviewprograms.interfaces.CarBuilder;
import interviewprograms.interfaces.HouseBuilder;

public class OverridingInterface implements CarBuilder, HouseBuilder {
    public void build(){
        System.out.println("In child build method");
    }
    public static void main(String[] args) {
        OverridingInterface oi = new OverridingInterface();
        oi.build();
        
    }
    
}
