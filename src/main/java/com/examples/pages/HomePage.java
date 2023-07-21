package com.examples.pages;

import com.examples.utils.NumberGnerator;

public class HomePage {

    public void submitForm() {
        System.out.println(NumberGnerator.generateRandomNu());
        /*
        WebElement inputFiled = driver.findElement(by);
        inputFiled.sendkeys(NumberGnerator.generateRandomNu())
        submit.click();

        // UsernameError - "Username is not filled"
        // PasswordError - "Password is not filled"
        // genderError - "Gender is not selected"

         */
    }
}
