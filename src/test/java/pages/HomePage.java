package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

    public String homePageUrl = "https://ahsan.com.bd/";
    public By wish = By.cssSelector(".fa.fa-heart-o");
//    public By wish = By.xpath("//div[@class='wishlistforViewPage']//i[@class='fa fa-heart-o']");
    public By searchField = By.xpath("//input[@id='txt_search_box']");
    public By searchBtn = By.xpath("//div[@id='hideForMobileMenu']//button[@id='search_button']");
    public By selectBook = By.xpath("//a[contains(text(),'ঈদে মিলাদুন্নবী')]");
    public By reviews = By.xpath("//a[@id='Reviews-tab']");

    public By shoppingCart = By.xpath("//div[@class='fixed_card_tem_display']");
    public By shoppingBag = By.xpath("//a[@class='shopping_bag']");
    public By shoppingCartClose = By.xpath("//span[@class='CloseBtn']//i[@class='fa fa-times']");
    public By shoppingContinue = By.xpath("//a[normalize-space()='Continue To Shopping']");
    public By item = By.xpath("//div[@class='owl-item cloned active']//a[contains(text(),'সাদা পায়জামা')]");

    public By wishList = By.xpath("//img[@src='/static/publisher_app/images/love.png']");
    public By contact = By.xpath("//a[normalize-space()='Contact Us']");
    public By name = By.xpath("//div[@class='contact_form']//div[1]//input[1]");
    public By email = By.xpath("//div[@class='col-sm-5']//div[2]//input[1]");
    public By subject = By.xpath("//input[@type='email']");
    public By speech = By.xpath("//textarea[@class='form-control']");
    public By sendBtn = By.xpath("//button[contains(text(),'বার্তা পাঠান')]");
    public By cartItemCount = By.id("wishlist_items");
    public By book = By.xpath("//div[@class='owl-item active']//a[contains(text(),'দোয়া ডোর বেল')]");

//    public By shippingCart = By.xpath("//a[@class='cart_box']//span[@id='wishlist_items']");

    public String getCurrentCartItemCount(){
        return getElementText(cartItemCount);
    }



}
