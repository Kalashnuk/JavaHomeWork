package com.pb.kalashnyk.hw8;

public class WrongLoginException extends Exception {
    public WrongLoginException(){
        
    }
    public WrongLoginException(String msg){
        super(msg);
    }
}
