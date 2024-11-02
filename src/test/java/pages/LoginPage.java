
package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    public String loginPageURL = "https://ahsan.com.bd/customer/login/";
    public By email = By.xpath("//input[@id='username']");
    public By password = By.xpath("//input[@id='password']");
    public By loginButton = By.xpath("//button[@id='LoginSubmit']");
    public By error = By.xpath("//p[@class='alert alert-danger']");

    public void doLogin(String email_text, String password_text){
        writeOnElement(email, email_text);
        writeOnElement(password, password_text);
        clickOnElement(loginButton);
    }
}

