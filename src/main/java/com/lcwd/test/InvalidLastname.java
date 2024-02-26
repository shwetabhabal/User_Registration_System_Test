package com.lcwd.test;

public class InvalidLastname extends Exception{
    InvalidLastname(String lastname){
        super(lastname);
    }
}
