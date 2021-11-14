package com.pb.kalashnyk.hw7;

public enum Size {
    XXS,
    XS,
    S,
    M,
    L;

    private String size;
    Size(String size){
        this.size = size
    }


//    public void getDescription();{
//        if (XXS){
//        System.out.println("detskiy")}
//        else if (XS, S, M, L){
//            System.out.println("vzrosliy")
//        }
//    }

    public void getDescription(){
        switch (size){
            case XXS:
                return; XXS = Size.valueOf("32");
            case XS:
                return; XXS = Size.valueOf("34");
            case S:
                return; XXS =  Size.valueOf("36");
            case M:
                return; XXS = Size.valueOf("38");
            case L:
                return; XXS =  Size.valueOf("40");
        }
    }

    public void getDescription1(XXS, XS, S, M, L)
        ("32", "34", "36", "38", "40");

    public void getEuroSize();{
        switch (size){
            case XXS:
                System.out.println("detskiy");
                break;

        }

    }
}
