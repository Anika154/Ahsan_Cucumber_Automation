package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.LoginPage;
import utilities.DriverSetUp;

public class LoginStep extends DriverSetUp {
    LoginPage demoLoginPage = new LoginPage();

    @Given("User is on the login page")
    public void userIsOnTheLoginPage() {
        getDriver().get(demoLoginPage.loginPageURL);
        Assert.assertEquals(getDriver().getTitle(),"Customer Login");
    }

    @When("User input email {string}")
    public void user_input_email(String email) {
        demoLoginPage.writeOnElement(demoLoginPage.email,email);
    }
    @When("User input password {string}")
    public void user_input_password(String password) {
        demoLoginPage.writeOnElement(demoLoginPage.password,password);
    }

    @When("User click on the login button")
    public void user_click_on_the_login_button() {
        demoLoginPage.clickOnElement(demoLoginPage.loginButton);
    }
    @Then("User successfully logged in")
    public void user_successfully_logged_in() {
        Assert.assertTrue(getDriver().findElement(By.xpath("//div[@class='col-sm-10']//h4[1]")).isDisplayed());
    }
    @Then("User should see the my account page")
    public void user_should_see_the_my_account_page() {
        Assert.assertEquals(getDriver().getCurrentUrl(),"https://ahsan.com.bd/my-account/");
    }
    @Then("User should see the error message {string}")
    public void user_should_see_the_error_message(String errorMsg) {
        Assert.assertEquals(demoLoginPage.getElementText(demoLoginPage.error), errorMsg);
    }



    }
