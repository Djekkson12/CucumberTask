package steps;

import cucumber.api.java.en.Given;
import pages.OpenCartPage;

public class GivenSteps {


    @Given("^User opens Chrome browser on Login page$")
    public void UserOpensChromeBrowser() {
        OpenCartPage.initialisePage();

    }

}
