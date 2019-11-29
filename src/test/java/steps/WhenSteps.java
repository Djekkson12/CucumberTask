package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.OpenCartLoginPage;
import pages.OpenCartPage;


public class WhenSteps {


    @And("^User provides username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void iProvideUsernameAsAndPasswordAs(String username, String password) throws Exception {
        OpenCartPage.EnterLogin(username);
        OpenCartPage.EnterPassword(password);

    }

    @When("^User clicks on login button$")
    public void iClickOnLoginButton() throws Throwable {
        OpenCartLoginPage.pressLoginButton();
        OpenCartLoginPage.MyAccountAssertCheck();

    }


}
