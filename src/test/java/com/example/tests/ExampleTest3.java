package com.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ExampleTest3 {

    @Test(dataProvider = "number_generator", dataProviderClass = DataProviderTest.class)
    public void fillSignUpForm(String a, int b, String c, boolean d) {
        System.out.println("Filling Username: "+a);
        System.out.println("Filling Roll: "+b);
        System.out.println("Filling First name: "+c);
        System.out.println("Is button enabled: "+d);
        System.out.println("Click submit button");
        System.out.println("------Sign Up Completed-------");
    }

    @Test
    public void softAssert() {
        SoftAssert softAssert = new SoftAssert();
        System.out.println("First Line");

        softAssert.assertEquals(1, 2); // 1st assert // Failed remember
        System.out.println("Assert Failed: Still Continue");

        softAssert.assertNotEquals(1, 1); // 2nd assert // Failed remember
        System.out.println("Assert Failed: Still Continue");

        softAssert.assertAll(); // Final Assertion Evaluation
        System.out.println("Final Line");
    }
}
