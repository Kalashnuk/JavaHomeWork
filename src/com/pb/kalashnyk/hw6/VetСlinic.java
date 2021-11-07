package com.pb.kalashnyk.hw6;

import java.lang.reflect.Constructor;

public class VetСlinic  {
    static void delimiter() {
        System.out.println("-----------------------------------------------------------------------------------------");
    }
    public static void main(String[] args) throws Exception {

        Animal animal1 = new Animal("Rat", "ches","Home1");
        Cat cat = new Cat(7,"red","Cat Garfild", "fish","Home");
        Dog dog = new Dog(3,"angry","Dog Rex","meat","booth");
        Horse horse = new Horse(7,"Superfast","Horse Ironhart", "hay","stall");

        Animal[] animals = new Animal[]{animal1,cat,dog,horse};

        delimiter();
        for (Animal n: animals){
            n.makeNoise();
            n.sleep();
            n.eat();
        }
        delimiter();
        System.out.println("eq 1 2: " + animal1.equals(cat));
        System.out.println("eq 1 3: " + animal1.equals(dog));
        System.out.println("eq 2 4: " + cat.equals(horse));
        delimiter();
        System.out.println("hashCode 1: " + animal1.hashCode());
        System.out.println("hashCode 2: " + cat.hashCode());
        System.out.println("hashCode 3: " + dog.hashCode());
        System.out.println("hashCode 3: " + horse.hashCode());
        delimiter();
        for(Animal animal: animals) {
            Class veterinarianClazz = Class.forName("com.pb.kalashnyk.hw6.Veterinarian");
            Constructor constr = veterinarianClazz.getConstructor(new Class[]{});
            Object obj = constr.newInstance();
            ((Veterinarian) obj).treatAnimal(animal);
        }

    }
}