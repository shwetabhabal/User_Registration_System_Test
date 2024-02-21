package com.lcwd.test;

import org.junit.Assert;
import org.junit.Test;

public class userRegisterationTest {
    @Test
    public void isvalidnameTest(){
        boolean res =userRegisteration.isvalidname("Shweta");
        Assert.assertTrue(res);
    }
}
