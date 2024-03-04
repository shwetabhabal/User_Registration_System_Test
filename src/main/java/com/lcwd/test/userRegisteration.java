package com.lcwd.test;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.*;

public class userRegisteration {
    public static boolean isvalidfirstname(String name) throws Invalidfirstname {
        Predicate<String> isValidFirstname = input-> {         //return boolean value
            String regex = "[A-Z][a-z]{2,}";
            if (Pattern.matches(regex, input)) {
                try {
                    throw new Invalidfirstname("Invalid first name");
                } catch (Invalidfirstname e) {
                    throw new RuntimeException(e);
                }
            }
            return true;
        };
        return isValidFirstname.test(name);
    }
    public static boolean isvalidlastname(String name) throws InvalidLastname{
        Predicate<String> isValidLastname = input -> {
            String regex = "[A-Z][a-z]{2,}";
            if (!Pattern.matches(regex, input)) {
                try {
                    throw new InvalidLastname("Invalid last name");
                } catch (InvalidLastname e) {
                    throw new RuntimeException(e);
                }
            }
            return true;
        };
        return  isValidLastname.test(name);
    }
    public static boolean isvalidemail(String email) throws InvalidEmail{
//        String regex = "[^.][a-zA-z0-1_.][^.]+@{1}[a-z]+[.][a-z]{2,3}";

        Predicate<String> isValidEmail = input -> {
//            String regex = "^[^.][a-zA-Z0-9+_-]+[^.][@][a-zA-Z0-9]+[.]co(m|.in)$";
            String regex = "[^.][a-zA-z0-1_.][^.]+@{1}[a-z]+[.][a-z]{2,3}";
            if (!Pattern.matches(regex, input)) {
                try {
                    throw new InvalidEmail("Invalid email");
                } catch (InvalidEmail e) {
                    throw new RuntimeException(e);
                }
            }
            return true;
        };
        return isValidEmail.test(email);
    }

    public static boolean isvalidphone(String phone) throws Invalidphone{

        Predicate<String> isValidPhone = input -> {
            String regex = "[9][1] [0-9]{10}";
            if (!Pattern.matches(regex, input)) {
                try {
                    throw new Invalidphone("Invalid phone");
                } catch (Invalidphone e) {
                    throw new RuntimeException(e);
                }
            }
            return true;
        };
        return isValidPhone.test(phone);
    }
    public static boolean isvalidpassword(String pass) throws Invalidpassword {

        Predicate<String > isValidPassword = input-> {
            String regex = "[A-Z]+[0-9]+[@#$%^*()_+!:;']+[a-zA-z0-9.|]{8,}";
            if (!Pattern.matches(regex, input)) {
                try {
                    throw new Invalidpassword("Invalid phone");
                } catch (Invalidpassword e) {
                    throw new RuntimeException(e);
                }
            }
            return true;
        };
        return isValidPassword.test(pass);
    }
}