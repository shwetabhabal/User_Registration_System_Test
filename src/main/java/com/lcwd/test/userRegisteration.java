package com.lcwd.test;
import java.util.Scanner;
import java.util.regex.*;
public class userRegisteration {
    public static boolean isvalidfirstname(String name){
        String regex = "[A-Z][a-z]{2,}";
        return Pattern.matches(regex, name);
    }
    public static boolean isvalidlastname(String name){
        String regex = "[A-Z][a-z]{2,}";
        return Pattern.matches(regex, name);
    }
    public static boolean isvalidemail(String email){
        String regex = "[a-zA-z0-1_.]+@[a-z]+[.][a-z]{2,3}";
        return Pattern.matches(regex, email);
    }
    public static boolean isvalidphone(String phone){
        String regex = "[9][1] [0-9]{10}";
        return Pattern.matches(regex,phone);
    }
    public static boolean isvalidpassword(String pass){
        String regex= "[A-Z]+[0-9]+[a-zA-z0-9]{8,}";
        return Pattern.matches(regex,pass);
    }
}