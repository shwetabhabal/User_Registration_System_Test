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
//        System.out.println("first name test");
//        boolean res =userRegisteration.isvalidfirstname("Shweta");
//        Assertions.assertTrue(res);
        try{
            boolean res =userRegisteration.isvalidfirstname("Shweta");
            Assertions.assertTrue(res);
        }
        catch (Invalidfirstname e){
            Assertions.assertEquals("Invalid first name",e.getMessage());
        }
    }
    @Test
    public void isvalidlastnameTest(){
        System.out.println("last name test");
        try{
        boolean res =userRegisteration.isvalidlastname("Kumar");
//        Assertions.assertTrue(res);
        }
        catch (InvalidLastname e){
            Assertions.assertEquals("Invalid last name", e.getMessage());
        }
    }
    @Test
    public void isvalidemailTest() {
        System.out.println("email test");
        try {
            boolean res = userRegisteration.isvalidemail("ravi@gmail.com");
//            Assertions.assertFalse(res);
        }catch (InvalidEmail e){
            Assertions.assertEquals("Invalid email", e.getMessage());
        }

        try {
            boolean email1 = userRegisteration.isvalidemail("abc");
            Assertions.assertFalse(email1);
        }catch (InvalidEmail e){
            Assertions.assertEquals("Invalid email", e.getMessage());
            System.out.println(e.getMessage());
        }
//        try {
//        boolean email2 = userRegisteration.isvalidemail("abc@.com.my");
//        Assertions.assertFalse(email2);
//        }catch (InvalidEmail e){
//            Assertions.assertEquals("Invalid email", e.getMessage());
//        }
//        boolean email3 = userRegisteration.isvalidemail("abc123@gmail.a");
//        Assertions.assertFalse(email3);
//        boolean email4 = userRegisteration.isvalidemail("abc123@.com");
//        Assertions.assertFalse(email4);
//        boolean email5 = userRegisteration.isvalidemail("abc123@.com.com");
//        Assertions.assertFalse(email5);
//        boolean email6 = userRegisteration.isvalidemail(".abc@abc.com");
//        Assertions.assertFalse(email6);
//        boolean email7 = userRegisteration.isvalidemail("abc()*@gmail.com");
//        Assertions.assertFalse(email7);
//        boolean email8 = userRegisteration.isvalidemail("abc@%*.com");
//        Assertions.assertFalse(email8);
//        boolean email9= userRegisteration.isvalidemail("abc..2002@gmail.com");
//        Assertions.assertFalse(email9);
//        boolean email10 = userRegisteration.isvalidemail("abc.@gmail.com");
//        Assertions.assertFalse(email10);
//        boolean email11 = userRegisteration.isvalidemail("abc@abc@gmail.com");
//        Assertions.assertFalse(email11);
//        boolean email12 = userRegisteration.isvalidemail("abc@gmail.com.1a");
//        Assertions.assertFalse(email12);
//        boolean email13 = userRegisteration.isvalidemail("abc@gmail.com.aa.au");
//        Assertions.assertFalse(email13);
    }
    @Test
    public void isvalidphoneTest() {
        System.out.println("phone test");
        try {
            boolean res = userRegisteration.isvalidphone("91 9920651468");
            Assertions.assertTrue(res);
        }catch (Invalidphone e){
            Assertions.assertEquals("Invalid phone", e.getMessage());
        }
    }
    @Test
    public void isvalidpasswordTest() {
        System.out.println("password test");
        try {
            boolean res = userRegisteration.isvalidpassword("A2@121212121");
            Assertions.assertTrue(res);
        }catch (Invalidphone e){
            Assertions.assertEquals("Invalidphone", e.getMessage());
        }
    }
}
