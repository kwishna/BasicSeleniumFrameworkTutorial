package com.example.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    @DataProvider(name = "number_generator")
    public Object[][] dataProvides() {
        // Method to generate the data / store the data.
        Object[][] obj = new Object[][] {
                {"username1", 1, "first_name1", true},
                {"username2", 2, "first_name2", true},
        };
        return obj;
    }


    @Test(dataProvider = "number_generator")
    public void fillSignUpForm(String a, int b, String c, boolean d) {
        System.out.println("Filling Username: "+a);
        System.out.println("Filling Roll: "+b);
        System.out.println("Filling First name: "+c);
        System.out.println("Is button enabled: "+d);
        System.out.println("Click submit button");
        System.out.println("------Sign Up Completed-------");
    }
}
