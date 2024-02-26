package com.lcwd.test;

public class InvalidEmail extends Exception{
    InvalidEmail(String email){
        super(email);
    }
}
