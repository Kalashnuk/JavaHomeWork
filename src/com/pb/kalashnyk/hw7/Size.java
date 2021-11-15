package com.pb.kalashnyk.hw7;

public enum Size {
    XXS("child size",32),
    XS("adult size",34),
    S("adult size",36),
    M("adult size",38),
    L("adult size",40);


    private String description;
    private int euroSize;

    Size (String description, int euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return description;
    }
    public int getEuroSize() {
        return euroSize;
    }

}
