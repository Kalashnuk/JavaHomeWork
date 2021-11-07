package com.pb.kalashnyk.hw6;

public class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println("At the doctor's appointment: "+animal.getName()+
                " loves to eat "+ animal.getFood()+" lives "+ animal.getLocation()+".");
    }
}
