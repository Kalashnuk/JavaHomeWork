package com.pb.kalashnyk.hw8;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Auth {
    private String login;
    private String password;

    public void signUp(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.matches("[a-zA-Z0-9]{5,20}")) {
            this.login = login;
        } else {
            throw new WrongLoginException("Error! Login is incorrect. \n(It should be " +
                    "5-20 symbols, only Latin letters and numbers)");
        }
        if (password.matches("[a-zA-Z0-9_]{5,20}")) {
            this.password = password;
        } else {
            throw new WrongPasswordException("Error! Password does not match");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Error! Password is incorrect. \n(It should be" +
                    " 5-20 symbols, only Latin letters and numbers and underscore)");
        }
    }

    public void signIn(String login, String password) throws WrongLoginException {
        if (this.login.equals(login) && this.password.equals(password)) {
            System.out.println("Hello, you're signed in.");
        } else {
            throw new WrongLoginException("Error! Incorrect username or password entered");
        }
    }
}
