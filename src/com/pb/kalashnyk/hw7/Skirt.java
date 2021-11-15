package com.pb.kalashnyk.hw7;

public class Skirt extends Clothes implements WomenClothes {

    public Skirt(String name, Size size, int value, String color){
        super(name,size,value,color);
    }
    @Override
    public void dressWomen(){
        System.out.println("The woman is dressed in: "+getName()+" "+ size.getDescription()+": ("+size.getEuroSize()+")"
                +" at a cost: "+getValue()+", color: "+getColor());
    }
}
