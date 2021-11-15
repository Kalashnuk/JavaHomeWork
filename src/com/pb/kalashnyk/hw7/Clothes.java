package com.pb.kalashnyk.hw7;

public abstract  class Clothes {
    private String name;
    protected Size size;
    private int value;
    private String color;

    public Clothes(String name, Size size, int value, String color) {
        this.name = name;
        this.size = size;
        this.value = value;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

     public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
