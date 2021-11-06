package com.pb.kalashnyk.hw6;

public class VetСlinic {
    static void delimiter() {
        System.out.println("-----------------------------------------------------------------------------------------");
    }
    public static void main(String[] args) {

//        Animal animal = new Animal("Asus");

        Animal animal1 = new Animal("Cat Garfild", "fish","Home");
        Animal animal2 = new Animal("Dog Rex", "meat","booth");
        Animal animal3 = new Animal("Cat Ironhart", "hay","stall");

        Cat cat = new Cat();
        cat.setAge(7);
        cat.setOther("he is red");

        Dog dog = new Dog();
        dog.setAge(11);
        dog.setOther("angry");

        Horse horse = new Horse();
        horse.setAge(4);
        horse.setOther("super fast");

        Animal[] animals = new Animal[]{cat,dog,horse};//dog,horse}
        System.out.println("55555555555555");
        delimiter();
        for (Animal n: animals){
            n.makeNoise();
        }
        delimiter();
        for (Animal s: animals){
            s.sleep();
        }
        delimiter();
        for (Animal e: animals){
            e.eat();
        }
        delimiter();
        for (Animal v: animals){
            v.treatAnimal();
        }

    }
}