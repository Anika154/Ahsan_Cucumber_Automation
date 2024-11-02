package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;

public class CheckOutPage extends BasePage{
    public By book = By.xpath("//a[contains(text(),'বই')]");
    public By bookOption = By.xpath("//a[@href='/book/category/4/sahitto-and-kobita'][contains(text(),'সাহিত্য ও কবিতা')]"); //iframe custom locator
    public By uponnash = By.xpath("//a[@href='/book/subcategory/275/উপন্যাস/'][contains(text(),'উপন্যাস')]");
    public By sadaKagoj = By.xpath("//a[contains(text(),'সাদা কাগজ')]");
    public By orderBtn = By.xpath("//a[@id='ordernowUrl']");
    public By personName = By.xpath("//input[@placeholder='Full Name (English)']");
    public By mobileNumber = By.xpath("//input[@id='mobile_number']");
    public By deliveryAddress = By.xpath("//textarea[@id='delivery_address']");
    public By deliveryOption = By.xpath("//input[@id='insideDhaka']");
    public By confirmBtn = By.xpath("//input[@id='confirm_order']");
//    public By bookHover = By.xpath("");
//    public By bookInfo = By.xpath("//a[contains(text(),'বই সম্পর্কিত তথ্য')]");
    //a[@href='/book/category/4/sahitto-and-kobita'][contains(text(),'সাহিত্য ও কবিতা')]
//    public By option = By.xpath("//a[@href='/book/writter-list/'][contains(text(),'লেখক')]");
//    public By selectWriter = By.xpath("//center[contains(text(),'আসিফ আদনান')]");
//    public By aynaGhor = By.xpath("//a[contains(text(),'আয়নাঘর')]");

//    public By deliveryAddress = By.xpath("//textarea[@id='delivery_address']");



}
