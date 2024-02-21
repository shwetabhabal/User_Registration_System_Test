package com.lcwd.test;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class userRegisterationTest {
    @AfterEach
    public void isvalid(){
        System.out.println("Is valid");
    }
    @Test
    public void isvalidfirstnameTest(){
        System.out.println("first name test");
        boolean res =userRegisteration.isvalidfirstname("Shweta");
        Assertions.assertTrue(res);
    }
    @Test
    public void isvalidlastnameTest(){
        System.out.println("last name test");
        boolean res =userRegisteration.isvalidlastname("Kumar");
        Assertions.assertTrue(res);
    }
    @Test
    public void isvalidemailTest(){
        System.out.println("email test");
        boolean res = userRegisteration.isvalidemail("ravi@gmail.com");
        Assertions.assertTrue(res);
    }
    @Test
    public void isvalidphoneTest(){
        System.out.println("phone test");
        boolean res = userRegisteration.isvalidphone("91 9920651468");
        Assertions.assertTrue(res);
    }
    @Test
    public void isvalidpasswordTest(){
        System.out.println("password test");
        boolean res = userRegisteration.isvalidpassword("2121212121");
        Assertions.assertTrue(res);
    }
}
