package com.lcwd.test;

import org.junit.Assert;
import org.junit.Test;

public class userRegisterationTest {
    @Test
    public void isvalidfrstnameTest(){
        boolean res =userRegisteration.isvalidfirstname("Shweta");
        Assert.assertTrue(res);
    }
}
