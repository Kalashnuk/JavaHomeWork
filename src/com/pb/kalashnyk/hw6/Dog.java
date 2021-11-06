package com.pb.kalashnyk.hw6;

public class Dog extends Animal{

    private int age;
    private String other;

    public Dog() {
        super("Dog Rex", "meat","booth");
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
        System.out.println( getName() + "says woof");
    }
    @Override
    public void sleep(){
        System.out.println( getName() + "animal walks in the yard");
    }
    @Override
    public void eat(){
        System.out.println( getName() + "gnaws a bone");
    }
}
