package steps;

import org.openqa.selenium.support.PageFactory;
import pages.OpenCartLoginPage;
import pages.OpenCartPage;
import util.Driver;

public class Abstract {

    public static void initialisePage() {
        Driver.getDriver().get(Driver.getProperty("login.url"));
        PageFactory.initElements(Driver.getDriver(), OpenCartPage.class);
        PageFactory.initElements(Driver.getDriver(), OpenCartLoginPage.class);

    }
}
