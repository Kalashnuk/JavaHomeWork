package com.pb.kalashnyk.hw6;

import java.util.Objects;

public class Horse extends Animal{

    private int age;
    private String other;

    public Horse(int age,String other,String name,String food,String location) {
        super(name,food,location);
        this.age = age;
        this.other = other;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String name) {
        this.other = other;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void makeNoise(){
        System.out.println(name+" says neigh");
    }
    @Override
    public void sleep(){
        System.out.println(" animal run");
    }
    @Override
    public void eat(){
        System.out.println(" drinks water");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", age=" + age +
                ", other='" + other + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return age == horse.age && Objects.equals(other, horse.other);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, other);
    }
}
