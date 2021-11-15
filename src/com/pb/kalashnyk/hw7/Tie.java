package com.pb.kalashnyk.hw7;

public class Tie extends Clothes implements ManClothes {

    public Tie(String name, Size size, int value, String color){
        super(name,size,value,color);
    }
    @Override
    public void dressMan(){
        System.out.println("The man is dressed in: "+getName()+" "+ size.getDescription()+": ("+size.getEuroSize()+")"
                +" at a cost: "+getValue()+", color: "+getColor());
    }
}
