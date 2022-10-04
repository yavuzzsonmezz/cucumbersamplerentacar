package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="//a[@href='/login']")

    public WebElement login;

    @FindBy(xpath="//input[@id='formBasicEmail']")

    public WebElement email;

    @FindBy(xpath="//input[@id='formBasicPassword']\n")

    public WebElement password;

    @FindBy(xpath="//button[@type='submit']")

    public WebElement loginsubmit;


}
