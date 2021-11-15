package com.pb.kalashnyk.hw7;

public class Pants extends Clothes implements ManClothes,WomenClothes {

    public Pants(String name, Size size, int value, String color){
        super(name,size,value,color);
    }
    @Override
    public void dressMan(){
        System.out.println("The man is dressed in: "+getName()+ size.getEuroSize()+": ("+size.getDescription()+")"
                +" at a cost: "+getValue()+" color: "+getColor());
    }
    @Override
    public void dressWomen(){
        System.out.println("The woman is dressed in: "+getName()+ size.getEuroSize()+": ("+size.getDescription()+")"
                +" at a cost: "+getValue()+", color: "+getColor());
    }
}