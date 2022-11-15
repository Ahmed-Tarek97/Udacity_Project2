package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {
    public WebElement registerlink()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }
    public WebElement registerGenderSelect()
    {
        return Hooks.driver.findElement(By.id("gender-male"));
        //return Hooks.driver.findElement(By.id("gender-female"));
    }
    public WebElement registerFirstName()
    {
        return Hooks.driver.findElement(By.id("FirstName"));
    }
    public WebElement registerLastName()
    {
        return Hooks.driver.findElement(By.id("LastName"));
    }
    public WebElement registerBirthDateDay()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }
    public WebElement registerBirthDateMonth()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }
    public WebElement registerBirthDateYear()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }
    public WebElement registerEmail()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement registerPassword()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement registerPasswordConfirmation()
    {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement registerRegisterButton()
    {
        return Hooks.driver.findElement(By.id("register-button"));
    }
    public WebElement registerSucceededMessage()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]"));
    }
}