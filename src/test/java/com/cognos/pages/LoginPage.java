package com.cognos.pages;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends PageObject {

    @FindBy(xpath = "//input[@id='user-name']")
    WebElement userId;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//input[@id='login-button']")
    WebElement loginenter;

    @Step
    public void openpage(){
        open();

    }
    @Step
    public void userID(){
        userId.click();
        userId.sendKeys("standard_user");

    }

    @Step
    public void returnPassword(){
        password.click();
        password.sendKeys("secret_sauce");
    }

    @Step
    public void loginenter(){
        loginenter.click();

    }
    @Step
    public String validate(){
        WebElement validation=$("//div[@class='product_label']");
        String name=validation.getText();
        return name;
    }

}
