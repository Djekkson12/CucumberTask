package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.Abstract;
import util.Driver;

import static util.Driver.getDriver;


public class OpenCartPage extends Abstract {

    public static void EnterLogin(String username) {
        getDriver().findElement(By.id("input-email")).sendKeys(username);
    }

    public static void EnterPassword(String password) {
        getDriver().findElement(By.id("input-password")).sendKeys(password);
    }
}



