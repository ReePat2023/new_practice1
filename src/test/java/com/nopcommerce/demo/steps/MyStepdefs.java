package com.nopcommerce.demo.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class MyStepdefs {
    @Given("User navigates to the facebook website")
    public void userNavigatesToTheFacebookWebsite() {
    }

    @When("user validates the homepage title")
    public void userValidatesTheHomepageTitle() {
    }

    @Then("user enters {string} username")
    public void userEntersUsername(String arg0) {
    }

    @And("user enters {string} password")
    public void userEntersPassword(String arg0) {
    }

    @And("user validates captcha image")
    public void userValidatesCaptchaImage() {
    }

    @And("user enters firstname and lastname")
    public void userEntersFirstnameAndLastname(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists();
        System.out.println("First name is " +data.get(0).get(0)+ " Lastname is " + data.get(0).get(1));
        System.out.println("First name is " +data.get(1).get(0)+ " Lastname is " + data.get(1).get(1));
    }

    @And("user clocks on the sign in button")
    public void userClocksOnTheSignInButton() {
    }
}
