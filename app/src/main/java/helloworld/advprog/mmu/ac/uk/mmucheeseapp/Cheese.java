package helloworld.advprog.mmu.ac.uk.mmucheeseapp;

import java.io.Serializable;

public class Cheese implements Serializable {

    String name;
    String details;

    public Cheese (String name, String details) {

        this.name= name;
        this.details = details;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }


}
