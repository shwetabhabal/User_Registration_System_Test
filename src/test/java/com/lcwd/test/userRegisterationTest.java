package com.lcwd.test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class userRegisterationTest {
//    @Test
//    public void isvalidfirstnameTest(){
//        boolean res =userRegisteration.isvalidfirstname("Shweta");
//        Assertions.assertTrue(res);
//    }
//    @Test
//    public void isvalidlastnameTest(){
//        boolean res =userRegisteration.isvalidlastname("Kumar");
//        Assertions.assertTrue(res);
//    }
//    @Test
//    public void isvalidemailTest(){
//        boolean res = userRegisteration.isvalidemail("ravi@gmail.com");
//        Assertions.assertTrue(res);
//    }
    @Test
    public void isvalidphoneTest(){
        boolean res = userRegisteration.isvalidphone("91 9920651468");
        Assertions.assertTrue(res);
    }
}
