package pages;

import org.openqa.selenium.By;

public class PackagePage extends BasePage{
    public String packageURL = "https://ahsan.com.bd/book/category/18/offer-campain/";
    public By book = By.xpath("//a[contains(text(),'নিজে বাঁচুন পরিবার বাঁচান')]");
    public By BookTypesCheckbox = By.xpath("//input[@id='publisher_1']");
    public By bookTypes = By.xpath("//a[contains(text(),'দারুস সালাম বাংলাদেশ')]");
    public By selectBook = By.xpath("//a[contains(text(),'গল্পে গল্পে ওমর বিন আব্দুল আযীয রহ')]");
    public By AuthorsCheckbox = By.xpath("//input[@id='writer_5']");
    public By author = By.xpath("//a[contains(text(),'আয়মান সাদিক')]");
    public By authorsDetails = By.xpath("//button[@id='read_more_button']");
    public By categoryCheckBox = By.xpath("//input[@id='category_17']");
    public By packages = By.xpath("//div[4]//div[1]//p[12]//label[1]//a[1]");
    public By selectPackage = By.xpath("//a[contains(text(),'ডা. জাকির নায়েক ও উনার শিক্ষক আহমেদ দিদাত রচিত ৭টি')]");



}
