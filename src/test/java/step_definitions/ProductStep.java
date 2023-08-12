package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;
import pages.ProductPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static utilities.DriverSetup.getDriver;

public class ProductStep {
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();
    @Given("user logged in with {string} {string}")
    public void userLoggedInWith(String username, String password) {
        getDriver().get(loginPage.login_page_url);
        loginPage.writeOnByLocator(loginPage.username_input_field, username);
        loginPage.writeOnByLocator(loginPage.password_input_field, password);
        loginPage.clickOnAElement(loginPage.login_button);
    }
    @Then("user should see product page url")
    public void user_should_see_product_page_url() {
        assertEquals(getDriver().getCurrentUrl(),productPage.product_page_url);
    }

}
