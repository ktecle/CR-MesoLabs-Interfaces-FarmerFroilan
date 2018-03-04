package com.zipcodewilmington.froilansfarm.FarmParts;


import com.zipcodewilmington.froilansfarm.animal.person.Person;

import java.util.ArrayList;

public class FarmHouse {
    protected ArrayList<Person>farmers;

    public FarmHouse(){
        this.farmers = new ArrayList<Person>();
    }

    public void addPerson(Person aPerson){
        farmers.add(aPerson);
    }

    public void removePerson(Person aPerson){
        farmers.remove(aPerson);
    }

    public ArrayList<Person> getFarmer() {
        return farmers;
    }
}
