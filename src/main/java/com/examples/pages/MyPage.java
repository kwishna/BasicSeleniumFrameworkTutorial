package com.examples.pages;

import com.examples.ennums.ErrorEnum;

public class MyPage {

    public void enter_username(String username) {
        System.out.println("Entering Username: " + username);
    }

    public void enter_password(String password) {
        System.out.println("Entering Password: " + password);
    }

    public void verify_error(String err) { // "UserMissingError, PasswordMissingError"

        String[] allErrs = err.split(",");

        for (int i = 0; i < allErrs.length; i++) { // UserMissingError

            ErrorEnum error = ErrorEnum.valueOf(allErrs[i]); // valueOf : goes into ErrorEnum and find the respective object and return.

            switch (error) {
                case UserMissingError: {
                    String expectedError = error.getMessage(); // coming from feature file & enum
                    // ActualError from UI // driver.findElement(By.xpath(""));
                    // Assert.asserEqual(expectedError, actualError);
                }
                break;

                case PasswordMissingError: {
                    String expectedError = error.getMessage();  // coming from feature file & enum
                    // ActualError from UI
                    // Assert.asserEqual(expectedError, actualError);
                }
                break;
            }
        }
    }

}
