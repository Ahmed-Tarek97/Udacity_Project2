package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class P03_homePage {

    private List<WebElement> currenciesList = new ArrayList<WebElement>();

    public WebElement homepageList(){
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }
    public WebElement homepageSelectEuro(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[1]/div/select/option[2]"));
    }

    public List<WebElement> homepageCheckCurrency(){
        

        WebElement firstProduct = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[1]/span"));
        WebElement secondProduct = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[1]/span"));
        WebElement thirdProduct = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[1]/span"));
        WebElement fourthProduct = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[4]/div/div[2]/div[3]/div[1]/span"));

        currenciesList.add(0,firstProduct);
        currenciesList.add(1,secondProduct);
        currenciesList.add(2,thirdProduct);
        currenciesList.add(3,fourthProduct);
        
        return currenciesList;
    }
    public void homepageHoverCategory(){
        WebElement category = Hooks.driver.findElement(By.linkText("Computers"));
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(category).perform();
    }

    public WebElement homepageClickSubcategory(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a"));
    }
    public WebElement homepageClickFirstSlider(){
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.invisibilityOf(Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[1]/img"))));
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[1]/img"));
    }
    public WebElement homepageClickSecondSlider(){
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.invisibilityOf(Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[1]/img"))));
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[1]/img"));
    }
    public String homepageURL(){
        return Hooks.driver.getCurrentUrl();
    }

    public WebElement homepageFacebookLogo(){
        return Hooks.driver.findElement(By.linkText("Facebook"));
    }
    public WebElement homepageTwitterLogo(){
        return Hooks.driver.findElement(By.linkText("Twitter"));
    }
    public WebElement homepageRssLogo(){
        return Hooks.driver.findElement(By.linkText("RSS"));
    }
    public WebElement homepageYoutubeLogo(){
        return Hooks.driver.findElement(By.linkText("YouTube"));
    }

    public WebElement homepageProductWishlist(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));
    }

    public WebElement homepageWishlistTab(){
        return Hooks.driver.findElement(By.className("wishlist-label"));
    }
    public WebElement homepageWishlistAddedSucceedMessageColor(){
        return Hooks.driver.findElement(By.xpath("/html/body/div[5]/div/p"));
    }
    public WebElement homepageWishlistAddedSucceedMessageBackgroundColor(){
        return Hooks.driver.findElement(By.className("bar-notification"));
    }
    public WebElement searchKeyword(){
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement searchClickSearchButton(){
        return Hooks.driver.findElement(By.className("button-1"));
    }
    public String searchURL(){
        return Hooks.driver.getCurrentUrl();
    }
}