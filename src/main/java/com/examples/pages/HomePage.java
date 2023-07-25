package com.examples.pages;

import com.examples.utils.NumberGnerator;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void submitForm() {
        System.out.println(NumberGnerator.generateRandomNu());
//        driver.findElement()
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
