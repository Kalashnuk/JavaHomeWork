package com.pb.kalashnyk.hw8;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Auth {
    private String login;
    private String password;

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void signUp(String login, String password, String confirmPassword)
            throws WrongPasswordException,WrongLoginException{
//        if (login == null) {
//            System.out.println("Login null");
//            throw new WrongLoginException("Login pust");
//        }
        boolean crct = login.matches("[a-zA-Z0-9]{5,20}");
        if (!crct){
            }
            throw new WrongPasswordException("Log incorr");

//        if (password == null) {
//            throw new WrongLoginException("Password pust");
//        }
        crct = password.matches("[a-zA-Z0-9_]{5,20}");
        if (!crct && password.equals(confirmPassword)){
            throw new WrongLoginException("Password incorr");
        }
        System.out.println("VVedite password agn");
        setLogin(login);
        setPassword(password);
    }
    public void signIn(String login1, String password1, String confirmPassword1) throws WrongPasswordException{
        if (login1.equals(login) && password1.equals(password))
            System.out.println("vi vosli");
        else
            throw new WrongPasswordException("Wrong avtoriz");
    }

//public static Pattern loginInPattern = Pattern.compile("[a-zA-Z0-9_]{1,20}");
//
//    public static boolean isValidate(String login, String password, String confirmPassword)
//            throws WrongLoginException, WrongPasswordException {
//
//        if (login == null) {
//            System.out.println("Login null");
//            throw new WrongLoginException("Login пуст");
//        }
//        if (password == null) {
//            System.out.println("Password null");
//            throw new WrongPasswordException("Password пуст");
//        }
//        if (confirmPassword == null) {
//            System.out.println("confPassword null");
//            throw new WrongPasswordException("confPassword пуст");
//        }
//
//        Matcher matchLog = loginInPattern.matcher(password);
//        Matcher matchPass = loginInPattern.matcher(password);
//        if (!matchLog.matches()) {
//            throw new WrongLoginException("Login false");
//        }
//        if (!matchPass.matches()) {
//            throw new WrongPasswordException("Password false");
//        } else if (!password.equals(confirmPassword)) {
//            throw new WrongPasswordException("Password false");
//        }
//
//        return true;
//    }
}
