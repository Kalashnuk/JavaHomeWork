package com.pb.kalashnyk.hw11;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Contact implements Comparable<Contact> {
    private String name;
    private LocalDate dtBrth;
    private List<String> number;
    private String address;
    private LocalDateTime lastTimeModified;
    SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");

    public Contact() {
    }

    public Contact(String name, LocalDate dtBrth, String phone, String address) {
        this.name = name;
        this.dtBrth = dtBrth;
        this.number = new ArrayList<>(Collections.singleton(phone));
        this.address = address;
        lastTimeModified = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDtBrth() {
        return dtBrth;
    }

    public void setDtBrth(LocalDate parse) {
        this.dtBrth = dtBrth;
    }

    public List<String> getNumber() {
        return number;
    }

    public void setNumber(List<String> number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
                ", number=" + number +
                ", address='" + address + '\'' +
                '}';
    }

    public String info() {
        return name + " " + dtBrth + " " + address + " " + lastTimeModified;

    }

    @Override
    public int compareTo(Contact contact) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(dtBrth, contact.dtBrth)
                && Objects.equals(number, contact.number)
                && Objects.equals(address, contact.address)
                && Objects.equals(lastTimeModified, contact.lastTimeModified)
                && Objects.equals(formatDate, contact.formatDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dtBrth, number, address, lastTimeModified, formatDate);
    }
}