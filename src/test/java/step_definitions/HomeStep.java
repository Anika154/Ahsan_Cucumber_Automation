package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.HomePage;
import utilities.DriverSetUp;

public class HomeStep extends DriverSetUp {
    HomePage homePage = new HomePage();

    @Given("User is on the home page")
    public void user_is_on_the_home_page() {
        getDriver().get(homePage.homePageUrl);
    }
    @When("User scroll down to hover")
    public void user_scroll_down_to_hover() {
        homePage.scrollElement(By.xpath("//div[@class='owl-item active']//a[contains(text(),'দোয়া ডোর বেল')]"));
    }
    @When("User click on the book")
    public void user_click_on_the_book() {
        homePage.clickOnElement(homePage.book);
    }
    @When("User click on the WishList Icon from home")
    public void user_click_on_the_wish_list_icon_from_home() {
        homePage.clickOnElement(homePage.wish);
    }
    @Then("User can check icon")
    public void user_can_check_icon() {
        Assert.assertEquals(homePage.getCurrentCartItemCount(),"1");
    }
    @When("User write on the search field")
    public void user_write_on_the_search_field() {
        homePage.writeOnElement(homePage.searchField,"ড. খোন্দকার আব্দুল্লাহ জাহাঙ্গীর");
    }
    @When("User click on the searchBtn")
    public void user_click_on_the_search_btn() {
        homePage.clickOnElement(homePage.searchBtn);
    }
    @When("User select the book from search list")
    public void user_select_the_book_from_search_list() {
        homePage.clickOnElement(homePage.selectBook);
    }
    @Then("User can view the selected book details")
    public void user_can_view_the_selected_book_details() {
        Assert.assertEquals(getDriver().findElement(By.xpath("//h3[contains(text(),'ঈদে মিলাদুন্নবী')]")).getText(),"ঈদে মিলাদুন্নবী");
    }
    @Then("User can see the reviews")
    public void user_can_see_the_reviews() {
        homePage.clickOnElement(homePage.reviews);
    }
    @When("User click on the Shopping Cart Icon")
    public void user_click_on_the_shopping_cart_icon() {
        homePage.clickOnElement(homePage.shoppingCart);
    }
    @When("User can view the items on the Cart")
    public void user_can_view_the_items_on_the_cart() {
        Assert.assertTrue(getDriver().findElement(By.xpath("//h4[contains(text(),'আপনার শপিং কার্ট')]")).isDisplayed());
    }
    @Then("User click on the Shopping Bag from Cart")
    public void user_click_on_the_shopping_bag_from_cart() {
        homePage.clickOnElement(homePage.shoppingBag);
    }
    @Then("User can close the Cart")
    public void user_can_close_the_cart() {
        homePage.clickOnElement(homePage.shoppingCartClose);
    }
    @Then("User can view the Shopping Cart")
    public void user_can_view_the_shopping_cart() {
        Assert.assertEquals(getDriver().getCurrentUrl(),"https://ahsan.com.bd/my-cart/");
        Assert.assertEquals(getDriver().getTitle(),"My Cart Items");
    }
    @Then("User can click on the Continue to Shopping")
    public void user_can_click_on_the_continue_to_shopping() {
        homePage.clickOnElement(homePage.shoppingContinue);
    }
//    @Then("User scroll down to hover")
//    public void user_scroll_down_to_hover() {
//        homePage.scrollElement(By.xpath("//h4[contains(text(),'অন্যান্য আইটেম')]"));
//    }
    @Then("User hover on the book")
    public void user_hover_on_the_book() {
        homePage.hover(homePage.item);
    }
    @When("User click on the WishList Icon")
    public void user_click_on_the_wish_list_icon() {
        homePage.clickOnElement(homePage.wishList);
    }
    @Then("User can view the items on the WishList")
    public void user_can_view_the_items_on_the_wish_list() {
        Assert.assertEquals(getDriver().getTitle(),"Wish List Book");
    }
    @When("User scroll down to the page")
    public void user_scroll_down_to_the_page() {
        homePage.scrollElement(By.xpath("//div[@class='main_footer webres']"));
    }
    @When("User can click on the Contact Us from footer")
    public void user_can_click_on_the_contact_us_from_footer() {
        homePage.clickOnElement(homePage.contact);
    }
    @Then("User can view the Contact page")
    public void user_can_view_the_contact_page() {
        Assert.assertEquals(getDriver().getCurrentUrl(),"https://ahsan.com.bd/contact-us/");
    }
    @Then("User can input name")
    public void user_can_input_name() {
        homePage.writeOnElement(homePage.name,"Akhil");
    }
    @Then("User can input email")
    public void user_can_input_email() {
        homePage.writeOnElement(homePage.email,"akhil@gmail.com");
    }
    @Then("User can input subject")
    public void user_can_input_subject() {
        homePage.writeOnElement(homePage.subject,"contact");
    }
    @Then("User can input speech")
    public void user_can_input_speech() {
        homePage.writeOnElement(homePage.speech,"There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable.");
    }
    @Then("User can click on the send Button")
    public void user_can_click_on_the_send_button() {
        homePage.clickOnElement(homePage.sendBtn);
    }


}
