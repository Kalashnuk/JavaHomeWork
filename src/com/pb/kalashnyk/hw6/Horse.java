package com.pb.kalashnyk.hw6;

public class Horse extends Animal{

    private int age;
    private String other;

    public Horse() {
        super("Cat Ironhart", "hay","stall");
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
        System.out.println( getName() + "says neigh");
    }
    @Override
    public void sleep(){
        System.out.println( getName() + "animal run");
    }
    @Override
    public void eat(){
        System.out.println( getName() + "drinks water");
    }
}
