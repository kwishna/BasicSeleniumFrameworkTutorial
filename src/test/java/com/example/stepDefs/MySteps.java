package com.example.stepDefs;

import com.examples.pages.MyPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MySteps {
    @Given("I navigate to home page")
    public void i_navigate_to_home_page() {
        System.out.println("I navigate to home page");
    }

    @When("I fill the form {string}, {string}")
    public void i_fill_the_form(String username, String password) {
        MyPage pg = new MyPage();
        pg.enter_username(username);
        pg.enter_password(password);
    }

    @Then("I get error {string}")
    public void i_get_error(String error) { // "UserMissingError, PasswordMissingError"
        MyPage pg = new MyPage();
        pg.verify_error(error);
    }
}
