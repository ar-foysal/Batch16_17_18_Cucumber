package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.ProductPage;

import static org.testng.Assert.assertEquals;
import static utilities.DriverSetup.getDriver;

public class LoginStep {
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        getDriver().get(loginPage.login_page_url);
    }

    @When("user input valid username and password")
    public void userInputValidUsernameAndPassword() {
        loginPage.writeOnByLocator(loginPage.username_input_field, "standard_user");
        loginPage.writeOnByLocator(loginPage.password_input_field, "secret_sauce");
    }

    @And("user click on the login button")
    public void userClickOnTheLoginButton() {
        loginPage.clickOnAElement(loginPage.login_button);
    }

    @Then("user successfully logged in")
    public void userSuccessfullyLoggedIn() {
        assertEquals(getDriver().getCurrentUrl(), productPage.product_page_url);
    }
}
