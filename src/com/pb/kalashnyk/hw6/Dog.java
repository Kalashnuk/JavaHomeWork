package com.pb.kalashnyk.hw6;

import java.util.Objects;

public class Dog extends Animal{

    private int age;
    private String other;

    public Dog(int age,String other,String name,String food,String location) {
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
        System.out.println(name+" says woof");
    }
    @Override
    public void sleep(){
        System.out.println(" walks in the yard");
    }
    @Override
    public void eat(){
        super.eat();
        System.out.println(" and loves gnaws a bone");
    }

    @Override
    public String toString() {
        return "Dog{" +
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
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(other, dog.other);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, other);
    }
}
