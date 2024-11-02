package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.CheckOutPage;
import pages.HomePage;
import utilities.DriverSetUp;

public class CheckOutStep extends DriverSetUp {
    HomePage homePage = new HomePage();
    CheckOutPage checkOutPage = new CheckOutPage();

    @When("User hover on the book dropdown menu")
    public void user_hover_on_the_book_dropdown_menu() {
        checkOutPage.hover(checkOutPage.book);
    }
    @When("User hover on the literature & poetry")
    public void user_hover_on_the_literature_poetry() {
        checkOutPage.hover(checkOutPage.bookOption);
    }
    @When("User is to select the uponnash")
    public void user_is_to_select_the_uponnash() {
        checkOutPage.clickOnElement(checkOutPage.uponnash);
    }
    @When("User scroll down to the book")
    public void user_scroll_down_to_the_book() {
        checkOutPage.scrollElement(By.xpath("//a[contains(text(),'সাদা কাগজ')]"));
    }
    @When("User click on the selected book")
    public void user_click_on_the_selected_book() {
        checkOutPage.clickOnElement(checkOutPage.sadaKagoj);
    }

    @When("User click on the Order button")
    public void user_click_on_the_order_button() {
        checkOutPage.clickOnElement(checkOutPage.orderBtn);
    }
    @Then("User enters the Name")
    public void user_enters_the_Name() {
        checkOutPage.writeOnElement(checkOutPage.personName,"test");
    }
    @Then("User enters Mobile Number")
    public void user_enters_mobile_number() {
        checkOutPage.writeOnElement(checkOutPage.mobileNumber,"01875962324");
    }
    @Then("User inputs Delivery Address")
    public void user_inputs_delivery_address() {
        checkOutPage.writeOnElement(checkOutPage.deliveryAddress,"It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.");
    }
    @Then("User inputs Delivery Area")
    public void user_inputs_delivery_area() {
        checkOutPage.scrollElement(By.xpath("//span//label[@for='flexRadioDefault1']"));
        checkOutPage.clickOnElement(checkOutPage.deliveryOption);
    }
    @Then("User click on the Confirm Order button")
    public void user_click_on_the_confirm_order_button() {
        checkOutPage.clickOnElement(checkOutPage.confirmBtn);
        Assert.assertTrue(getDriver().findElement(By.xpath("//h2[normalize-space()='Order Successfull']")).isDisplayed(),"Order Successfull");
    }

}
