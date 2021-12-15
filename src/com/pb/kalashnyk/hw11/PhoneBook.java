package com.pb.kalashnyk.hw11;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    public String name;
    public String dtBrth;
    public String namber;
    public String adres;
    public String dat;

    public Contact (String,String,String,String,String,){
        this.name = name;
        this.dtBrth = dtBrth;
        this.namber = namber;
        this.adres = adres;
        this.dat = dat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDtBrth() {
        return dtBrth;
    }

    public void setDtBrth(String dtBrth) {
        this.dtBrth = dtBrth;
    }

    public String getNamber() {
        return namber;
    }

    public void setNamber(String namber) {
        this.namber = namber;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getDat() {
        return dat;
    }

    public void setDat(String dat) {
        this.dat = dat;
    }

    public static void main(String[] args) {
        List<String> Contact = new ArrayList<>();
        List<Person> list = new ArrayList<>();


        Contact contact = new Contact ("Ivanov I.I","01.05.1991","+380990000001","Kyiv, Kievskaya 10",);
        Contact contact1 = new Contact ("Petrov P.P.","10.07.1990","+380990000002","Harkiv, Svobodu 36",);
        Contact contact2 = new Contact ("Smirnov S.S.","15.09.1992","+380990000003","Lviv, Franka 75",);
        Contact contact3 = new Contact ("Sevchenko T.G.","09.04.1814","+380990000777","Kaniv, Sevchenka 100",);
        
        list.add("");


    }

}
