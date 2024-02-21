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
}