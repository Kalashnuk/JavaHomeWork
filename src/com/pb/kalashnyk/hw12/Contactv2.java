package com.pb.kalashnyk.hw12;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class Contactv2 {

    private String name;
    private LocalDate dtBrth;
    private String number;
    private String address;
    private LocalDateTime lastTimeModified;

    public Contactv2(){
    }

    public Contactv2(String name, LocalDate dtBrth, String number, String address) {
        this.name = name;
        this.dtBrth = dtBrth;
        this.number = number;
        this.address = address;
        this.lastTimeModified = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.lastTimeModified = LocalDateTime.now();
    }

    public LocalDate getDtBrth() {
        return dtBrth;
    }

    public void setDtBrth(LocalDate dateOfBirth) {
        this.dtBrth = dateOfBirth;
        this.lastTimeModified = LocalDateTime.now();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
        this.lastTimeModified = LocalDateTime.now();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        this.lastTimeModified = LocalDateTime.now();
    }

    public LocalDateTime getLastTimeModified() {
        return lastTimeModified;
    }

    public void setLastTimeModified(LocalDateTime lastTimeModified) {
        this.lastTimeModified = lastTimeModified;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", dtBrth=" + dtBrth +
                ", number='" + number + '\'' +
                ", address='" + address + '\'' +
                ", lastTimeModified=" + lastTimeModified +
                '}';
    }
}