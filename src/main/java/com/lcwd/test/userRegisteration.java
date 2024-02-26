package com.lcwd.test;
import java.util.Scanner;
import java.util.regex.*;

public class userRegisteration {
    public static boolean isvalidfirstname(String name) throws Invalidfirstname {
        String regex = "[A-Z][a-z]{2,}";
        if(Pattern.matches(regex, name)){
            throw new Invalidfirstname("Invalid first name");
        }
        return Pattern.matches(regex, name);
    }
    public static boolean isvalidlastname(String name) throws InvalidLastname{
        String regex = "[A-Z][a-z]{2,}";
        if(!Pattern.matches(regex, name)){
            throw new InvalidLastname("Invalid last name");
        }
        return Pattern.matches(regex, name);
    }
    public static boolean isvalidemail(String email) throws InvalidEmail{
//        String regex = "[^.][a-zA-z0-1_.][^.]+@{1}[a-z]+[.][a-z]{2,3}";
        String regex = "^[^.][a-zA-Z0-9+_-]+[^.][@][a-zA-Z0-9]+[.]co(m|.in)$";
        if(!Pattern.matches(regex,email)){
            throw new InvalidEmail("Invalid email");
        }
        return Pattern.matches(regex, email);
    }

    public static boolean isvalidphone(String phone) throws Invalidphone{
        String regex = "[9][1] [0-9]{10}";
        if(!Pattern.matches(regex,phone)){
            throw new Invalidphone("Invalid phone");
        }
        return Pattern.matches(regex,phone);
    }
    public static boolean isvalidpassword(String pass) throws Invalidphone{
        String regex= "[A-Z]+[0-9]+[@#$%^*()_+!:;']+[a-zA-z0-9.|]{8,}";
        if(!Pattern.matches(regex,pass)){
            throw new Invalidphone("Invalid phone");
        }
        return Pattern.matches(regex,pass);
    }
}