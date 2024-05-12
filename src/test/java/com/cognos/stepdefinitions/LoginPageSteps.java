package com.cognos.stepdefinitions;

import com.cognos.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class LoginPageSteps {

    @Steps
    LoginPage page;

    @Given("the user opens the URL")
    public void the_user_opens_the_url() {
        System.out.println("@Given--the user opens the URL\")");
        page.openpage();

    }
    @When("the user enters their USER ID and password")
    public void the_user_enters_their_user_id_and_password() {
        System.out.println("@When--the user enters their USER ID and password\")");
        page.userID();
        page.returnPassword();

    }
    @When("clicks on the submit button")
    public void clicks_on_the_submit_button() {
        System.out.println("@When--clicks on the submit button\")");
        page.loginenter();

    }
    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        System.out.println("@Then--the user should be logged in successfully\")");
        String name = page.validate();


    }
}
