package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    public WebElement loginlink()
    {
        return Hooks.driver.findElement(By.className("ico-login"));
    }
    public WebElement loginEmail()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement loginPassword()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement loginButton()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
    }
    public String loginURL()
    {
        return Hooks.driver.getCurrentUrl();
    }
    public WebElement loginMyAccount()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
    }
    public WebElement loginErrorMessage()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]"));
    }
}