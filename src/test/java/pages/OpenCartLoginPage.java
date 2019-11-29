package pages;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import steps.Abstract;
import steps.WhenSteps;

import static util.Driver.driver;
import static util.Driver.getDriver;

public class OpenCartLoginPage extends Abstract {


    @FindBy(xpath = "//input[contains(@class, 'btn btn-primary')]")
    private static WebElement pressLoginButon;
    @FindBy(xpath = "//*[@id=\"content\"]/h2[1]")
    private static WebElement MyAccountAssert;


    public static void pressLoginButton() {
        pressLoginButon.click();
    }


    public static void MyAccountAssertCheck() {
        Assert.assertTrue(MyAccountAssert.isDisplayed());
    }


}
