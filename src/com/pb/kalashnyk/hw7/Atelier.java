package com.pb.kalashnyk.hw7;

public class Atelier {
    static void delimiter() {
        System.out.println("-----------------------------------------------------------------------------------------");
    }
    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt("Armani tshirt", Size.S, 50, "white");
        Pants pants = new Pants("D&G pants", Size.M, 42, "black");
        Pants pants2 = new Pants("D&G pants", Size.XXS, 37, "blue");
        Skirt skirt = new Skirt("Versace skirt", Size.XS, 75, "red");
        Skirt skirt2 = new Skirt("Armani skirt", Size.L, 90, "yellow");
        Tie tie = new Tie("Hugo Boss tie", Size.L, 35, "gray");
        Tie tie2 = new Tie("Versace tie", Size.M, 33, "green");

        Clothes[] clothes = new Clothes[]{tshirt, pants, pants2, skirt, skirt2, tie, tie2};

        delimiter();
        dressMan(clothes);

        delimiter();
        dressWomen(clothes);
    }
    public static void dressMan(Clothes[] clothes){
            for (Clothes cloth:clothes) {
                if (cloth instanceof Tie) {
                    Tie tie = (Tie) cloth;
                    tie.dressMan();
                }
            }
        }
    public static void dressWomen(Clothes[] clothes){
        for (Clothes cloth:clothes) {
            if (cloth instanceof Skirt) {
                Skirt skirt = (Skirt) cloth;
                skirt.dressWomen();
            }
        }
    }

}
