package com.pb.kalashnyk.hw6;

public class Cat extends Animal {

    private int age;
    private String other;


//    public Cat(String name, String food, String location) {
//        super("Cat Garfild", "fish", "Home");
//    }

    public Cat() {
        super("Cat Garfild", "fish", "Home");
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
        System.out.println( getName() + "says meow");
    }
    @Override
    public void sleep(){
        System.out.println( getName() + "animal sleep near the window");
    }
    @Override
    public void eat(){
        System.out.println( getName() + "animal drinks milk");
    }

}
