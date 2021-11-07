package com.pb.kalashnyk.hw6;

public class Animal {
    public String name;
    public String food;
    public String location;

    public Animal(String name,String food,String location){
        this.name = name;
        this.food = food;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise() {
        System.out.println(" animal voice");
    }
    public void sleep(){
        System.out.println(" animal sleep");
    }
    public void eat(){
        System.out.println(" animal eat" + food);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
