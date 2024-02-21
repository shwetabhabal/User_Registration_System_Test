package com.lcwd.test;
import java.util.Scanner;
import java.util.regex.*;
public class userRegisteration {
    public static boolean isvalidname(String name){
        String regex = "[A-Z][a-z]{2,}";
        return Pattern.matches(regex, name);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first name: ");
        String firstname = sc.nextLine();
        System.out.println(isvalidname(firstname));
    }
}
