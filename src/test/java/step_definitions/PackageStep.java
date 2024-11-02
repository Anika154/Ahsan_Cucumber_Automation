package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pages.PackagePage;
import utilities.DriverSetUp;

public class PackageStep extends DriverSetUp {
    PackagePage packagePage = new PackagePage();

    @Given("User is on the package page")
    public void user_is_on_the_package_page() {
        getDriver().get(packagePage.packageURL);
        Assert.assertEquals(getDriver().findElement(By.xpath("//h4[contains(text(),'ফ্ল্যাশ সেল')]")).getText(),"ফ্ল্যাশ সেল");
    }
    @When("User select the book")
    public void user_select_the_book() {
        packagePage.clickOnElement(packagePage.book);
    }

    @When("User scroll to the details")
    public void user_scroll_to_the_details() {
        packagePage.scrollElement(By.xpath("//h4[normalize-space()='Similar Category Best Selling Books']"));
    }

    @Then("User view the book details")
    public void user_view_the_book_details() {
        Assert.assertEquals(getDriver().getTitle(),"View Details || নিজে বাঁচুন পরিবার বাঁচান");
    }

    @When("User click on the BookTypes checkBox")
    public void user_click_on_the_check_box() {
       packagePage.clickOnElement(packagePage.BookTypesCheckbox);
    }
    @When("User click on the selected Book Types")
    public void user_click_on_the_selected_book_types() {
        packagePage.clickOnElement(packagePage.bookTypes);
    }
    @When("User select any book")
    public void user_select_any_book() {
       packagePage.clickOnElement(packagePage.selectBook);
    }
    @Then("User view the selected book details")
    public void user_view_the_selected_book_details() {
        Assert.assertEquals(getDriver().getTitle(),"View Details || গল্পে গল্পে ওমর বিন আব্দুল আযীয রহ");
        //গল্পে গল্পে ওমর বিন আব্দুল আযীয রহ কেমন ছিলেন রাসূলুল্লাহ (সা.)

    }
    @When("User click on the Authors checkBox")
    public void user_click_on_the_authors_check_box() {
        packagePage.clickOnElement(packagePage.AuthorsCheckbox);
    }
    @When("User click on the selected Authors")
    public void user_click_on_the_selected_authors() {
       packagePage.clickOnElement(packagePage.author);
    }

    @Then("User view the selected authors details")
    public void user_view_the_selected_authors_details() {
        packagePage.clickOnElement(packagePage.authorsDetails);
    }
    @When("User click on the categories checkBox")
    public void user_click_on_the_categories_check_box() {
        packagePage.clickOnElement(packagePage.categoryCheckBox);
    }
    @When("User click on the package")
    public void user_click_on_the_package() {
        packagePage.clickOnElement(packagePage.packages);
    }
    @Then("User select the packageBook")
    public void user_select_the_package_book() {
       packagePage.clickOnElement(packagePage.selectPackage);
    }
    @Then("User scroll down to the page and view details")
    public void user_scroll_down_to_the_page_and_view_details() {
        packagePage.scrollElement(By.xpath("//h4[normalize-space()='Similar Category Best Selling Books']"));
    }



}
