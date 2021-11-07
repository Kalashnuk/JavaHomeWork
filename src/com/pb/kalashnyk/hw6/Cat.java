package com.pb.kalashnyk.hw6;

import java.util.Objects;

public class Cat extends Animal {

    private int age;
    private String other;

    public Cat(int age,String other,String name,String food,String location) {
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
        System.out.println(name+" says meow");
    }
    @Override
    public void sleep(){
        super.sleep();
        System.out.println("near the window");
    }
    @Override
    public void eat(){
        System.out.println("drinks milk.");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name " + name +
                ", food " + food +
                ", location=" + location +
                ", age=" + age +
                ", other=" + other +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(other, cat.other);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, other);
    }
}
